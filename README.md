# RPG das Cavernas

O objetivo é coletar o maior número de gold e diamante durante o percurso até a saída. Ao ser atingido por um troll, você perde uma poção,
se não houver nenhuma poção vc perde todo o gold e diamante que irá cair na sala em que vc está. Não se pode pegar ouro ou diamante
enquanto haver trolls na sala.

A classe main é o arquivo Jogo.java!

Comandos:
	view		: Visualiza a sala e lista os itens em que o jogador se encontra
	exit		: Sai da sala. Somante acontece quando o jogador está proximo a uma porta
	moveTo <a>	: Move para um objeto <a> listado
	pickUp <b>	: Pega um item <b>. Somente ocorre se o jogador estiver próximo a ele
	drop   <c>	: Larga um objeto <c> da mochila do jogador. Se ele possuir o item
	lock		: Tranca uma porta que o jogador está proximo. Se ele ter uma poção
	trowAxe<d>	: Lança um machado em um troll <d>. Somente se ele estiver na sala
				  Na listagem vai aparecer "Troll NOME_DO_TROLL", <d> é somente NOME_DO_TROLL
	quit		: Sai do jogo sem finalizar o mesmo

Itens:
	-gold
	-diamante
	-machado
	-pocao
	-chave
	-A door
	-B door
	-C door
