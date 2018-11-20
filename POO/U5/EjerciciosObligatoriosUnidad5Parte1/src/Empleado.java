
public abstract class Empleado {
	
	protected String nombre;
	protected String apellido;
	protected int dni;
	protected String direccion;
	protected int antiguedad;
	protected String tel;
	protected double salario;
	protected Empleado supervisor;
	
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Empleado(String nombre, String apellido, int dni, String direccion, int antiguedad,String tel,double salario,Empleado supervisor) 
	{
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.direccion=direccion;
		this.antiguedad=antiguedad;
		this.tel=tel;
		this.salario=salario;
		this.supervisor=supervisor;			
	}
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: " + this.nombre + "\n");
		sb.append("Apellido: " + this.apellido + "\n");
		sb.append("dni: " + this.dni + "\n");
		sb.append("Direccion: " + this.direccion + "\n");
		sb.append("antiguedad: " + this.antiguedad + "\n");
		sb.append("tel: " + this.tel + "\n");
		sb.append("salario: " + this.salario + "\n");
		sb.append("supervisor: " + this.supervisor + "\n");
		
		return sb.toString();
		
		
	}
	
	public void cambiarSupervisor(Empleado supervisorNuevo)
	{
		this.supervisor= supervisorNuevo;
	}
	
	public abstract double incrementarSalario();
	

}
