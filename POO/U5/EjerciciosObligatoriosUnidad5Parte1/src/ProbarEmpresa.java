import java.util.ArrayList;

public class ProbarEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche autito1 = new Coche ("AUDI", "j3", "44565498");
		Coche autito2 = new Coche ("AUDI", "j2", "44565498");
		Coche autito3 = new Coche ("AUDI", "j3", "44565498");
		Coche autito4 = new Coche ("AUDI", "j4", "44565498");
		Coche autito5 = new Coche ("AUDI", "j5", "44565498");
		
		
		Secretario lol = new Secretario("roberto", "ordoñez", 123124124, "lope de vega", 5, "45778888", 18000, null, "tres", "4545");
		JefeDeZona jefe =  new JefeDeZona("Jefe D", "Zona", 3213211, "una calle", 4, "444444",459876 , null, lol, null, autito1, 45);

		Vendedor vend1 = new Vendedor("vende1","apel",11111111,"calle 1",2,"444444",123124,jefe,autito2,"12312312",3,5);
		Vendedor vend2 = new Vendedor("vende2","apel",11111111,"calle 1",2,"444444",123124,jefe,autito3,"12312312",3,5);
		Vendedor vend3 = new Vendedor("vende3","apel",11111111,"calle 1",2,"444444",123124,jefe,autito4,"12312312",3,5);
		jefe.altaVendedor(vend1);
		jefe.altaVendedor(vend2);
		jefe.altaVendedor(vend3);
		
		autito1.toString();
		
		
		System.out.print("------------------------SECRETARIO--------------------------------------");
		
		System.out.print(lol.toStrign());
		
		System.out.print("-------------------------VENDEDOR-------------------------------------");
		
		System.out.print(vend1.toString());

		System.out.print("-------------------------JEFE-------------------------------------");
		
		System.out.print(jefe.toStrign());
		
		
		System.out.print("-------------------------BAJA VENDEDOR-------------------------------------");

		jefe.bajaVendedor(vend3);
		
		ArrayList<Vendedor> list = new ArrayList<Vendedor>();
		list = jefe.getListaVendedores();
		
		System.out.print(list.toString());
		
		
}
}

