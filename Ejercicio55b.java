import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio55b {
	
	public static void main(String[] args) {
		
		String dniIng;
		String nombreIng;
		String apellidoIng;
		String emailIng;
		double SueldoBaseIng;
		int hsExtraIng;
		int hsMesIng;
		int porcenComisionIng;
		int totalVentasIng;
		int seguir = 1;
		int i=0;
		int opcion;
		int tipoEmpleadoIng;
		ArrayList<Empleado5b> arrayEmpleados = new ArrayList<>();
		boolean contMenu = true;
		int opMenu;
		
		
		Scanner sc = new Scanner(System.in);
		while (contMenu == true) {
			System.out.println("----- BIENVENIDO AL SISTEMA -----");
			System.out.println("Ingrese una opcion para continuar: ");
			System.out.println("Ingrese 1: ALTA EMPLEADO - 2: LISTADO DE EMPLEADOS - 0: SALIR ");
			opMenu = sc.nextInt();
			if (opMenu == 1) {
				while (seguir == 1 && i <= 20) {
					System.out.println("----- INGRESO DE EMPLEADOS -----");
					System.out.println("¿Desea ingregar un empleado admninistrativo o empleado vendedor?");
					System.out.println("Ingrese 1 para administrativo o 2 para vendedor: " );
					opcion = sc.nextInt();
					if (opcion == 1) {
						tipoEmpleadoIng = 1; 
						System.out.println();
						System.out.println("Ingrese DNI del empleado");
						dniIng = sc.nextLine();
						System.out.println("Ingrese nombre del empleado");
						nombreIng= sc.nextLine();
						System.out.println("Ingrese apellido del empleado");
						apellidoIng = sc.nextLine();
						System.out.println("Ingrese email del empleado");
						emailIng = sc.nextLine();
						System.out.println("Ingrese sueldo base del empleado");
						SueldoBaseIng = sc.nextDouble();
						System.out.println("Ingrese horas por mes del empleado");
						hsMesIng = sc.nextInt();
						System.out.println("Ingrese horas extras del empleado");
						hsExtraIng = sc.nextInt();			
						
						Administrativo5b nuevoEmp = new Administrativo5b (dniIng, nombreIng, apellidoIng, emailIng, opcion, hsExtraIng, hsMesIng, tipoEmpleadoIng);
						nuevoEmp.getsueldoFinal(SueldoBaseIng, hsExtraIng, hsMesIng);
						arrayEmpleados.add(nuevoEmp);
						i++;
						
					} 
					
					if (opcion == 2) {
						tipoEmpleadoIng = 2;
						System.out.println();
						System.out.println("Ingrese DNI del empleado");
						dniIng = sc.nextLine();
						System.out.println("ingrese nombre del empleado");
						nombreIng= sc.nextLine();
						System.out.println("Ingrese apellido del empleado");
						apellidoIng = sc.nextLine();
						System.out.println("Ingrese email del empleado");
						emailIng = sc.nextLine();
						System.out.println("Ingrese sueldo base del empleado");
						SueldoBaseIng = sc.nextDouble();
						System.out.println("Ingrese porcentaje de comision del empleado");
						porcenComisionIng = sc.nextInt();
						System.out.println("Ingrese total ventas del empleado");
						totalVentasIng = sc.nextInt();	
						
						Vendedor5b nuevoEmp = new Vendedor5b(dniIng, nombreIng, apellidoIng, emailIng, SueldoBaseIng, porcenComisionIng, totalVentasIng, tipoEmpleadoIng);
						nuevoEmp.getsueldoFinal(SueldoBaseIng, porcenComisionIng, totalVentasIng);
						arrayEmpleados.add(nuevoEmp);
						i++;
					}
					System.out.println();
					System.out.println("¿Desea ingresar un nuevo empleado?");
					System.out.println("Ingrese 1 para SI - 0 para NO");
					seguir = sc.nextInt();
			}
		
			} // end while
			
			if (opMenu == 2) {
				System.out.println("------ LISTADO DE EMPLEADOS -------");
				for (int j = 0; j < arrayEmpleados.size(); j++) {
					System.out.println("Tipo de empleado: ");
					if (arrayEmpleados.get(j).getTipoEmpleado() == 1) {
						System.out.println("Empleado tipo ADMINISTRATIVO ");
					} 
					else {
						System.out.println("Empleado tipo VENDEDOR");
					}
					System.out.println();
					System.out.println("DNI del empleado: " + arrayEmpleados.get(j).getDni());
					System.out.println();
					
					System.out.println("Nombre del empleado: "+ arrayEmpleados.get(j).getNombre());
					System.out.println();
					
					System.out.println("Apellido del empleado: "+ arrayEmpleados.get(j).getApellido());
					System.out.println();
					 
					System.out.println("Sueldo del empleado: " + arrayEmpleados.get(j).getSueldoFinal());
					System.out.println();
					System.out.println();
					System.out.println();
					
				}
			}
			
			if (opMenu == 0) {
				contMenu = false;
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("     GRACIAS POR USAR EL SISTEMA  ");
		}
}
		sc.close();
		System.out.println("---------------------------------------");
} //end main
	
} // end public class

