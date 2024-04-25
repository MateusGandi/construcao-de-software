import java.util.InputMismatchException;
import java.util.Scanner;

class Math {
    public double dividir() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o numerador: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o denominador: ");
            int num2 = scanner.nextInt();

            if(num2 == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return (double) num1 / num2;
        } catch (InputMismatchException e) {
            System.out.println("Valor não é número.");
            return 0;
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
            return 0;
        } finally {
            scanner.close();
        }
    }
} 
    
public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.dividir());
    }
}
