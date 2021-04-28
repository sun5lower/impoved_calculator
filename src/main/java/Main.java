import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        do {
            System.out.println("Welcome to do some calculations: ");
            System.out.println("Choose an operator: +, -, *, or /");
            operator = scanner.next().charAt(0);
            System.out.println("Enter first number");
            number1 = scanner.nextDouble();
            System.out.println("Enter second number");
            number2 = scanner.nextDouble();
            userInput = scanner.nextLine();

            switch (operator) {

                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }
            System.out.println("\n Enter x to continue\n");
            scanner.nextLine();
        } while (!userInput.equalsIgnoreCase("quit"));
        return;
    }
}