package PrimerPaquete;
import java.nio.*;
public class clasenro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra= "elefante" ;
		int contador=0,posicion=0;
		char caracter= 'e';
		
		String palabraMin = palabra.toLowerCase();
		
		posicion = palabraMin.indexOf(caracter);
		
		System.out.println(posicion);
		if (posicion != -1) {
			while(posicion != -1) {
				contador++;
				posicion = palabraMin.indexOf(caracter,posicion+1);
				
			}
			
		}
		System.out.println ("la palabra es " + palabra );
		System.out.println("la letra ingresada es " + caracter);
		System.out.println("la cantidad de veces que aparece es " + contador);
		
		boolean orden_asc = false;
		int []vectorA = {200,5,10};
		int num1=0, num2=0,num3=0, aux1=0, aux2=0, mayor=0;
			num1 = vectorA[0];
			num2 = vectorA[1];
			num3 = vectorA[2];
			System.out.println(num1+" " + num2+" " + num3);
			
			if ((num1 > num2) && (num1 > num3)) {
					mayor=num1;	
					if (num2 > num3) {
						aux1=num2;
						aux2=num3;
					}else {
						aux1=num3;
						aux2=num2;
					}
			} 
			else{
				if ((num2 > num3) && (num2 > num1))  {
					mayor=num2;	
					if (num1 > num3) {
						aux1=num1;
						aux2=num3;
					}else {
						aux1=num3;
						aux2=num1;
					}
					
				}else {
					mayor=num3;
					if (num2 > num1) {
						aux1=num2;
						aux2=num1;
					}else {
						aux1=num1;
						aux2=num2;
					}
					
			     }
			}	
		
	System.out.println("El mayor es: "+mayor);
	int vecOrdenado [] = new int[3];
	if (orden_asc) {
		vecOrdenado[0]=mayor;
		vecOrdenado[1]=aux1;
		vecOrdenado[2]=aux2;
	}else {
		vecOrdenado[0]=aux2;
		vecOrdenado[1]=aux1;
		vecOrdenado[2]=mayor;
	}
	String frase="Jonatan;juan;Carlos;Micaela;Daniel;Roberto;Sofia;Julieta;Camila;Barbara ";
	String fraseSplit[] = frase.split(";");

	for (String elemento : fraseSplit) { 
		System.out.println(elemento);
	}

	}

}
