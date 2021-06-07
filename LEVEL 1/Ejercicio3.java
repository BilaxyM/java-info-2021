import java.util.*;
public class Ejercicio3 {
//Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números
//(incrementos de 1) de la siguiente forma:
    public static void main(String[] args){
            System.out.println("Ingrese un número entero: ");
            Scanner scan=new Scanner(System.in);
            int nro=scan.nextInt();
        scan.close();

        for(int i=0;i<=nro; i++){
                for(int j=1;j<=i;j++){
                    System.out.println(j);
                }
                System.out.println("");
            }
    }
}