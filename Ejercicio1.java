//Asks for the name and gender of the user
//Returns a greeting


package ejercBucles;

import java.util.*;

public class Ejercicio1 {
	
	public static void main(String[] args) {


	String nombre;
	char sexo;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Introduzca su nombre completo");
	nombre = scanner.nextLine();
	
	System.out.println("Introduzca su sexo(M/F)");
	sexo = scanner.next().charAt(0);
	
	if(sexo=='M'){
		System.out.println("Bienvenido, Sr. " + nombre);
	}else if(sexo == 'F') {
		System.out.println("Bienvenido, Sra. " + nombre);
	}

    
	}
	
}
