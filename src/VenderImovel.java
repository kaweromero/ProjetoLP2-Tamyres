
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class VenderImovel {
	String apartamento = "apartamento";

	public void dados() {
		Scanner in = new Scanner(System.in);
		System.out.println("COLOCANDO O SEU IMÓVEL A VENDA! ");
		System.out.println("Qual o proprietário deste imóvel? ");
		String proprietárioImv = in.nextLine();
		System.out.println("Qual o tipo de imóvel? (casa, apartamento ou outro)");
		String tipoImv = in.nextLine();
		if (tipoImv == apartamento) {
			System.out.println("Qual o andar do apartamento? ");
			int andarImv = in.nextInt();
		}
		System.out.println("Qual a área do imóvel? (m²)");
		double areaImv = in.nextDouble();
		System.out.println("Quantos quartos o imóvel contém? ");
		int quartosImv = in.nextInt();
		System.out.println("Quantas vagas na garagem? ");
		int vagasgaragemImv = in.nextInt();
		
		

	}
}
