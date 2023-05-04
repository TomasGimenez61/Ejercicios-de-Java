
	public class Empleado5b extends Ejercicio55b{
		private String dni;
		private String nombre;
		private String apellido;
		private String email;
		private double sueldoBase;
		public double sueldoFinal;
		private int tipoEmpleado;

		
		public String getDni() {
			return dni;
		}


		public void setDni(String dni) {
			this.dni = dni;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public double getSueldoBase() {
			return sueldoBase;
		}


		public void setSueldoBase(double sueldoBase) {
			this.sueldoBase = sueldoBase;
		}


		public Empleado5b (String dniIng, String nombreIng, String apellidoIng, String emailIng, double sueldoBaseIng, int tipoEmpleadoIng) {
			super();
			this.dni = dniIng;
			this.nombre = nombreIng;
			this.apellido = apellidoIng;
			this.email = emailIng;
			this.sueldoBase = sueldoBaseIng;
			this.tipoEmpleado = tipoEmpleadoIng;
		}

		public double getSueldoFinal() {
			return sueldoFinal;
		}


		public void setSueldoFinal(double sueldoFinal) {
			this.sueldoFinal = sueldoFinal;
		}
		
		public static void main(String[] args) {
		
			
		}

		public int getTipoEmpleado() {
			return tipoEmpleado;
	}


		public void setTipoEmpleado(int tipoEmpleado) {
			this.tipoEmpleado = tipoEmpleado;
	}

	}

