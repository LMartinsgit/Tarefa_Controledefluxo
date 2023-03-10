package br.com.lmartins;

import java.util.Scanner;

public class ProjetoMedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		Scanner ler = new Scanner(System.in);
		
			String nome;
			float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media;
			
			
			
			System.out.println("Olá, eu vou te ajudar a tirar sua média!");
			Thread.sleep(500);				
			System.out.println("Me diga seu nome:");
			nome = ler.nextLine();
			Thread.sleep(500);	
			System.out.printf("%s, Se sua média for 7 você será aprovado(a); \n",nome);
			Thread.sleep(500);	
			System.out.printf("Se for 5 você ficará de recuperação; \n");
			Thread.sleep(500);	
			System.out.printf("Se for menor do que 5 você está reprovado(a). \n");
			Thread.sleep(500);	
			
			System.out.println("Digite as médias dos 4 semestres Abaixo: \n");
			Thread.sleep(500);	
			
			

			System.out.printf("1º - ");
			nota1 = ler.nextFloat();
			if(nota1 >10){
				System.out.println("\nFavor inserir um valor de 0 a 10. Comece novamente!");
				return;
			}

			
			System.out.printf("2º - ");
			nota2 = ler.nextFloat();
			if(nota2 >10){
				System.out.println("\nFavor inserir um valor de 0 a 10. Comece novamente!");
				return;
			}

			
			System.out.printf("3º - ");
			nota3 = ler.nextFloat();
			if(nota3 >10){
				System.out.println("\nFavor inserir um valor de 0 a 10. Comece novamente!");
				return;
			}

			
			
			System.out.printf("4º - ");
			nota4 = ler.nextFloat();
			if(nota4 >10){
				System.out.println("\nFavor inserir um valor de 0 a 10. Comece novamente!");
				return;
			}

			
			
			System.out.printf("\nSua média é: %6.2f \n",((nota1 + nota2 + nota3 + nota4) / 4));
			Thread.sleep(1000);
			media = ((nota1 + nota2 + nota3 + nota4) / 4);
			
			if (media >= 7){
				System.out.println("\nParabéns, você esta aprovado(a)!");
				Thread.sleep(500);
			}
			else if (media >=5 && media<7){
			System.out.println("\nQue pena, você está de recuperção!");
			Thread.sleep(500);
			}
			
			else if (media <=5){
				System.out.println("\nQue pena, você reprovou!");
				Thread.sleep(500);
				}
			System.out.printf("Até a próxima, %s!", nome);
		
	}

}
