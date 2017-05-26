import java.util.Random;

public class Mapa {
	private Random numeros 			= new Random();
	public static Sala salas[] 	= new Sala[20];
	public Jogador player;

	public Mapa(){

		for(int i = 0; i<20; i++){
			salas[i] = new Sala(i);
		}

		criaPocoes(10);
		criaMachados(20);
		criaTesouros(150);
		criaMapaEstatico();
		criaChavesPortasTrancadas();

		player = new Jogador(salas[0].portas[2]);
	}

	private void criaTesouros(int quantidade){
		for(int i = 0; i < quantidade ;i++){
			int salaRandomica = numeros.nextInt(20);
			salas[salaRandomica].adicionaOuro(10);
			salaRandomica = numeros.nextInt(20);
			salas[salaRandomica].adicionaDiamante(1);
		}
	}

	private void criaMachados(int quantidade){
		for(int i = 0; i < quantidade ;i++){
			int salaRandomica = numeros.nextInt(20);
			Machado machado 	= new Machado();
			salas[salaRandomica].adicionaItens(machado);
		}
	}

	private void criaPocoes(int quantidade){
		for(int i = 0; i < quantidade ;i++){
			int salaRandomica = numeros.nextInt(20);
			Pocao pocao 			= new Pocao();
			salas[salaRandomica].adicionaItens(pocao);
		}
	}

	public void criaChavesPortasTrancadas(){
		salas[0].trancaPorta(0);salas[6].trancaPorta(0);
		salas[7].trancaPorta(0);salas[8].trancaPorta(0);
		salas[13].trancaPorta(0);salas[17].trancaPorta(0);

		int indices[] = {2,5,7,12,13,16};

		for(int i = 0; i < 6; i++){
			Chave chave = new Chave();
			salas[(indices[i]-1)].adicionaItens(chave);
		}
	}

	private void criaMapaEstatico(){
		salas[0].portas[0].setParaQualSala(6);
		salas[0].portas[1].setParaQualSala(2);
		salas[0].portas[2].setParaQualSala(1);
		salas[1].portas[0].setParaQualSala(1);
		salas[1].portas[1].setParaQualSala(3);
		salas[2].portas[0].setParaQualSala(2);
		salas[2].portas[1].setParaQualSala(8);
		salas[3].portas[0].setParaQualSala(21);
		salas[3].portas[1].setParaQualSala(5);
		salas[4].portas[0].setParaQualSala(10);
		salas[4].portas[1].setParaQualSala(4);
		salas[5].portas[0].setParaQualSala(1);
		salas[5].portas[1].setParaQualSala(7);
		salas[6].portas[0].setParaQualSala(12);
		salas[6].portas[1].setParaQualSala(6);
		salas[7].portas[0].setParaQualSala(13);
		salas[7].portas[1].setParaQualSala(3);
		salas[8].portas[0].setParaQualSala(10);
		salas[9].portas[0].setParaQualSala(9);
		salas[9].portas[1].setParaQualSala(15);
		salas[9].portas[2].setParaQualSala(5);
		salas[10].portas[0].setParaQualSala(12);
		salas[10].portas[1].setParaQualSala(16);
		salas[11].portas[0].setParaQualSala(11);
		salas[11].portas[1].setParaQualSala(7);
		salas[11].portas[2].setParaQualSala(13);
		salas[12].portas[0].setParaQualSala(12);
		salas[12].portas[1].setParaQualSala(8);
		salas[13].portas[0].setParaQualSala(15);
		salas[13].portas[1].setParaQualSala(19);
		salas[14].portas[0].setParaQualSala(14);
		salas[14].portas[1].setParaQualSala(10);
		salas[14].portas[2].setParaQualSala(20);
		salas[15].portas[0].setParaQualSala(11);
		salas[15].portas[1].setParaQualSala(17);
		salas[16].portas[0].setParaQualSala(16);
		salas[16].portas[1].setParaQualSala(18);
		salas[17].portas[0].setParaQualSala(19);
		salas[17].portas[1].setParaQualSala(17);
		salas[18].portas[0].setParaQualSala(14);
		salas[18].portas[1].setParaQualSala(18);
		salas[19].portas[0].setParaQualSala(15);
	}
}
