package Java;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float  salario,abono,novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o salário: ");
		salario = leia.nextFloat();
		System.out.println("\nAgora insira o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo salário é de: R$" + novoSalario);
	}

}
