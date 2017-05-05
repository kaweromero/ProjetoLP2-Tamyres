import java.text.SimpleDateFormat;

public class Historico {

	public String login;
	public Imovel imovelComprou;
	public Imovel imovelVendeu;
	public ImovelAluguel imovelAlugou;

	String data = "dd/MM/yyyy";
	String hora = "h:mm - a";
	String data1, hora1;

	public void dataAgora() {

		java.util.Date agora = new java.util.Date();
		SimpleDateFormat formata = new SimpleDateFormat(this.data);
		this.data1 = formata.format(agora);
		formata = new SimpleDateFormat(this.hora);
		this.hora1 = formata.format(agora);
		// System.out.print(data1+" ");
		// System.out.print(hora1+" ");

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Imovel getImovelComprou() {
		return imovelComprou;
	}

	public void setImovelComprou(Imovel imovelComprou) {
		this.imovelComprou = imovelComprou;
	}

	public Imovel getImovelVendeu() {
		return imovelVendeu;
	}

	public void setImovelVendeu(Imovel imovelVendeu) {
		this.imovelVendeu = imovelVendeu;
	}

	public ImovelAluguel getImovelAlugou() {
		return imovelAlugou;
	}

	public void setImovelAlugou(ImovelAluguel imovelAlugou) {
		this.imovelAlugou = imovelAlugou;
	}

	public void motrarTudo() {

		System.out.println(" --Informação de atividade-- ");
		System.out.println("Login: " + login);
		System.out.print("Data e hora da Operação: ");
		dataAgora();
		System.out.println();

		if (imovelComprou != null) {
			System.out.print(" Imovel comprado: ");
			imovelComprou.mostrarImovel();
		}
		if (imovelVendeu != null) {
			System.out.print(" Imovel vendido: ");
			imovelVendeu.mostrarImovel();
		}
		if (imovelAlugou != null) {
			System.out.print(" Imovel alugado: ");
			imovelAlugou.mostrarImovel();
		}

	}

}
