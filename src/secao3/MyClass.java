package secao3;

import java.util.Scanner;

public class MyClass {
	public static void main(String [] args) {

		String nome = "Paulo";
		String sobrenome = "Lima";
		int idade = 22;
		final String matricula = "202410099";
		String nomeDoPai = "Jose";
		String nomeDaMae = "Maria";
		boolean temAtorizacao = true;
		
		System.out.println("Nome: " + nome + "\n"
				         + "Sobrenome: " + sobrenome + "\n"
						 + "Idade: " + idade + "\n"
						 + "Matricula: " + matricula + "\n"
						 + "Nome Do Pai: " + nomeDoPai + "\n"
						 + "Nome Da Mae: " + nomeDaMae + "\n"
						 + "Tem Autorizacao: " + temAtorizacao + "\n");
		
		informeSuaNota();
		
	}
	
	public static String verificaMedia(double media) {
		String mensagem;
		
		if(media >= 7) {
			mensagem = "Aluno aprovado com a media: " + media;
		} else if(media < 7 && media <= 5) {
			mensagem = "O aluno está em recuperação, sua media foi: " + media;
		} else {
			mensagem = " O aluno está reprovado, sua media foi: " + media;
		}
		return mensagem; 
	}
	
	 public static void informeSuaNota() {
		 Scanner input = new Scanner(System.in);
		 
		 int cont = 0;
		 double somaNotas = 0;

		 while(true) {
			 System.out.println("Informe sua nota: ");
			 double nota = input.nextDouble();
			 
			 if(nota == 0) {
				 break;
			 }
			 
			 somaNotas += nota;
			 cont++;
		 }
		 
		 double media = calculaMedia(somaNotas, cont);
		 System.out.println(verificaMedia(media));
	 }
	 
	 public static double calculaMedia(double somaNotas, int quantDeNotas) {
		 double media = somaNotas / quantDeNotas;
		 return media;
	 }
}
 