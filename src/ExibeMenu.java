
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class ExibeMenu {

	public void escolheOpcao() {
		
		//Menus pra escolher
		System.out.println("1. Comprar Imóvel");//To do
		System.out.println("2. Vender Imóvel");//Feito!
		System.out.println("3. Alugar Imóvel Próprio (Locador)");//Feito!
		System.out.println("4. Alugar Imóvel de Terceiros (Inquilino)");//Feito!
		System.out.println("5. Histórico de Operações");//To do
		System.out.println("6. Sair");//Feito!
	
		int opcao;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a opção desejada: ");
		opcao = in.nextInt();
		switch (opcao) {
		case 1:
			//Depoissss
			break;
		case 2:
			//Cria um novo imovel e joga na tela as opções de venda
			Imovel novoImovel = new Imovel();
			novoImovel.dadosImovel();
			//Cadastra na venda de imoveis
			ProjetoLp2.DadosImoveis.put(novoImovel.getProprietario(), novoImovel);
			break;
			
		case 3:
			//Ja entra com seu nome de usuario como proprietario;
			ImovelAluguel novoImovelAluguel = new ImovelAluguel();
			novoImovelAluguel.dadosImovel(true);
			//Insere o novo imovel na tabela de imoveis alugados yay
			ProjetoLp2.DadosAlugados.put(novoImovelAluguel.getProprietario(), novoImovelAluguel);
			break;
		case 4:
			
			ImovelAluguel novoImovelAluguel2 = new ImovelAluguel();
			novoImovelAluguel2.dadosImovel(false);
			break;
		case 5:
			
			//HistoricoDeOperacoes();
			break;
		case 6:
			System.out.println("O Sistema está sendo encerrado... Volte Sempre!");
			//Encerra a Thread
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida, tente novamente.");

		}
	}
}
