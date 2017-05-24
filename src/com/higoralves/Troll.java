import java.util.Random;

public class Troll extends Personagem{
///Atributos
	private Random random = new Random();
	
///Metodos
	public Troll(){
		mochila = new Item[1];
	}
	
	public Troll(int sala, Porta porta){
		mochila = new Item[1];
		naSala = sala;
		setProximoAOque(porta);
	}
	
	public void movimentacao(Sala sala, Jogador player){
		if(mochila[0] instanceof Machado && player.getNaSala() == naSala){
			
		}
		if(mochila[0] == null && sala.getItem("Machado") != null){
			if(proximoAOque instanceof Machado){
				pegaItem(sala.getItem("Machado"), sala);
				return;
			}else{
				setProximoAOque(sala.getItem("Machado"));
				return;
			}
		}else{
			if(proximoAOque instanceof Porta){ ///Consertar dpois
				moverParaSala((Porta)proximoAOque);
			}else{
				Porta porta = sala.portas[random.nextInt(3)];
				while(porta.getParaQualSala()!=1){
					porta = sala.portas[random.nextInt(3)];
				}
				setProximoAOque(porta);
			}
		}
	}
	
	public void setProximoAOque(Object proximoAOque) {
		if(proximoAOque instanceof Machado || proximoAOque instanceof Porta){
			super.setProximoAOque(proximoAOque);
		}
	}
	
	public boolean moverParaSala(Porta porta){
		if(porta.getParaQualSala() != 20){
			super.moverParaSala(porta);
			return true;
		}else{
			return false;
		}
	}
	
	public boolean pegaItem(Object item, Sala sala){
		if(item instanceof Machado){
			super.pegaItem(item, sala);
			return true;
		}else{
			return false;
		}
	}
}
