
import java.util.Scanner;

public class Usuario extends TelaInicialLogin {
    
    public static String login1;
    public static String senha1;
    
    Scanner in = new Scanner(System.in);
    
    public void user(){
        System.out.println("\nLogin: ");
        login1 = in.next();
        System.out.println("Senha: ");
        senha1 = in.next();
        
             if(login1.equals(login)){
                 TelaDeApresentacao t = new TelaDeApresentacao();
                 t.opcoes();
             }else{
                 System.out.println("Esta conta ainda não foi criada!");
                 TelaInicialLogin i = new TelaInicialLogin();
                 i.telaInicial();
             }
    }
    
    
    
}
