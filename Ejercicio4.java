import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numero;
		int enteros[];
		int enterosmay[];
		enteros = new int[5];
		enterosmay = new int[5];
		int j = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero inicial: ");
		numero = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Ingrese el "+(i+1)+"º de la lista: ");
			enteros[i] = sc.nextInt();
			
			if (enteros[i] > numero) {
				enterosmay[j] = enteros[i];
				j++;
			}
		}
		
		System.out.println("Los enteros mayores a: "+numero+" son: ");
		for (int k = 0; k < enterosmay.length; k++) {
			System.out.println(enterosmay[k]);
		}
		
		sc.close();
		
	}

}
