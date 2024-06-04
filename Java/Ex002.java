package Java;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1,nota2,nota3,nota4,mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Insira a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Insira a nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Insira a nota 4: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("A média do aluno foi de: %.1f" , mediaFinal);
		
	}

}
