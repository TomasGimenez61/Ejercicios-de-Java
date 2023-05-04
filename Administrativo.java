
public class Administrativo extends Empleado {
	private int hsExtra;
	private int hsMes;

	public int getHsExtra() {
		return hsExtra;
	}


	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}


	public int getHsMes() {
		return hsMes;
	}


	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}

	public double setsueldoFinal() {
		return sueldoFinal;
	}
	public double getsueldoFinal(double sueldoBase, int hsExtra, int hsMes){
			sueldoFinal = sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes;
		return sueldoFinal;
	}                                  
	
	public Administrativo(String dniIng, String nombreIng, String apellidoIng, String emailIng, double sueldoBaseIng, int hsExtraIng,
			int hsMesIng, int tipoEmpleadoIng) {
		super(dniIng, nombreIng, apellidoIng, emailIng, sueldoBaseIng, tipoEmpleadoIng);
		this.hsExtra = hsExtraIng;
		this.hsMes = hsMesIng;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
