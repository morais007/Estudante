package SemestreEstudante;

public class Estudante {

	public String nome;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;
	public double result;
	
	public double NotaFinal() {
		return primeiraNota + segundaNota + terceiraNota;
	}
	
	public void Aprovado() {
		if(NotaFinal() < 60) {
			double result = 60 - NotaFinal();
			System.out.println("Reprovado " );
			System.out.printf("Falta %.2f pontos", result);
			
		}
		else {
			System.out.println("Aprovado ");
		}
		
	}
}
