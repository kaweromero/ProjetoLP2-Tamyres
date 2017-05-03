
import java.util.Scanner;

public class TelaDeApresentacao {
    
    private int opc;
    CompraImovel ci = new CompraImovel();
    Venda vi = new Venda();
    AluguelLocador loc = new AluguelLocador();
    TelaInicialLogin telaInicial = new TelaInicialLogin();
    
    
    Scanner in = new Scanner(System.in);
    
    public void opcoes(){
        
        System.out.println("\n---------- MENU DE OPÇÕES ----------");
        System.out.println("\n1. Comprar imóvel \n2. Vender imóvel \n3. Alugar imovel próprio \n4. Alugar imóvel"
                + " de terceiros \n5. Histórico de operações \n6. Sair ");
        System.out.println("\nInforme a opção: ");
        opc = in.nextInt();
        
        switch(opc){
            case 1: System.out.println("Comprando imóvel..."); break;
            case 2: vi.dadosImovel(); break;
            case 3: loc.dadosImovel(); break;
            case 4: System.out.println("Alugando imóvel de terceiros..."); break;
            case 5: System.out.println("Histórico de operações..."); break;
            case 6: telaInicial.telaInicial(); break;
            default: System.out.println("Opção inválida.");
        }
    }
    
    
    
}
