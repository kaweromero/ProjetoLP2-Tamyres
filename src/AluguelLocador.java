    
public class AluguelLocador extends Imovel {
    
    @Override
    public void dadosImovel(){
        
        System.out.println("\nInforme os seguintes dados: ");
        System.out.println("\n1. Proprietário: ");
        proprietario = in.nextLine();
        System.out.println("2. Tipo (casa, apartamento, outro): ");
        tipo = in.nextLine();
            if (tipo.equalsIgnoreCase(ap)){
                System.out.println("    Informe o andar: ");
                andar = in.nextInt();
            }
        System.out.println("3. Área: ");
        area = in.nextDouble();
        System.out.println("4. Número de quartos: ");
        numQuartos = in.nextInt();
        System.out.println("5. Quantidades de vagas na garagem: ");
        garagem = in.nextInt();
             
    }
    
    
}

