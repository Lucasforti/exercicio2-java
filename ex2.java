import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double area = raio * raio * 3.14159;
		
		System.out.printf("O valor da area do circulo é de: %.4f%n", area);
		
		sc.close();
	}
}