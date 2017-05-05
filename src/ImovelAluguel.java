import java.util.Scanner;

public class ImovelAluguel {

	protected String proprietario;
	protected String tipo;
	protected int andar;
	protected double area;
	protected int numQuartos;
	protected int garagem;
	protected String ap = "apartamento";
	protected long preco;

	Scanner in = new Scanner(System.in);
	
  public void opcoesDeAluguel() {
		System.out.println("-------- Sistema de buscas refinadas -------");
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
	
	public void dadosImovel(boolean EhSeu) {

		System.out.println("\nInforme os seguintes dados: ");

		// Se for seu, o seu nome entra direto com proprietario, se não você
		// digita o nome da pessoinha

		if (EhSeu == true) {
			this.proprietario = Usuario.getNome();

		} else {

			System.out.println("\n1. Proprietário: ");
			proprietario = in.nextLine();
		}

		System.out.println("2. Tipo (casa, apartamento, outro): ");
		tipo = in.nextLine();
		if (tipo.equalsIgnoreCase(ap)) {
			System.out.println("    Informe o andar: ");
			andar = in.nextInt();
		}
		System.out.println("3. Área: ");
		area = in.nextDouble();
		System.out.println("4. Número de quartos: ");
		numQuartos = in.nextInt();
		System.out.println("5. Quantidades de vagas na garagem: ");
		garagem = in.nextInt();
		System.out.println("5. Qual o preço do Aluguel: ");
		preco = in.nextInt();
		
		//Volta para o menu principal
		ExibeMenu menu = new ExibeMenu();
		menu.escolheOpcao();

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
			System.out.println("Digite o código do imovel que deseja comprar: ");
			
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

				//Adiciona o imovel na sua conta
				ProjetoLp2.DadosAlugados.get(Usuario.getLogin()).addImovelAluguel(ProjetoLp2.DadosAlugados.get(cod));

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

			System.out.println("Digite o valor máximo do imovel que você quer adquirir: ");
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

					ProjetoLp2.DadosAlugados.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis a venda!!");
		}

		efetuarCompra();
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

					ProjetoLp2.DadosAlugados.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis para alugar!!");
		}

		efetuarAluguel();
		//opcoesDeCompra();
	}


	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getNumQuartos() {
		return numQuartos;
	}

	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}

	public int getGaragem() {
		return garagem;
	}

	public void setGaragem(int garagem) {
		this.garagem = garagem;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public long getPreco() {
		return preco;
	}

	public void setPreco(long preco) {
		this.preco = preco;
	}

	public Scanner getIn() {
		return in;
	}

	public void setIn(Scanner in) {
		this.in = in;
	}

}