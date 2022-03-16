import java.lang.Math;

public class ImcCalc {
	public void imc(float peso, float altura) {
		float IMC = (float) (peso / Math.pow(altura, 2));
		System.out.println("Seu IMC hoje é de" + IMC);
		if(IMC < 18.5) {
			System.out.println("Você está abaixo do peso.");
		} else if(IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("Você está em seu peso normal.");
		} else if(IMC >= 25 && IMC <= 29.9) {
			System.out.println("Você está com sobrepeso.");
		} else if(IMC >= 30 && IMC <= 34.9) {
			System.out.println("Você está com obesidade grau I.");
		} else if(IMC >= 35 && IMC <= 39.9) {
			System.out.println("Você está com obesidade grau II.");
		} else if(IMC >= 40) {
			System.out.println("Você está com obesidade grau III.");
		}
	}
}
