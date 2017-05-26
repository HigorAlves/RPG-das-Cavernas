public class Jogador extends Personagem{
	public Jogador(Porta entrada){
		tamanhoMochila = 7;
		mochila 		= new Item[tamanhoMochila];
		mochila[5] 	= new Ouro();
		mochila[6] 	= new Diamante();
		setGold(0);
		setNaSala(0);
		setProximoAOque(entrada);
	}

	public int getGold() {
		return mochila[5].getQuantidade();
	}

	private void setGold(int gold) {
		this.mochila[5].setQuantidade(gold);
	}

	public void addGold(int quantidade){
		int antigo = mochila[5].getQuantidade();
		setGold(quantidade+antigo);
	}

	public int getDiamante() {
		return mochila[6].getQuantidade();
	}

	private void setDiamante(int diamante) {
		this.mochila[6].setQuantidade(diamante);
	}

	public void addDiamante(int quantidade){
		int antigo = mochila[6].getQuantidade();
		setDiamante(quantidade+antigo);
	}

	public boolean moverParaSala(Porta porta){
		if(!porta.isTrancada()){
			if(porta.getParaQualSala() == 20){
				System.out.println("Você conseguiu sair da Dungeon.");
				System.out.println("Ouro: " + getGold());
				System.out.println("Diamante: " + getGold());
				setNaSala(porta.getParaQualSala());
				return true;
			}
			for(int i = 0; i < 3; i++){
				if(Mapa.salas[porta.getParaQualSala()].portas[i].getParaQualSala() == naSala){
					setProximoAOque(Mapa.salas[porta.getParaQualSala()].portas[i]);
				}
			}
			setNaSala(porta.getParaQualSala());
			return true;
		}else{
			for(int i = 0; i<5; i++){
				if(mochila[i] instanceof Chave){
					mochila[i] = null;
					porta.setTrancada(false);
					System.out.println("Você abriu a porta.");
					moverParaSala(porta);
					return true;
				}
			}
			System.out.println("Ops.. Essa porta esta fechada, ache a chave dela.");
		}
		return false;
	}

	public void mostraStatus(){
		int qntMachado = 0;
		int qntPocao = 0;
		int qntChave = 0;
		for(int i = 0; i<5; i++){
			if(mochila[i] instanceof Machado){
				qntMachado++;
			}else
			if(mochila[i] instanceof Pocao){
				qntPocao++;
			}else
			if(mochila[i] instanceof Chave){
				qntChave++;
			}
		}
		System.out.println("Jogador: ");
		System.out.println("Machado(s) " + qntMachado + " | Poção(s) " + qntPocao + " | Chave(s) " + qntChave + " | Ouro" + getGold() + " | Diamante(s) " + getDiamante());
	}

	public boolean pegaItem(Object item, Sala sala){
		if(proximoAOque instanceof Ouro){
			System.out.println("Você pegou " + sala.getOuro() + " Ouro(s)");
			addGold(sala.getOuro());
            sala.setOuro(0);
			return true;
		}else if(proximoAOque instanceof Diamante){
			System.out.println("Você pegou " + sala.getOuro() + " Diamante(s)");
			addDiamante(sala.getDiamante());
            sala.setDiamante(0);
			return true;
		}else if(proximoAOque instanceof Item){
			for(int i = 0; i < 5; i++){
				if (mochila[i] == null){
					Mapa.salas[naSala].itens.remove(proximoAOque);
					mochila[i] = (Item)item;
					System.out.println("Você pegou " + item.getClass().getName().toLowerCase());
					return true;
				}
			}
			System.out.println("Sua mochila esta cheia.");
			return false;
		}else{
			System.out.println("Ops... Não pode pegar este item.");
			return false;
		}
	}

	public Item removeItem(String item){
		for(int i = 0; i < 5; i++){
			if(mochila[i] != null && mochila[i].getClass().getName().toLowerCase().equals(item)){
				Item pegaItem = mochila[i];
				proximoAOque 	= null;
				mochila[i] 		= null;
				return pegaItem;
			}
		}
		return null;
	}

	public void visualizarASala(Sala sala){
		System.out.println("Sala:"+(sala.getId()+1)+" | Ouro: " + sala.getOuro() + " | Diamante(s): " + sala.getDiamante());
		System.out.println();
		System.out.println("\tPortas");
		sala.mostraPortas();
		System.out.println();
		System.out.println("\tItens");
		sala.mostraItem();System.out.println();
	}
}
