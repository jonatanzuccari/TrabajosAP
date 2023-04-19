package proyectoGrupal;
import java.util.Scanner;

public class modelo_calculadora {
	public static void main(String[] args) {
		int opcion;
		double resultado;
		resultado= calculator();
	do {
	   
	   System.out.println("ingrese\n 1 para seguir operando sobre el resultado "+resultado+"\n 2 para hacer un nuevo calculo \n 0 para salir.");
	   Scanner op=new Scanner(System.in);
	   opcion=op.nextInt();
	    switch (opcion) {
	   	case 1:resultado=calculator2(resultado);
	   	break;
	   	case 2:resultado=calculator();
	   	break;
	   	case 0: 
	   	System.out.println("gracias por usar la caclculadora grupo 1 :)");
	   	
	   	break;
	   	}
	    }while(opcion!=0);
	 
	
	}
	public static double calculator() {
	  
		double num3 = 0;
	    Scanner operacion = new Scanner(System.in);
	    System.out.println("Ingrese dos numeros: ");
	    double num1 = operacion.nextDouble();
	     double num2 = operacion.nextDouble();
	   System.out.println("Ingrese que operacion desea realizar: 1-suma\n2-resta\n3-multiplicacion\n4-division");
	  int op = operacion.nextInt();
	       switch (op) {
	   	case 1: num3=add(num1,num2);
	   	System.out.println(num1+"+"+num2+"="+num3);
	   	break;
	   	case 2: num3=sust(num1,num2);
	   	System.out.println(num1+"-"+num2+"="+num3);
	   	break;
	   	case 3: num3=mult(num1,num2);
	   	System.out.println(num1+"*"+num2+"="+num3);
	   	break;
	   	case 4:num3= div(num1,num2);
	   	System.out.println(num1+"/"+num2+"="+num3);
	   	break;
	   	}
	        
	        return num3;
	    }
	        
	        public static double calculator2(double resultado) {
	        	double num3=0;
	        	Scanner operacion=new Scanner(System.in);
	            System.out.println("Ingrese un numero ");
	            double num1 = resultado;
	             double num2 = operacion.nextDouble();
		         System.out.println("Ingrese que operacion desea realizar: 1-suma\n2-resta\n3-multiplicacion\n4-division");
		        int op = operacion.nextInt();
	              
		  	     switch (op) {
		 	   	case 1: num3=add(num1,num2);
		 	   	System.out.println(num1+"+"+num2+"="+num3);
		 	   	break;
		 	   	case 2: num3=sust(num1,num2);
		 	   	System.out.println(num1+"-"+num2+"="+num3);
		 	   	break;
		 	   	case 3: num3=mult(num1,num2);
		 	   	System.out.println(num1+"*"+num2+"="+num3);
		 	   	break;
		 	   	case 4:num3=div(num1,num2);
		 	   	System.out.println(num1+"/"+num2+"="+num3);
		 	   	break;
		 	   	}
		 	       return num3;
	            }
	       

	
	public static double add(double a, double b) {
		return a + b;
    }
	
	public static double sust(double a, double b) {
        return a - b;
    }
	
	public static double div(double a,double b) {
        return a / b;
    }
	
	public static double mult(double a,double b) {
        return a * b;
    }
}