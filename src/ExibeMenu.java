/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp2;

import java.util.Scanner;

public class ExibeMenu {
   
      
      public void opcoes(){
      System.out.println("1. Comprar Imóvel");
      System.out.println("2. Vender Imóvel");
      System.out.println("3. Alugar Imóvel Próprio (Locador)");
      System.out.println("4. Alugar Imóvel de Terceiros (Inquilino)");
      System.out.println("5. Histórico de Operações");
      System.out.println("6. Sair");
      }
      
      public void escolheOpcao(int opcao){
      Scanner in = new Scanner(System.in); 
      System.out.println("Digite a opção desejada: ");
      opcao = in.nextInt();
      switch(opcao){
          case 1:
              ComprarImovel();
              break;
          case 2:
              VenderImovel();
              break;
          case 3:
              AlugarImovelProprio();
              break;
          case 4:
              AlugarImovelInquilino();
              break;
          case 5:
              HistoricoDeOperacoes();
              break;
          case 6:
              System.out.println("O Sistema está sendo encerrado... Volte Sempre");
              break;
          default:
              System.out.println("Opção inválida, tente novamente.");
             
      }
      }
} 
