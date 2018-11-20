import java.util.ArrayList;

public class JefeDeZona extends Empleado{

	
	private int despacho;
	private Secretario sec;
	private ArrayList<Vendedor> listaVendedores;	
	private Coche auto;
	private final int AUMENTO=20;
	private final String PUESTO= "Jefe de Zona";

	
	//Getters & Setters
	public int getDespacho() {
		return despacho;
	}
	public void setDespacho(int despacho) {
		this.despacho = despacho;
	}
	public Secretario getSec() {
		return sec;
	}
	public void setSec(Secretario sec) {
		this.sec = sec;
	}
	
	public Coche getAuto() {
		return auto;
	}
	public void setAuto(Coche auto) {
		this.auto = auto;
	}
	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}
	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		
		
		this.listaVendedores = listaVendedores;
	}
	
	//Constructor	
	public JefeDeZona(String nombre, String apellido, int dni, String direccion, int antiguedad, String tel,
			double salario, Empleado supervisor,Secretario sec, ArrayList<Vendedor> listaVendedores,Coche auto,int despacho) {
		super(nombre, apellido, dni, direccion, antiguedad, tel, salario, supervisor);
		this.despacho=despacho;
		this.sec= sec;
		this.listaVendedores= new ArrayList<Vendedor>();
		this.auto=auto;
		
	}
	
	
	public void cambiarSecretario(Secretario newSecretario)
	{
		this.setSec(newSecretario);
	}
	public void cambiarCoche(Coche autitoNuevo)
	{
		this.setAuto(autitoNuevo);
	}
	
	public void altaVendedor(Vendedor vendedorNuevo)
	{
		listaVendedores.add(vendedorNuevo);
	}
	public void bajaVendedor(Vendedor chauVendedor)
	{
		listaVendedores.remove(chauVendedor);
	}
	
	public String toStrign()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()+"\n");
		sb.append("Puesto:" + this.PUESTO + "\n");
		sb.append("Despacho:" + this.despacho + "\n");
		sb.append("Auto de la Empresa: " + this.auto.toString() + "\n");
		sb.append("Secretario: " + this.sec.toStrign());
		for (Vendedor vend : this.listaVendedores) {
		    sb.append(vend.toString());
		}
		
		return sb.toString();
	}
	@Override
	public double incrementarSalario() {
		double salarioAumentado;
		this.setAntiguedad(this.antiguedad+1);
		salarioAumentado = this.salario+ (this.salario*AUMENTO)/100;
		
		return salarioAumentado;
	
	}
	
}
