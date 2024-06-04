package Java;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1,n2,n3,n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		n1 = leia.nextFloat();
		System.out.println("Insira o segundo numero: ");
		n2 = leia.nextFloat();
		System.out.println("Insira o terceiro numero: ");
		n3 = leia.nextFloat();
		System.out.println("Insira o quarto numero: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		System.out.printf("A diferença foi de: %.1f" , diferenca);
	}

}
