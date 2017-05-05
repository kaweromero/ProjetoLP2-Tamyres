import java.util.ArrayList;
import java.util.Scanner;

public class Conta {

	private String nome;
	private String data;
	private int idade;
	private long cpf;
	private static String login;
	private static String senha;
	public ArrayList<Imovel> listaImoveis = new ArrayList<>();
	public ArrayList<ImovelAluguel> listaImoveisAluguel = new ArrayList<>();

	public ArrayList<Historico> historico = new ArrayList<>();// armazena cada
																// historico
																// gerado e liga
																// ao usuario

	public Conta(String nome, String data, int idade, long cpf, String login, String senha) {

		this.nome = nome;
		this.data = data;
		this.idade = idade;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;

	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Conta{" + "login=" + login + ", senha=" + senha + '}';
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Imovel> getListaImoveis() {
		return listaImoveis;
	}

	public void addImovel(Imovel imovel) {
		this.listaImoveis.add(imovel);
	}

	public void addImovelAluguel(ImovelAluguel imovel) {
		this.listaImoveisAluguel.add(imovel);
	}

	public void addHistorico(Historico historico) {
		this.historico.add(historico);
	}

	public void mostrarHistórico() {

		if (historico.isEmpty() == false) {

			for (int index = 0; index < historico.size(); index++) {

				historico.get(index).motrarTudo();

			}

		} else {
			System.out.println("Nenhuma atividade encontrada!!");
		}

	}

}