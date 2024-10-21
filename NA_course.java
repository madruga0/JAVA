import java.util.Locale;

public class NA_course {
	public static void main(String[] args) {

		// System.out.println("Hello world");
		// int y = 32;
		// System.out.println(y);
		// double x = 10.35784;
		// System.out.printf("%.2f%n", x);
		// System.out.printf("%.3f%n", x);

		// String nome = "Pedro";
		// int idade = 31;
		// double renda = 4000.0;
		// System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

// 		## para concatenar varios elementos em um mesmo comando de escrita

// - **%f** -> ponto flutuante
// - **%d** -> inteiro
// - **%s** -> texto
// - **%n** -> quebra de linha
// ```java

// String nome = "Pedro";
// int idade = 31;
// double renda = 4000.0;
// System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'M';
		String madruga = gay

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded(three decimal places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f%n", measure);
		Locale.setDefault(new Locale("pt", "BR"));
		System.out.printf("BR decimal point: %.3f%n", measure);
		System.out.println("");
		System.out.println("oi" + madruga);
	}
}
