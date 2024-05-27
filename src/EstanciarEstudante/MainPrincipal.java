package EstanciarEstudante;
import java.util.Locale;
import java.util.Scanner;

import SemestreEstudante.Estudante;

public class MainPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante est = new Estudante();
		
		System.out.println("Qual seu Nome: ");
		est.nome = sc.nextLine();
		System.out.println("Notaota do primeiro semestre: ");
		est.primeiraNota = sc.nextDouble();
		System.out.println("Nota do segundo sdemestre: ");
		est.segundaNota = sc.nextDouble();
		System.out.println("Nota do terceiro semestre: ");
		est.terceiraNota = sc.nextDouble();
		System.out.println();
		System.out.printf("Nota fina = %.2f%n" , est.NotaFinal());
		est.Aprovado();
		
		
		
		sc.close();
	}

}
