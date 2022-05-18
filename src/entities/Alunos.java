package entities;

public class Alunos {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notas_finais() {
		return nota1 + nota2 + nota3;
	}
	public double pontos_aprovacao() {
		if(notas_finais() < 60.0) {
			return 60.0 - notas_finais();
		}
		else {
			return 0.0;
		}
	}

}
