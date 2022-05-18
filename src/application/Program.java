package application;

import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Alunos alunos = new Alunos();
		
		alunos.nome = sc.nextLine();
		alunos.nota1 = sc.nextDouble();
		alunos.nota2 = sc.nextDouble();
		alunos.nota3 = sc.nextDouble();
		
		System.out.printf("Notas finais: %.2f%n", alunos.notas_finais());
		
		if(alunos.notas_finais() < 60) {
			System.out.println("Recuperação");
			System.out.printf("Você precisa de %.2f pontos para passar de ano%n", alunos.pontos_aprovacao());
		}
		else {
			System.out.println("Você foi aprovado");
		}
		sc.close();
		
		
		
		

	}

}
