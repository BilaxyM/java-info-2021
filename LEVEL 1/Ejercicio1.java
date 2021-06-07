import java.util.*;
//Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

public class Ejercicio1 {

    public static void main(String[] args) {
        //Creo un escaner que tomará el nombre del usuario
        Scanner papa =new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String user= papa.nextLine();

        System.out.println("HOLA " + user + "!!!");
    }
}
