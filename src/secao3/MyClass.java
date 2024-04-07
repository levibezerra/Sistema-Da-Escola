package secao3;

public class MyClass {
	public static void main(String [] args) {

		String nome = "Paulo";
		String sobrenome = "Lima";
		int idade = 22;
		final String matricula = "202410099";
		String nomeDoPai = "Jose";
		String nomeDaMae = "Maria";
		boolean temAtorizacao = true;
		double nota1 = 8.5;
		double nota2 = 10;
		double nota3 = 9.5;
		double nota4 = 7.5;
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Nome: " + nome + "\n"
				         + "Sobrenome: " + sobrenome + "\n"
						 + "Idade: " + idade + "\n"
						 + "Matricula: " + matricula + "\n"
						 + "Nome Do Pai: " + nomeDoPai + "\n"
						 + "Nome Da Mae: " + nomeDaMae + "\n"
						 + "Tem Autorizacao: " + temAtorizacao + "\n"
						 + "Media De Portugues: " + media);
		
		if(media >= 7) {
			System.out.println("O aluno " + nome + " esta aprovado na disciplina de portugues com a media " + media);
		} else {
			System.out.println("O aluno " + nome + "esta reprovado na disciplina de portugues com a media " + media);
		}
	}
}
 