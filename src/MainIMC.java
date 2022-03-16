import java.util.Scanner;

public class MainIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImcCalc imcCalc = new ImcCalc();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = scanner.next();
		
		System.out.println("Peso (Kg):");
		String inputPeso = scanner.next();
		
		System.out.println("Altura (m):");
		String inputAltura = scanner.next();
		
		float peso = Float.parseFloat(inputPeso);
		float altura = Float.parseFloat(inputAltura);
		
		System.out.println("Olá, " + nome + "!");
		imcCalc.imc(peso, altura);
		
	}

}
