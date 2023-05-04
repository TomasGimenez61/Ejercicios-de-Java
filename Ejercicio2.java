import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String p1;
	
		LinkedList<String> ej = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese la palabra numero: "+ (i+1));
			p1 = sc.nextLine();
			ej.add(p1);
		}
		
		System.out.println();

		System.out.println("Muestro array de forma que fue ingresado: ");
		System.out.println(ej);
		System.out.println();
		
		System.out.println("Muestro array de forma inversa que fue ingresado: ");
		ListIterator<String> itr = ej.listIterator(ej.size());
	
		while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
		
		sc.close();
	}

}
