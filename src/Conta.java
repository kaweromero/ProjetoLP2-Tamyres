
import java.util.ArrayList;
import java.util.Scanner;

public class Conta {
    
    private String nome;
    private String data;
    private int idade;
    private long cpf;
    private static String login;
    private static String senha;
    public ArrayList <Imovel> listaImoveis = new ArrayList<>();
    
    public Conta(String nome, String data, int idade, long cpf, String login, String senha){
        
        this.nome = nome;
        this.data = data;
        this.idade = idade;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha; 
        
    }
    
    public String getLogin(){
        return login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    @Override
    public String toString() {
        return "Conta{" + "login=" + login + ", senha=" + senha + '}';
    }
    public String getNome(){
    	return nome;
    }
    
    
}


/*public class Conta {
    private String nome;
    private String dataNasc;
    private String cpf;
    private String login;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public void Conta(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do proprietário: ");
        nome = in.nextLine();
        System.out.println("Digite a data de nascimento separado com barras: ");
        dataNasc = in.nextLine();
        System.out.println("Digite o CPF do proprietário: ");
        cpf = in.nextLine();
        System.out.println("Digite o seu login para acessar a sua conta: ");
        login = in.nextLine();
        System.out.println("Digite a senha para acessar a sua conta: ");
        senha = in.nextLine();
    
        System.out.println("Proprietário da Conta: "+ this.getNome());
        System.out.println("Data de nascimento: "+ this.getDataNasc());
        System.out.println("CPF do proprietário: "+ this.getCpf());
        System.out.println("Login do usuário: "+ this.getLogin());
        System.out.println("Senha do usuário: "+ this.getSenha());
        System.out.println("Conta criada com sucesso! Sr(a) "+ this.getNome() + ". Tenha um bom dia! =*");






    }
}
*/