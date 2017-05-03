
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
		System.out.println("5. Qual o preço do Alguel: ");
		preco = in.nextInt();
		
		//Volta para o menu principal
		ExibeMenu menu = new ExibeMenu();
		menu.escolheOpcao();

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
