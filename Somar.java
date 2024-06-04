import java.util.Scanner;

public class Somar {
    
    public static void main(String[] args) {
        
    int num1, num2;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Informe 2 numeros para fazer a multiplicacao");
    num1 = leitor.nextInt();
    num2 = leitor.nextInt();
    double resultado = num1 * num2;
    
        System.out.println("O resultado da multiplicacao eh: "+resultado);
        
   }
}
