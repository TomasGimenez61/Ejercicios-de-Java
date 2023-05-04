public class Vendedor5b extends Empleado5b {
	private int porcenComision;
	private int totalVentas;

	
	public int getPorcenComision() {
		return porcenComision;
	}

	public void setPorcenComision(int porcenComision) {
		this.porcenComision = porcenComision;
	}


	public int getTotalVentas() {
		return totalVentas;
	}


	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}

	public double setsueldoFinal() {
		return sueldoFinal;
	}
	
	public Vendedor5b (String dniIng, String nombreIng, String apellidoIng, String emailIng, double sueldoBaseIng, int porcenComisionIng,
			int totalVentasIng, int tipoEmpleadoIng) {
		super(dniIng, nombreIng, apellidoIng, emailIng, sueldoBaseIng, tipoEmpleadoIng);
		this.porcenComision = porcenComisionIng;
		this.totalVentas = totalVentasIng;
	}

	public double getsueldoFinal(double sueldoBase, int porcenComision, int totalVentas){
		sueldoFinal = sueldoBase + (porcenComision*totalVentas/100);
	return sueldoFinal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
