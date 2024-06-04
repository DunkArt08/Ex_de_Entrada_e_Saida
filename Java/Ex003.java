package Java;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salarioBruto, addNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Insira o adicional noturno: ");
		addNoturno = leia.nextFloat();
		System.out.println("Insira o as horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Insira os descontos: ");
		descontos = leia.nextFloat();
		salarioLiquido = salarioBruto + addNoturno + (horasExtras * 5) - descontos;
		System.out.printf("O salário liquido foi de: %.2f" , salarioLiquido);
	}

}
