package secao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClass {
	public static void main(String [] args) {

		List<String> responsaveisDoAluno = new ArrayList<>();
		
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
		responsaveisDoAluno = adicionarResponsaveis(responsaveisDoAluno, nomeDoPai);
		responsaveisDoAluno = adicionarResponsaveis(responsaveisDoAluno, nomeDaMae);
		responsaveisDoAluno = editarResponsaveis(responsaveisDoAluno, "Carla", 1);
		responsaveisDoAluno = removerResponsaveis(responsaveisDoAluno);
		responsaveisDoAluno = ordenarResponsaveis(responsaveisDoAluno);
		exibeResponsaveis(responsaveisDoAluno);
		
	}
	
	public static void exibeResponsaveis(List<String> responsaveisDoAluno) {
		for(int i = 0; i < responsaveisDoAluno.size(); i++) {
			System.out.println((i + 1) + ": " + responsaveisDoAluno.get(i));
		}
	}
	
	public static List<String> adicionarResponsaveis(List<String> responsaveisDoAluno, String nome) {
	    responsaveisDoAluno.add(nome);
		return responsaveisDoAluno; 
	}
	
	public static List<String> editarResponsaveis(List<String> responsaveisDoAluno, String nome, int index) {
		responsaveisDoAluno.set(index, nome);
		return responsaveisDoAluno;
	}
	
	public static List<String> removerResponsaveis(List<String> responsaveisDoAluno) {
		responsaveisDoAluno.remove(responsaveisDoAluno.size() - 1);
		return responsaveisDoAluno;
	}
	
	public static List<String> ordenarResponsaveis(List<String> responsaveisDoAluno) {
		responsaveisDoAluno.sort(null);
		return responsaveisDoAluno;
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