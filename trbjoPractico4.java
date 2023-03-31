
package PrimerPaquete;

import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;
public class trbjoPractico4 {	
	public static void main(String[] args) throws IOException {



        Scanner sc = new Scanner(System.in);
            int[] numeros = new int[3];


            for(int i = 0; i < 3; i++) {
                System.out.print("Ingrese el número " + (i+1) + ": ");
                numeros[i] = sc.nextInt();
            }


            System.out.print("Ingrese la letra de orden para el primer criterio (A mayuscula para ascendente o D mayuscula para descendente): ");
            char orden1 = sc.next().charAt(0);
            if(orden1 == 'D') {

                Arrays.sort(numeros);

                for( int i=numeros.length - 1;i>=0;i--) {
                    System.out.print(numeros[i]);
                }
            } else if(orden1 != 'S'&& orden1 != 'A') {
                System.out.println("La letra de orden debe ser S o D.");


            } else{
                Arrays.sort(numeros);
                for (int i =0; i<numeros.length;i++){
                    System.out.print( numeros[i]+" ");
                }
            }
    }
}