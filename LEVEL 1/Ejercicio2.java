import java.io.*;
import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args){
        int suma, resta, multiplicacion,division,modulo;
        System.out.println("Por favor, ingrese dos números enteros: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        suma= a+b;
        resta= a-b;
        multiplicacion= a*b;
        division= a/b;
        modulo= a%b;
        System.out.println("La suma de los dos números es: " + suma);
        System.out.println("La resta es:" + resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+ division);
        System.out.println("El módulo de los dos números es: "+modulo);
    scan.close();
    }
}
