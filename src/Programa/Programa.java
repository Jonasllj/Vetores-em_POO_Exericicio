package Programa;

import java.util.Scanner;

import Entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos voce que ocupar: ");
		int m = sc.nextInt();
		
		int n;
		n=sc.nextInt();
		Aluno[] vetor = new Aluno[10];
	
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			String email = sc.nextLine();
			int quarto = sc.nextInt();
			
			vetor[i] = new Aluno(nome, email, quarto);
		}
		System.out.println("Quartos ocupados: ");
		for(int i=0; i<vetor.length;i++) {
			if(vetor[i] != null) {
				System.out.println(+vetor[i].getQuarto() +" : "+ vetor[i].getNome() + vetor[i].getEmail());
			}
		}
		System.out.println("--------------------------");
		for(int i=0; i<10;i++) {
			System.out.println(+vetor[i].getQuarto() +" : "+ vetor[i].getNome() + vetor[i].getEmail());
		}
	}
}
