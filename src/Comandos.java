import java.util.Scanner;

@SuppressWarnings("resource")
public class Comandos {
	public static final Machado MACHADO 	= new Machado();
	public static final Pocao 	POCAO 		= new Pocao();
	public static final Chave 	CHAVE 		= new Chave();

	public String[] leituraDoTeclado(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Player: ");
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
			System.out.println("Você não esta proximo a nenhuma porta.");
		}
	}

	public void moveTo(Jogador player, Object item){
		player.setProximoAOque(item);
	}

	public boolean pickUp(Jogador player, Object item, Sala sala){
		return player.pegaItem(item, sala);
	}

	public boolean drop(Jogador player, String item){
		Item itemMochila = player.removeItem(item);
		if(itemMochila != null){
			System.out.println("Dropou " + itemMochila.getClass().getName());
			Mapa.salas[player.getNaSala()].adicionaItens(itemMochila);

			return true;
		}else if(item.equals("gold")){
			Mapa.salas[player.getNaSala()].adicionaOuro(player.getGold());
			System.out.println("Dropou " + player.getGold() + " Ouro(s)");
			player.addGold((-1)*player.getGold());

			return true;
		}
		System.out.println("Você não tem mais " + item + " na mochila!");
		return false;
	}

	public boolean trowAxe(Jogador player, String nomeDoTroll){
		Item machado = player.removeItem(MACHADO.getClass().getName());
		if(machado != null){
			System.out.println("Você matou o"+ nomeDoTroll);
			return true;
		}
		System.out.println("Você não tem machados.");
		return false;
	}
}
