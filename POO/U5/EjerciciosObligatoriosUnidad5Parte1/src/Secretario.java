
public class Secretario extends Empleado {
	public final int AUMENTO=5;
	public final String PUESTO = "Secretario";
	private String despacho;
	private String numFax;
	
	
	public Secretario(String nombre, String apellido, int dni, String direccion, int antiguedad, String tel,
			double salario, Empleado supervisor, String despacho, String numFax) {
		super(nombre, apellido, dni, direccion, antiguedad, tel, salario, supervisor);
		this.despacho=despacho;
		this.numFax=numFax;
	}
	
	//aumento la antiguedad en 1 año, y aumento el salario en el monto fijado para el secretario
	@Override
	public double incrementarSalario() 
	{
		double salarioAumentado;
		this.setAntiguedad(this.antiguedad+1);
		salarioAumentado = this.salario+ (this.salario*AUMENTO)/100;
		
		return salarioAumentado;
	}
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public String getNumFax() {
		return numFax;
	}
	public void setNumFax(String numFax) {
		this.numFax = numFax;
	}

	public String toStrign()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\n________________________________________________________________________________\n");

		sb.append(super.toString()+"\n");
		sb.append("Puesto:" + this.PUESTO + "\n");
		sb.append("Despacho:" + this.despacho + "\n");
		sb.append("FAX: " + this.numFax + "\n");
		sb.append("supervisor: " + this.supervisor.nombre + " " + this.supervisor.apellido +  "\n");
		
		
		return sb.toString();
	}
	
}
