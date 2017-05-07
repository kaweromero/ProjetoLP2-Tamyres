
import java.util.Scanner;

public class Usuario extends TelaInicialLogin {
    
    public static String login;
    public static String senha1;
    public static String nome;
    
   

	Scanner in = new Scanner(System.in);
    
    public void user(){
        System.out.println("\nLogin: ");
        login = in.next();
        System.out.println("Senha: ");
        senha1 = in.next();
        
        
      
        //Antes estava assim
        //if(ProjetoLp2.Dados.get(Usuario.getLogin()).equals(login)){
        //Só que o "get" do ArrayList "Dados" devolve o objeto "Conta", a gente tava comparando Conta com login
        //O que fiz foi agora pegar o login da "Conta, colocando um getLogin()
        //ProjetoLp2.Dados.get(Usuario.getLogin()) *** Pega a Conta
        //ProjetoLp2.Dados.get(Usuario.getLogin()).getLogin() *** Pega a conta e pega o Login da conta xDDD
        
        if(ProjetoLp2.Dados.get(Usuario.getLogin()).getLogin().equals(login)){
             //if(login.equals(login)){
            	 
               System.out.println("Funfou!");
            	   ExibeMenu t = new ExibeMenu();
            	   t.escolheOpcao();
             }else{
                 System.out.println("Esta conta ainda não foi criada!");
                 TelaInicialLogin i = new TelaInicialLogin();
                 i.telaInicial();
             }
    }
    
    public static String getLogin() {
		return login;
	}

	public static void setLogin(String login1) {
		Usuario.login = login1;
	}

	public static String getSenha() {
		return senha1;
	}

	public static void setSenha(String senha1) {
		Usuario.senha1 = senha1;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Usuario.nome = nome;
	}
    
}