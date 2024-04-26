import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente!");
    }
}

class ContaBancaria {
    private Double saldo;
    
    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }
    
    void depositar(Double valor) {
        this.saldo += valor;
    }
   
   Double getSldo(){
       return this.saldo;
   }
   
    public Double sacar(Double valor) throws SaldoInsuficienteException {
        if (saldo >= valor) {
            return this.saldo -= valor;
        } else {
            throw new SaldoInsuficienteException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria mateus = new ContaBancaria(1000.0);
        int op = 1;
        
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.print("Operação: ");
        //op = scanner.nextInt();
        
        try {
            switch(op) {
                case 1:
                    System.out.print("Valor do saque: ");
                    Double valorSaque = 1200.0;//scanner.nextDouble();
                    mateus.sacar(valorSaque);
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    Double valorDeposito = scanner.nextDouble();
                    mateus.depositar(valorDeposito);
                    break;
                default:
                    System.out.println("Saindo...");
            }
        } catch(SaldoInsuficienteException e) {
             System.out.println(e.getMessage());
        }
        
        System.out.println("Saldo: R$" + mateus.getSldo());
        scanner.close(); 
    }
}
