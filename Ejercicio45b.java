import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio45b {

	public static void main(String[] args) {
			int numero;
			LinkedList<Integer> array = new LinkedList <>();
			LinkedList<Integer> arrayMayores = new LinkedList<>();
			int k = 0;
			int numIng;
			int cantidad;
				
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Ingrese cantidad de numeros a ingregar: ");
			cantidad = sc.nextInt();
				
			System.out.println("Ingrese numero inicial: ");
			numero = sc.nextInt();
				
			System.out.println();
				
			for (int i = 0; i < cantidad; i++) {
				System.out.println("Ingrese el "+(i+1)+"º de la lista: ");
				numIng = sc.nextInt();
				array.add(numIng);
					
				if (numIng > numero) {
					arrayMayores.add(numIng);
				}
			}
			System.out.println("Numeros mayores al numero inicial: "+ numero);	
	        while (k < arrayMayores.size()) {
	            System.out.println(arrayMayores.get(k));
	            k++;
	        }
	        
			sc.close();

	}

}
