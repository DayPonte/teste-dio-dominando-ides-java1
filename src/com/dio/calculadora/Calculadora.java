package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a, b;

			
			System.out.println("Digite o primeiro valor: ");
			a = scan.nextInt();
			System.out.println("Digite segundo valor: ");
			b = scan.nextInt();
			System.out.println("Digite segundo valor: ");
			b = scan.nextInt();
			
			
			
			int soma = soma(a,b);
			int subtracao = subtraçao(a,b);
			int multiplicacao = multiplicacao(a,b);
			int divisao = divisao(a,b);
			
			
			System.out.println(soma);
			System.out.println(subtracao);
			System.out.println(multiplicacao);
			System.out.println(divisao);
		}
		
	}
	
	
	

	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtraçao(int a, int b) {
		return a - b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
		
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
		
			}
	
	
	
}
