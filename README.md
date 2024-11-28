# JAVA

## Types of **variables**

- **String**: "Hello", "Say my name", "Some text".
- **int**: 123, -123, 657, 2345, 10, 0.
- **float**: 19.34, 5.678, 3.14, -9.45.
- **char**: "a", "B", "y".
- **boolean**: true or false

## Declaring variables
> you must ***specify*** the type and assign it a value
```java
type variableName  = value;

// Example

String surname = "Madruga";
int myAge = 22;
myAge = 26; // reassigning the value of the variable.
System.out.println("Pedro " + surname + " have " + myAge + " years.");
// Will print ("Pedro Madruga have 26 years.")
--
public class Learn {
			public static void main(String[] args) {

				String car = "Lamborghini";
				final int doors = 2; // works as a constant
				
				System.out.println(car + " have " + doors + " doors");
			}
		}
```


### Other variable's types
```java

	int myNum = 5;
	float myFloatNum = 5.99;
	char myLetter = 'D';
	boolean myBool = true;
	String myText = "Hello";

```

## The general rules for naming variables are:

- Names can contain letters, digits, underscores, and dollar signs
- Names must **begin** with a **letter**
- Names should **start** with a **lowercase letter**, and **cannot contain whitespace**
- Names can also begin with **$** and **_**
- Names are case-sensitive (**"myVar" and "myvar" are different variables**)
- **Reserved words** (like Java keywords, **such as int or boolean**) **cannot** be **used** **as names**	

## Java Data Types
```java
	int myNum = 5;               // Integer (whole number)
	float myFloatNum = 5.99f;    // Floating point number
	har myLetter = 'D';          // Character
	boolean myBool = true;       // Boolean
	String myText = "Hello";     // String
```
> Data types are divided into **two groups**: 
- **Primitive** data types - includes ***byte***, ***short***, ***int***, ***long***, ***float***, ***double***,***boolean*** and ***char***
- **Non-primitive** data types - such as ***String***, ***Arrays*** and ***Classes***

| Data Type      | Size           | 
| -------------- | -------------- | 
| byte           | 1 byte         | 
| short          | 2 bytes        |
| long           | 8 bytes        | 
| float          | 4 bytes        | 
| double         | 8 bytes        | 
| boolean        | 1 byte         | 
| char           | 2 bytes        | 
| int            | 4 bytes        | 


## Declaracao de variaveis
```java
<tipo> <nome> = <valor inicial>

int idade = 25;
double altura = 1.68;
char sexo = 'F';



System.out.printf("%.2f%n", x);
// para limitar a duas casas decimais (%.qttdf%n)
```

## para concatenar varios elementos em um mesmo comando de escrita

- **%f** -> ponto flutuante
- **%d** -> inteiro
- **%s** -> texto
- **%n** -> quebra de linha
```java

String nome = "Pedro";
int idade = 31;
double renda = 4000.0;
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

```

## CASTING -> conversao explicita dos valores
 
 - **Sempre** indique o **tipo de numero**, se a **expressao** **for de ponto flutuante**(nao inteira)
 - abaixo, **indica uma boa pratica**, nao e obrigatorio utilizar, mas e bom (pode dar problema em alguns casos)

 - Para **DOUBLE** use: **.0**
 ```java
double h, b, B, area;

		 b = 6.0;
		 B = 8.0;
		 h = 5.0;
		 area = (b + B) / 2.0 * h;

		System.out.println("Area do trapezio: " + area + "m2");
 ```
 
 - Para **FLOAT** use: **f**;
 ```java
float h, b, B, area;

		 b = 6f;
		 B = 8f;
		 h = 5f;
		 area = (b + B) / 2f * h;

		System.out.println("Area do trapezio: " + area + "m2");
 ```

## ENTRADA DE DADOS PT.1

- Para fazer entrada de dados, vamos criar um objeto do tipo "Scanner" da seguinte forma:
```java

	// Variavel do tipo Scanner
	Scanner sc = new Scanner(System.in);

```
- para isso, preciso colocar no topo da minha clasee o seguinte IMPORT
```java
import java.util.Scanner;

public class NA_course {
	public static void main(String[] args) {
		... }
```
- faca 
```java 
sc.close()
// .close() funcao que vai desalocar essa funcao que nos criamos
```
- quando nao precisar mais do objeto 'sc'

# Entrada de dados e tipos de leitura

1. ler uma **palavra** a **partir do teclado**
```java
	Scanner sc = new Scanner(System.in);

	String x;
	x = sc.next();
	System.out.println("Voce digitou: " + x);
```
2. ler um **numero** a partir do teclado
```java
	Scanner newNumber = new Scanner(System.in);
	
	int y;
	y = newNumber.nextInt();
	System.out.println("Numero que foi digitado: " + y);
```
3. ler um **numero com ponto flutuante**
```java
	Scanner numberDouble = new Scanner(System.in);

	double z;
	z = numberDouble.nextDouble();
	System.out.println("Numero que foi digitado: " + z);
```
4. ler um **caractere**
```java
	Scanner name = new Scanner(System.in);

	char name;
	name = name.next().charAt(0);
	System.out.println("Caractere que foi digitado: " + name);
```
5. ler **varios dados na mesma linha**
```java
	String x;
	int y;
	double z;
		
	x = sc.next();
	y = sc.nextInt();
	z = sc.nextDouble();
		
	System.out.println("Dados digitados:");
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
```
# Entrada de dados PT.2

## Para ler um texto ATE A QUEBRA DE LINHA
```java
import java.util.Scanner;

public class NA_course {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
```
## ATENCAO: quebra de linha pendente
```java
import java.util.Scanner;

public class NA_course {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// OBS: Quando voce usa um comando de leitura diferente do nextLine() e da alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrao.
		
		// Se voce entao fizer um nextLIne(), aquela quebra de linha pendente sera absorvida pelo nextLine()
		// SOLUCAO: Faca um nextLine() extra antes de fazer o nextLine() de seu interesse
	}
}
```
# RESUMO
1. Scanner
   - next()
   - nextInt()
   - nextDouble()
   - next().charAt(0)
2. Locale
3. Como ler ate a quebra de linha
   - nextLine()
   - como limpar o buffer de leitura

# Functions em JAVA

| Exemplo           | Significado                         |
| --------------    | --------------                      |
|A = Math.sqrt(x);  | A recebe raiz quadrada de X         |
|A = Math.pow(x,y); | A recebe o resultado de X elevado a Y|
|A = Math.abs(x);   | A recebe o valor absoluto de X      |

```java
public class NA_course {
	public static void main(String[] args) {


		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("A raiz quadrada de " + x + " = " + A);	
		System.out.println("A raiz quadrada de " + y + " = " + B);
		System.out.println("A raiz quadrada de 25 " + " = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5.0 elevado ao quadrado = " + C);

		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}
}
```
- **sqrt** : raiz quadrada.
- **pow** : potenciacao.
- **abs** : valor absoluto.
  

# Operadores de atribuicao cumulativa
- a += b; | a = a + b;
- a -= b; | a = a - b;
- a *= b; | a = a * b;
- a /= b; | a = a / b;
- a %= b; | a = a % b;

```java
		Scanner sc = new Scanner(System.in);

		System.out.print("Total de minutos gastos: ");
		int minutos = sc.nextInt();
		double conta = 50.0;

		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();

```

# SWITCH/CASE VS IF/ELSE
> Nao existe um melhor do que o outro, tudo vai depender de qual sera a finalidade do programa.

```java
Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3: 
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}

		System.out.print("Dia da semana: " + dia);

		sc.close();
```

```java
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        if (x == 1) {
            dia = "domingo";
        } else if (x == 2) {
            dia = "segunda";
        } else if (x == 3) {
            dia = "terca";
        } else if (x == 4) {
            dia = "quarta";
        } else if (x == 5) {
            dia = "quinta";
        } else if (x == 6) {
            dia = "sexta";
        } else if (x == 7) {
            dia = "sabado";
        } else {
            dia = "valor invalido";
        }

        System.out.print("Dia da semana: " + dia);

        sc.close();
```

# Expressao condicional ternaria
> Estrutura opcional ao if-else **quando se deseja decidir um VALOR com base em uma condition**

## Sintaxe
( condition ) ? valor_se_verdadeiro : valor_se_falso

### Exemplos
```java
( 2 > 4 ) ? "Sim" : "Nao" -> nao
( 10 != 3 ) ? "Pedro" : "Madruga" -> Pedro


// EX 2
double preco = 34;
double desconto;
if (preco < 20.0) {
	desconto = preco * 0.1;
} else {
	desconto = preco * 0.05;
}

// COM O OPERADOR TERNARIO
double preco = 34;
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
```
# Functions interessantes para String

- **Formatar**: toLowerCase(), toUpperCase(), trim()
- **Recortar**: substring(inicio), substring(inicio, fim)
- **Substituir**: Replace(char, char), Replace(string, string)
- **Buscar**: IndexOf, LastIndexOf
- str.Split("") -> recortar a string em um separador que que for colocado.
```java
String original = "abcde FGHIJ ABC abc DEFG";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");


		System.out.println("Original: " + original);
		System.out.println("ToLowerCase: " + s01);
		System.out.println("ToUpperCase: " + s02);
		System.out.println("trim: " + s03);
		System.out.println("substring(2): " + s04);
		System.out.println("substring(2, 9): " + s05);
		System.out.println("replace('a', 'x'): " + s06);
		System.out.println("replace('abc', 'xy'): " + s07);
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		String s = "potato apple lemon orange banana";

		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		System.out.println(vect[4]);
```

# FUNCOES
- **Functions** em **classe** recebem o nome de "**metodos**"
```java
package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	// My app default function -> my app entry point
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux; // variavel local dessa funcao
		if(a > b && a > c) {
			aux = a;
		} else if(b > c) {
			aux = b;
		} else {
			aux = c;
		}
		
		return aux;
	}
	// public -> para que essa funcao fique disponivel para outras classes
	// static -> para que a funcao possa ser chamada independente de criar um objeto
	// int -> o tipo de variavel que vai retornar a funcao
	// max() -> o nome da funcao 
	// int a, int b, int c -> sao os parametros funcao, que nao precisam ter o mesmo nome das variaveis do programa principal 
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	// void -> quando a funcao faz uma acao sem retornar um valor para ser reaproveitado no programa

}
```
- O nome do **parametro** **nao precisa ser igual** ao **nome da variavel do programa principal** 
- Quando eu chamar a function, os valores dos parametros vao casar e se tornarao um so 

# IPC
	 > Quais são os benefícios de se calcular a area de um triangulo por meio de um MÉTODO dentro da CLASSE Triangle?
	 1. Reaproveitamento de código: nós eliminamos o codigo repetido(calculo das areas dos triangulos x e y) no programa principal.
	 2. Delegação de responsabilidade: quem deve ser responsavel por saber como calcular a area de um triangulo é p proprio triangulo. A logica do calculo da area nao deve estar em outro lugar.
  
## Codigos
> class **Triangle** que contém o método
```java
package packages.entities;
import java.util.Scanner;

public class Triangle{
  Scanner sc = new Scanner(System.in);

  // atributos
  public double a;
  public double b;
  public double c;

  public double area() {
      double p = (a + b + c) / 2.0;
      double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
      return result;
  }
}
```
> public class Program
```java
import java.util.Locale;
import java.util.Scanner;

import packages.entities.Triangle;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Enter the measures of triangle X: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();
    System.out.println("Enter the measures of triangle Y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();
    double areaY = y.area();
    
    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%n", areaY);
    
    if (areaX > areaY) {
      System.out.println("Larger area: X");
    } else {
      System.out.println("Larger area: Y");
    }
	}

}
```
## Codigo de uma classe Program
> class **Product** que chama os métodos e os objetos

 ```java
package packages;

import packages.JAVA.Estoque;

import java.util.Locale;
import java.util.Scanner;

public class Product {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Locale.setDefault(Locale.US);

      // Constructed object called "stock"
      Estoque stock = new Estoque();

      // Set values to objects "name", "price", "quantity"
      System.out.println("Enter product data");
      System.out.print("Name: ");
      stock.name = sc.nextLine();
      System.out.print("Price: ");
      stock.price = sc.nextDouble();
      System.out.print("Quantity: ");
      stock.quantity = sc.nextInt();

      // Updated data with method "totalValueInStock" which return (price * quantity).
      System.out.println("Product data: " + stock.name + ", $ " + stock.price + ", " + stock.quantity + " units , $ " + stock.totalValueInStock());

      // Adding data to stock with method addProducts which receive parameter an integer value (this.quantity += quantity);
      System.out.println("Enter the number of products to be added in stock: ");
      // I declared the parameter "quantity"
      int quantity = sc.nextInt();
      stock.addProducts(quantity);
      System.out.println("Updated data: " + stock);

      // Removing data from stock with method removeProducts which receive parameter an integer value (this.quantity -= quantity);
      System.out.println("Enter the number of products to be removed from stock: ");
      quantity = sc.nextInt();
      stock.removeProducts(quantity);

      // Declaring the final updated data with the method which will format to String
      System.out.println("Updated data: " + stock.toString());

      sc.close();

   }
}
```
> class **Estoque** que contém os *métodos* e *objetos* 
```java
package packages;

public class Estoque {
    public String name;
    public double price;
    public int quantity;


    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
```

