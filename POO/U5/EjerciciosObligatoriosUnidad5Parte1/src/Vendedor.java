
public class Vendedor extends Empleado{


	
	private  Coche empresaCar;
	private String cel;
	private int comision;
	private final int AUMENTO = 10;
	private final String PUESTO= "Vendedor";
	private int areaVenta;
	
	public Coche getEmpresaCar() {
		return empresaCar;
	}
	public void setEmpresaCar(Coche empresa) {
		this.empresaCar = empresa;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public int getAUMENTO() {
		return AUMENTO;
	}
	public int getAreaVenta() {
		return areaVenta;
	}
	public void setAreaVenta(int areaVenta) {
		this.areaVenta = areaVenta;
	}
	public Vendedor(String nombre, String apellido, int dni, String direccion, int antiguedad, String tel,
			double salario, Empleado supervisor, Coche autito, String cel, int comision, int area) {
		super(nombre, apellido, dni, direccion, antiguedad, tel, salario, supervisor);
		this.empresaCar=autito;
		this.cel=cel;
		this.comision=comision;
		this.areaVenta=area;
		
		
	}
	@Override
	public double incrementarSalario() {
		this.antiguedad++;
		double newSalario= this.salario + ((this.salario * AUMENTO)/100);
		this.setSalario(newSalario);
		return newSalario;
	}
	
	public void cambiarCoche(Coche nuevoCoche)
	{
		this.empresaCar=nuevoCoche;
	}
	
	public  String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\n________________________________________________________________________________\n");

		sb.append(super.toString()+"\n");
		sb.append("Puesto:" + this.PUESTO + "\n");
		sb.append("area:" + this.areaVenta + "\n");
		sb.append("cel: " + this.cel + "\n");
		sb.append("Coche de la Empresa" + this.empresaCar.toString());
		sb.append("supervisor: " + this.supervisor.nombre + " " + this.supervisor.apellido +  "\n");
		
		
		return sb.toString();
	}

	
	
}
