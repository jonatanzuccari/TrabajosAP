package PrimerPaquete;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class trbjoPractico4_pnto2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String ruta = "C:\\Users\\jonk_\\Documents\\MiArchivoTXT.txt";

		for (String linea : Files.readAllLines(Paths.get(ruta))){

		System.out.println(linea);

		}


		

		File ruTa = new File("C:\\Users\\jonk_\\Documents\\MiArchivoTXT.txt");

		int sumaInt= 0;

		Scanner sumaNumeros = new Scanner(ruTa);

		while (sumaNumeros.hasNextInt()) {

		sumaInt = sumaInt + sumaNumeros.nextInt();

		}

		System.out.println("La suma es: "+ sumaInt);
		
		
		String ruta2 = "C:\\Users\\jonk_\\Documents\\ListaNombresTP3.txt";

		for (String linea : Files.readAllLines(Paths.get(ruta2))){

		System.out.println(linea);

		}



	}

}
