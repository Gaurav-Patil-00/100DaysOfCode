import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a First number: ");

        // nextInt() reads the next integer from the keyboard
        int number1 = reader.nextInt();

	System.out.println("Enter a Second number: ");
	int number2 = reader.nextInt();
		
	int sum=number1 + number2;
        // println() prints the following line to the output screen
        System.out.println("Sum of Integers you entered: " + sum);
	System.out.println("Multiplication : " + number1*number2);
    }
}