import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vet = new int[10];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int valor = -1;
        
        while (valor != 0) {
            try {
                System.out.print("Digite um valor: ");
                valor = scanner.nextInt();

                vet[count] = valor;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Valor informado não é NaN.");
                scanner.next(); 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Passou o limite do vetor.");
                break; 
            }
        }
        scanner.close();

        System.out.println("Elementos do vetor:");
        for (int i = -1; i < count; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}

