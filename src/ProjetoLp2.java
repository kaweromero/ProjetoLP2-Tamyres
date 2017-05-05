
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ProjetoLp2 extends TelaInicialLogin {
    	    
	
	public static HashMap <String,Conta> Dados = new HashMap <String,Conta>();//Hashmap de contas de usuários (nome do usuario / conta)
	public static ArrayList <Imovel> DadosImoveis = new ArrayList <Imovel>();//Hashmap de imoveis pra vender (nome do proprietario / info dos imoveis)
	public static ArrayList <ImovelAluguel> DadosAlugados = new ArrayList <ImovelAluguel>();//Hashmap de imoveis pra alugar (nome do proprietario/ info dos imoveis)
	
    	    
    	 public static void main(String[] args) {
    	        
    	     TelaInicialLogin tel = new TelaInicialLogin();
    	    
    	     
    	     tel.telaInicial();
    	     
    	    }
    	 
}
   

   
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*  System.out.println("        MENU DA IMOBILIÁRIA GIRL POWER        ");
        System.out.println("        Escolha uma opção        ");
        System.out.println("1. Login na conta");
        System.out.println("2. Criar conta");
        System.out.println("Informe a opção: ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        switch(n1){
          case 1:
              LoginMB login1 = new LoginMB();
              System.out.println("Digite o login: ");
              String login = in.next();
              System.out.println("Digite a senha: ");
              String senha = in.next();
              
              break;
          case 2:
            int idade;
            System.out.println("Qual a sua idade? ");
            idade = in.nextInt();
            if (idade < 18){
                System.out.println("Impossível criar conta (Menor de 18 anos)");
            }else{
            Conta c1 = new Conta();
            c1.Conta();
            }
            break;
            default:
              System.out.println("Opção inválida, tente novamente.");
    
        }
    }
}*/
