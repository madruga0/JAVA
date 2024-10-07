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
	}
}
```


