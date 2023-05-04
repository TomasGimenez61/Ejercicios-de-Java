import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		String palabras[];
		palabras = new String[10];
		String nueva;
		boolean band;
		band=false;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < palabras.length; i++) { 
			System.out.println("Ingrese la palabra numero "+(i+1));
			palabras[i] = sc.nextLine();
		}
		
		System.out.println();
		System.out.println("Ingrese la palabra a comparar");
		nueva = sc.nextLine();
		
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equalsIgnoreCase(nueva)) {
				System.out.println("La nueva palabra ingresada coincide con una ingresada anteriormente");
				System.out.println("La palabra "+nueva+" se encuentra en la posicion "+ (i+1) + " del array");
				band = true;
			}
		}
		
		if (band == false) {
			System.out.println("La palabra "+nueva+" no se encuentra en el array");
		}
		
		sc.close();
		
		
	}
}
