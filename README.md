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

