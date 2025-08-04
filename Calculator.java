import java.util.*;

class Calculator {
    int Add(int a, int b) {
        return a + b;
    }

    int Sub(int a, int b) {
        return a - b;
    }

    int Mul(int a, int b) {
        return a * b;
    }

    int Div(int a, int b) {
        if(b==0){
            System.out.println("Division by zero not allowed!");
            return 0;
        }
        return a / b;
    }

    int Moddiv(int a, int b) {
        if(b==0){
            System.out.println("Modulo by zero not allowed!");
            return 0;
        }
        return a % b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choice;

        do {
            System.out.println("Enter two numbers:");
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println("Enter your choice :");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Mod Division");
            
            int ch = s.nextInt();

            switch (ch) {
                case 1: System.out.println("Addition: " + calc.Add(a, b)); break;
                case 2: System.out.println("Subtraction: " + calc.Sub(a, b)); break;
                case 3: System.out.println("Multiplication: " + calc.Mul(a, b)); break;
                case 4: System.out.println("Division: " + calc.Div(a, b)); break;
                case 5: System.out.println("Mod Division: " + calc.Moddiv(a, b)); break;
                default: System.out.println("Invalid Choice");
            }

            System.out.println("Do you want to calculate again? (Y/N):");
            choice = s.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed...!!");
        s.close();
    }
}
