
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class ExibeMenu {

	public void escolheOpcao() {

		// Menus pra escolher
		System.out.println("1. Adquirir Imovel");// DONE!
		System.out.println("2. Vender Imóvel" );// DONE!
		System.out.println("3. Colocar um imóvel para alugar");//DONE!
		System.out.println("4. Alugar um imóvel");// DONE!
		System.out.println("5. Histórico de Operações");// DONE!
		System.out.println("6. Sair");// DONE!

		int opcao;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a opção desejada: ");
		opcao = in.nextInt();
		switch (opcao) {
		case 1:

			// Vai pra o menu de opções de compra (Na classe ComprarImovel)
			ComprarImovel compraImv = new ComprarImovel();
			compraImv.opcoesDeCompra();

			break;
		case 2:
			// Cria um novo imovel e joga na tela as opções de venda
			Imovel novoImovel = new Imovel();
			novoImovel.dadosImovel();

			/*--------------------- Cria um histórico e adiciona o novo imovel que foi criado  -----------------*/
			// Cria um histórico
			Historico historico = new Historico();
			historico.dataAgora();
			historico.setLogin(Usuario.getLogin());

			// O método "ProjetoLp2.DadosAlugados.get(cod)" pega o imovel do
			// arraylist pelo COD e adiciona no historico
			historico.setImovelVendeu(novoImovel);// Aqui é no DadosImoveis

			// ADICIONA O HISTORICO
			ProjetoLp2.Dados.get(Usuario.getLogin()).addHistorico(historico);
			/*--------------------------------------------------------------------------------------------------*/

			// Cadastra na venda de imoveis
			ProjetoLp2.DadosImoveis.add(novoImovel);
			escolheOpcao();

			break;

		case 3:
			// Ja entra com seu nome de usuario como proprietario;
			ImovelAluguel novoImovelAluguel = new ImovelAluguel();
			novoImovelAluguel.dadosImovel();
			// Insere o novo imovel na tabela de imoveis alugados yay
			ProjetoLp2.DadosAlugados.add(novoImovelAluguel);
			escolheOpcao();// Volta para o proprio menu

			break;
		case 4:

			AlugarImovel alugarImv = new AlugarImovel();
			alugarImv.opcoesDeAluguel();

			break;

		case 5:

			// HistoricoDeOperacoes();
			System.out.println(" ------- Mostrando histórico de " + Usuario.getLogin() + " -----------");
			ProjetoLp2.Dados.get(Usuario.getLogin()).mostrarHistórico();

			break;
		case 6:
			System.out.println("O Sistema está sendo encerrado... Volte Sempre!");
			// Encerra a Thread
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida, tente novamente.");

		}
	}
}