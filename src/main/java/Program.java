import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter two numbers:");
            int userInt1 = scanner.nextInt();
            int userInt2 = scanner.nextInt();

            System.out.println("Enter operator: ");
            String userOperator = scanner.next();

            switch(userOperator){
                case Operation.ADD:
                    ConsolePrinter.print(Calculator.add(userInt1, userInt2));
                    break;
                case Operation.MULTIPLY:
                    ConsolePrinter.print(Calculator.multiply(userInt1, userInt2));
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }
}