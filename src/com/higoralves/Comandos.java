import java.util.Scanner;

public class Comandos {
///Atributos
	public static final Machado MACHADO = new Machado();
	public static final Pocao POCAO = new Pocao();
	public static final Chave CHAVE = new Chave();
	
///Métodos
	public String[] leituraDoTeclado(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Player> ");
		return scan.nextLine().trim().split("\\s+");
	}
	
	public void view(Jogador player, Sala sala){
		player.visualizarASala(sala);
		player.mostraStatus();
	}
	
	public void exit(Jogador player){
		if(player.getProximoAOque() instanceof Porta){
			player.moverParaSala((Porta)player.getProximoAOque());
		}else{
			System.out.println("Você não está proximo a uma porta");
		}
	}
	
	public void moveTo(Jogador player, Object item){
		player.setProximoAOque(item);
	}
	
	public boolean pickUp(Jogador player, Object item, Sala sala){ ///Pega um objeto
		return player.pegaItem(item, sala);
	}
	
	public boolean drop(Jogador player, String item){
		Item itemMochila = player.removeItem(item);
		if(itemMochila != null){
			System.out.println("Largou "+itemMochila.getClass().getName());
			Mapa.salas[player.getNaSala()].adicionaItens(itemMochila);
			return true;
		}else if(item.equals("gold")){
			Mapa.salas[player.getNaSala()].adicionaOuro(player.getGold());
			System.out.println("Largou "+player.getGold()+" ouros");
			player.addGold((-1)*player.getGold());
			return true;
		}
		System.out.println("Não há "+item+" na mochila!");
		return false;
	}
	
	public boolean trowAxe(Jogador player, String nomeDoTroll){
		Item machado = player.removeItem(MACHADO.getClass().getName());
		if(machado != null){
			System.out.println("Matou o troll "+ nomeDoTroll);
			return true;
		}
		System.out.println("Você não possui machados!!");
		return false;
	}
}
