import java.util.Scanner;

public class AlugarImovel {
	
	  public void opcoesDeAluguel() {
			System.out.println("-------- Sistema de buscas refinadas para Aluguel -------");
			System.out.println("1. Busca por preço");// To do
			System.out.println("2. Busca por numero de quartos do imovel");// Feito!
			System.out.println("3. Busca por area do imovel");// Feito!
			System.out.println("4. Busca por tipo de imovel");// Feito!
			System.out.println("5. Busca por vagas de garagem");// To do
			System.out.println("6. Sair");// Feito!

			int opcao;
			Scanner in = new Scanner(System.in);
			System.out.println("Digite a opção desejada: ");

			opcao = in.nextInt();
			switch (opcao) {
			case 1:
				buscarPorPreco1();
		
				break;
			case 2:

				buscarPorComodos1();
				break;
			case 3:

				buscarPorArea1();
				break;
			case 4:

				buscarPorTipo1();
				break;
			case 5:
				buscarPorGaragem1();
				break;
			case 6:
				
				//VOLTA PRA OUTRO MENU

			}
		}
	  
	public void efetuarAluguel() {
		
		System.out.println("Deseja alugar algum desses imóveis? ");
		System.out.println("1. Sim");
		System.out.println("2. Não");

		Scanner in = new Scanner(System.in);

		int cod;
		int opcao = in.nextInt();
		switch (opcao) {
		case 1:
			
			System.out.println("Digite o código do imovel que deseja alugar: ");
			
			//Posição do imovel no array
			cod = in.nextInt();

			// Pega a sua conta atraves do login (Na tabela hash), usa o metodo
			// "addImovel" para adicionar na lista da conta o imovel comprado
			try {

				// Teste imovel (Para possiveis "probremas")
				// System.out.println("Teste imovel::
				// "+ProjetoLp2.DadosImoveis.get(cod).getProprietario());
				// System.out.println("Teste Usuario::
				// "+ProjetoLp2.Dados.get(Usuario.getLogin()));

				//Adiciona o imovel alugado na sua conta
				ProjetoLp2.Dados.get(Usuario.getLogin()).addImovelAluguel(ProjetoLp2.DadosAlugados.get(cod));
				
				//Cria um histórico
				Historico historico = new Historico();
				historico.dataAgora();
				historico.setLogin(Usuario.getLogin());
				
				//O método "ProjetoLp2.DadosAlugados.get(cod)" pega o imovel do arrylist pelo COD e adiciona no historico
				historico.setImovelAlugou(ProjetoLp2.DadosAlugados.get(cod));
				
				//ADICIONA O HISTORICO
				ProjetoLp2.Dados.get(Usuario.getLogin()).addHistorico(historico);
				
				// Remove da lista de imoveis a venda
				ProjetoLp2.DadosAlugados.remove(cod);
				System.out.println("Imovel alugado com Sucesso!");
				
				//Volta para o menu principal
				ExibeMenu menu = new ExibeMenu();
				menu.escolheOpcao();

			} catch (Exception e) {

				System.out.println("Verifique se o código foi digitado corretamente!!");
				opcoesDeAluguel();
			}

			break;
		case 2:
			//Volta para o menu principal
			opcoesDeAluguel();
			break;
		}

	}
	
	
	public void buscarPorPreco1() {// Busca imoveis com o valor máximo inserido
		// FAIXA DE PREÇO
		Scanner valor = new Scanner(System.in);

		//Testa para ver se tem imovel a venda
		if (ProjetoLp2.DadosAlugados.isEmpty() == false) {

			System.out.println("Digite o valor máximo do aluguel do imovel que você quer adquirir: ");
			long valorMax;
			valorMax = valor.nextLong();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosAlugados.size(); index++) {

				if (ProjetoLp2.DadosAlugados.get(index).getPreco() <= valorMax) {
					//Mostra somente os imoveis que estão na condição acima e mostra seu CODIGO para usar na compra
					//O código é o a posição do imovel no ArrayList... Ei, isso não é trapaça U_U
					System.out.print("Código Imóvel: " + index);
					ProjetoLp2.DadosAlugados.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis para alugar!!");
		}
		//Vai para o método "efetuarCompra"
		efetuarAluguel();
		// opcoesDeCompra();
	}

	public void buscarPorComodos1() {// Busca imoveis por numero de quartos
		// COMODOS
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.DadosAlugados.isEmpty() == false) {

			System.out.println("Digite o numero de quartos do imovel que você quer adquirir: ");
			int valorQuartos;
			valorQuartos = valor.nextInt();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosAlugados.size(); index++) {

				if (ProjetoLp2.DadosAlugados.get(index).getNumQuartos() == valorQuartos) {
					
					System.out.print("Código Imóvel: " + index);
					ProjetoLp2.DadosAlugados.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis para alugar!!");
		}
		efetuarAluguel();
		// opcoesDeCompra();
	}

	public void buscarPorArea1() {// Busca imoveis por sua area
		// AREA
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.Dados.isEmpty() == false) {

			System.out.println("Digite o valor máximo da área do imovel que você quer adquirir: ");
			int valorArea;
			valorArea = valor.nextInt();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosAlugados.size(); index++) {

				if (ProjetoLp2.DadosAlugados.get(index).getArea() <= valorArea) {

					System.out.print("Código Imóvel: " + index);
					ProjetoLp2.DadosAlugados.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis a venda!!");
		}

		efetuarAluguel();
		//opcoesDeCompra();

	}

	public void buscarPorTipo1() {// Busca imoveis pelo seu tipo
		// TIPO
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.DadosAlugados.isEmpty() == false) {

			System.out.println("Digite o tipo do imovel que você quer adquirir: ");
			String tipo;
			tipo = valor.next();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosAlugados.size(); index++) {

				if (ProjetoLp2.DadosAlugados.get(index).getTipo().equals(tipo)) {

					System.out.print("Código Imóvel: " + index);
					ProjetoLp2.DadosAlugados.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis para alugar!!");
		}

		efetuarAluguel();
		//opcoesDeCompra();

	}

	public void buscarPorGaragem1() {// Busca imoveis por numero de quartos
		// GARAGEM
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.DadosAlugados.isEmpty() == false) {

			System.out.println("Digite o número de vagas do imovel que você quer adquirir: ");
			int valorGaragem;
			valorGaragem = valor.nextInt();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosAlugados.size(); index++) {

				if (ProjetoLp2.DadosAlugados.get(index).getGaragem() == valorGaragem) {

					System.out.print("Código Imóvel: " + index);
					ProjetoLp2.DadosAlugados.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis para alugar!!");
		}

		efetuarAluguel();
		//opcoesDeCompra();
	}
}
