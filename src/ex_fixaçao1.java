import java.util.Locale;

public class ex_fixaçao1 {

	public static void main(String[] args) {

		String nome = "Maria";
		int idade = 31;
		double salario = 4000.0;
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, salario);

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		// computer which price is $ 2100,00
		System.out.printf("%s which price is $ %.2f%n", product1, price1);

		// office desk which price is $ 650,50
		System.out.printf("%s which price is $ %.2f%n", product2, price2);

		// Record: 30 years old, code 5290 and gender: F
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);

		// Measure w/ 8 decimal places: 53,23456700
		System.out.printf("%.8f%n", measure);

		// rounded 3 decimal places: 53,235
		System.out.printf("%.3f%n", measure);

		// US decimal point: 53.235
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", measure);

		// sysout + ctrl space

	}

}
