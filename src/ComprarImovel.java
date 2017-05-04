
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author tamyr
 */
public class ComprarImovel {

	public void opcoesDeCompra() {
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
			buscarPorPreco();
			break;
		case 2:

			buscarPorComodos();
			break;
		case 3:

			buscarPorArea();
			break;
		case 4:

			buscarPorTipo();
			break;
		case 5:
			buscarPorGaragem();
			break;
		case 6:
			
			//VOLTA PRA OUTRO MENU

		}
	}

	// Vai comprar as coisas tudo
	public void efetuarCompra() {
		System.out.println("Deseja comprar algum desses imóveis? ");
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
				ProjetoLp2.Dados.get(Usuario.getLogin()).addImovel(ProjetoLp2.DadosImoveis.get(cod));

				// Remove da lista de imoveis a venda
				ProjetoLp2.DadosImoveis.remove(cod);
				System.out.println("Imovel comprado com çucessu!");
				
				//Volta para o menu principal
				ExibeMenu menu = new ExibeMenu();
				menu.escolheOpcao();

			} catch (Exception e) {

				System.out.println("Verifique se o código foi digitado corretamente!!");
				opcoesDeCompra();
			}

			break;
		case 2:
			//Volta para o menu principal
			opcoesDeCompra();
			break;
		}

	}

	public void buscarPorPreco() {// Busca imoveis com o valor máximo inserido
		// FAIXA DE PREÇO
		Scanner valor = new Scanner(System.in);

		//Testa para ver se tem imovel a venda
		if (ProjetoLp2.DadosImoveis.isEmpty() == false) {

			System.out.println("Digite o valor máximo do imovel que você quer adquirir: ");
			long valorMax;
			valorMax = valor.nextLong();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosImoveis.size(); index++) {

				if (ProjetoLp2.DadosImoveis.get(index).getPreco() <= valorMax) {
					//Mostra somente os imoveis que estão na condição acima e mostra seu CODIGO para usar na compra
					//O código é o a posição do imovel no ArrayList... Ei, isso não é trapaça U_U
					System.out.print("Código Imóvel: " + index);
					ProjetoLp2.DadosImoveis.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis a venda!!");
		}
		//Vai para o método "efetuarCompra"
		efetuarCompra();
		// opcoesDeCompra();
	}

	public void buscarPorComodos() {// Busca imoveis por numero de quartos
		// COMODOS
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.DadosImoveis.isEmpty() == false) {

			System.out.println("Digite o numero de quartos do imovel que você quer adquirir: ");
			int valorQuartos;
			valorQuartos = valor.nextInt();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosImoveis.size(); index++) {

				if (ProjetoLp2.DadosImoveis.get(index).getNumQuartos() == valorQuartos) {

					ProjetoLp2.DadosImoveis.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis a venda!!");
		}
		efetuarCompra();
		// opcoesDeCompra();
	}

	public void buscarPorArea() {// Busca imoveis por sua area
		// AREA
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.DadosImoveis.isEmpty() == false) {

			System.out.println("Digite o valor máximo da área do imovel que você quer adquirir: ");
			int valorArea;
			valorArea = valor.nextInt();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosImoveis.size(); index++) {

				if (ProjetoLp2.DadosImoveis.get(index).getArea() <= valorArea) {

					ProjetoLp2.DadosImoveis.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis a venda!!");
		}

		efetuarCompra();
		//opcoesDeCompra();

	}

	public void buscarPorTipo() {// Busca imoveis pelo seu tipo
		// TIPO
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.DadosImoveis.isEmpty() == false) {

			System.out.println("Digite o tipo do imovel que você quer adquirir: ");
			String tipo;
			tipo = valor.next();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosImoveis.size(); index++) {

				if (ProjetoLp2.DadosImoveis.get(index).getTipo().equals(tipo)) {

					ProjetoLp2.DadosImoveis.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis a venda!!");
		}

		efetuarCompra();
		//opcoesDeCompra();

	}

	public void buscarPorGaragem() {// Busca imoveis por numero de quartos
		// GARAGEM
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.DadosImoveis.isEmpty() == false) {

			System.out.println("Digite o número de vagas do imovel que você quer adquirir: ");
			int valorGaragem;
			valorGaragem = valor.nextInt();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosImoveis.size(); index++) {

				if (ProjetoLp2.DadosImoveis.get(index).getGaragem() == valorGaragem) {

					ProjetoLp2.DadosImoveis.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis a venda!!");
		}

		efetuarCompra();
		//opcoesDeCompra();
	}
}