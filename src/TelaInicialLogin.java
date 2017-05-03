/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaInicialLogin {

	protected String nome;
	protected String data;
	protected int idade;
	protected long cpf;
	protected String login;
	protected String senha;

	// List<Conta> cadastro = new ArrayList<Conta>();

	Scanner in = new Scanner(System.in);

	public void telaInicial() {

		System.out.println("\n---------- BEM-VINDO A GIRL POWER ----------");
		System.out.println("\n1. Login \n2. Criar conta");
		System.out.println("\nDigite a opção: ");
		int opcao = in.nextInt();
		switch (opcao) {
		case 1:
			Usuario u = new Usuario();
			u.user();
			//TelaDeApresentacao tela = new TelaDeApresentacao();
			//tela.opcoes();
			break;
		case 2:
			System.out.println("---------- CRIAR CONTA ----------");
			System.out.println("1. Informe o nome: ");
			nome = in.next();
			System.out.println("2. Informe a data de nascimento: ");
			data = in.next();
			System.out.println("3. Informe a idade: ");
			idade = in.nextInt();
			if (idade < 18) {
				System.out.println("Você não tem idade suficiente. Tente novamente daqui há alguns anos!");
			} else {
				System.out.println("4. Informe o cpf: ");
				cpf = in.nextLong();
				System.out.println("5. Informe o login: ");
				login = in.next();
				System.out.println("6. Informe a senha: ");
				senha = in.next();

			}

		}
		Conta cadastro = new Conta(nome, data, idade, cpf, login, senha);
		Usuario.login1 = cadastro.getNome();
		Usuario.senha1 = cadastro.getSenha();
		Usuario.setNome(nome);

		// Joga pra tela de Opçoes principais
		ExibeMenu menu = new ExibeMenu();
		menu.escolheOpcao();

		
		
		
		// Teste da massa
		// cadastra o usuario na conta

		//System.out.println(cadastro.getNome());
		//ProjetoLp2.Dados.put(cadastro.getNome(), cadastro);

		// Imovel novoImovel = new Imovel();
		// Cadastra o novo imovel
		// novoImovel.dadosImovel();
		// ProjetoLp2.DadosImoveis.put
		// cadastro.listaImoveis.add(novoImovel);
		// System.out.println(
		// ProjetoLp2.Dados.get("kawe").listaImoveis.get(0).tipo );

	}
}

/*
 * Dados = new HashMap<String, Conta>(1000); VendaDeImovelControle p = new
 * VendaDeImovelControle(); Usuario p = new Usuario(String, String);
 * p.adicionarConta(Conta u,Conta u1);
 */