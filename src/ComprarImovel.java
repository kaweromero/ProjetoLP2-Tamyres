
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

	
	public void opcoesDeCompra(){
		System.out.println("-------- Sistema de buscas refinadas -------");
		System.out.println("1. Busca por preço");//To do
		System.out.println("2. Busca por numero de quartos do imovel");//Feito!
		System.out.println("3. Busca por area do imovel");//Feito!
		System.out.println("4. Busca por tipo de imovel");//Feito!
		System.out.println("5. Busca por vagas de garagem");//To do
		System.out.println("6. Sair");//Feito!
		
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
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
		
		}
	}
	
	

	public void buscarPorPreco() {// Busca imoveis com o valor máximo inserido
		// FAIXA DE PREÇO
		Scanner valor = new Scanner(System.in);

		if (ProjetoLp2.DadosImoveis.isEmpty() == false) {

			System.out.println("Digite o valor máximo do imovel que você quer adquirir: ");
			long valorMax;
			valorMax = valor.nextLong();

			// Acessa TODOS os imoveis
			for (int index = 0; index < ProjetoLp2.DadosImoveis.size(); index++) {

				if (ProjetoLp2.DadosImoveis.get(index).getPreco() <= valorMax) {

					ProjetoLp2.DadosImoveis.get(index).mostrarImovel();
				}

			}

		} else {
			System.out.println("Não tem imoveis a venda!!");
		}

		opcoesDeCompra();
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
		
		opcoesDeCompra();
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

		opcoesDeCompra();

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

		opcoesDeCompra();

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

		opcoesDeCompra();
	}
}