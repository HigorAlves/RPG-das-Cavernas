public class Jogo {
	public static final Machado MACHADO = new Machado();
	public static final Pocao 	POCAO 	= new Pocao();
	public static final Chave 	CHAVE 	= new Chave();
	private enum comando{
		moveTo, view, pickUp, drop, trowAxe, exit, quit
	}
	private enum portas{
		A, B, C
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		Comandos comandos = new Comandos();		
		String acao[] = {"view",""};
		
		while(mapa.player.getNaSala() != 20 && !acao[0].equals("quit")){
			acao = comandos.leituraDoTeclado();
			/*
			 * Mover para proxima sala
			 */
            if(acao[0].equals(comando.moveTo.name())){
				if(acao[1].toUpperCase().equals(portas.A.name())){
					comandos.moveTo(mapa.player, mapa.salas[mapa.player.getNaSala()].portas[portas.A.ordinal()]);
				}else 
					if(acao[1].toUpperCase().equals(portas.B.name())){
					comandos.moveTo(mapa.player, mapa.salas[mapa.player.getNaSala()].portas[portas.B.ordinal()]);
				}else 
					if(acao[1].toUpperCase().equals(portas.C.name())){
					comandos.moveTo(mapa.player, mapa.salas[mapa.player.getNaSala()].portas[portas.C.ordinal()]);
				}else{
					if(acao[1].equals("gold")){
						acao[1] = "ouro";
					}
					comandos.moveTo(mapa.player, mapa.salas[mapa.player.getNaSala()].getItem(acao[1]));
				}
				/*
				 * Visualizar a sala
				 * Pegar o item
				 * Tacar o machado
				 * Sair da sala
				 * Sair do jogo
				 */
			}else 
                if(acao[0].equals(comando.view.name())){
				comandos.view(mapa.player, mapa.salas[mapa.player.getNaSala()]);
			}else 
				if(acao[0].equals(comando.pickUp.name())){	
				comandos.pickUp(mapa.player, mapa.player.getProximoAOque(), mapa.salas[mapa.player.getNaSala()]);
			}else 
				if(acao[0].equals(comando.drop.name())){
				comandos.drop(mapa.player, acao[1]);
			}else 
				if(acao[0].equals(comando.trowAxe.name())){
				System.out.println("Tacou");
			}else 
				if(acao[0].equals(comando.exit.name())){
				comandos.exit(mapa.player);
			}else 
				if(acao[0].equals(comando.quit.name())){
				System.out.println("Você desistiu do jogo.");
			}else{
				System.out.println("Ops... Esse comando não existe.");
			}
		}
	}

}