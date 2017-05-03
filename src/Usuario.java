
import java.util.Scanner;

public class Usuario extends TelaInicialLogin {
    
    public static String login1;
    public static String senha1;
    public static String nome;
    
   

	Scanner in = new Scanner(System.in);
    
    public void user(){
        System.out.println("\nLogin: ");
        login1 = in.next();
        System.out.println("Senha: ");
        senha1 = in.next();
        
             if(login1.equals(login)){
                 //TelaDeApresentacao t = new TelaDeApresentacao();
                // t.opcoes();
             }else{
                 System.out.println("Esta conta ainda não foi criada!");
                 TelaInicialLogin i = new TelaInicialLogin();
                 i.telaInicial();
             }
    }
    
    public static String getLogin1() {
		return login1;
	}

	public static void setLogin1(String login1) {
		Usuario.login1 = login1;
	}

	public static String getSenha1() {
		return senha1;
	}

	public static void setSenha1(String senha1) {
		Usuario.senha1 = senha1;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Usuario.nome = nome;
	}
    
}
