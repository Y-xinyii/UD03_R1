import java.util.Scanner;

public class ContarSumar{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int suma = 0;
        
        System.out.println("Introducir un numero(0 para terminar): ");
        int numero = scanner.nextInt();

        while(numero != 0){
            contador++;
            suma += numero;
            numero = scanner.nextInt();
        }
        
        System.out.println("Números leidos: " + contador);
        System.out.println("Suma total: " + suma);

        scanner.close();
    }
}
