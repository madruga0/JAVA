# JAVA

## Types of **variables**

> **String**: "Hello", "Say my name", "Some text".
> **int**: 123, -123, 657, 2345, 10, 0.
> **float**: 19.34, 5.678, 3.14, -9.45.
> **char**: "a", "B", "y".
> **boolean**: true or false

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
				final int doors = 2; // funciona como uma CONST
				
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
