/*
Añadir código a main para saber si un numero es par o impar.
 */

import java.util.Scanner;

public class Numero_par_impar {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es par o no");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero: " + numero + " es par");
        } else {
            System.out.println("El numero: " + numero + " es impar");
        }
    }

}
