package prueba;

public class Main 
{

	public static void main(String[] args)
	{
		System.out.println("Bienvenidos!");
		
		
		//Persona p1 = new Persona(122,"Mauro","Morales Delfino");
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		//p2.setDni(122);
		p1.setNombre("Mauro");
		p1.setApellido("Morales Delfino");
		p2.setNombre("Mauro");
		p2.setApellido("Morales Delfino");
		/*imprimir hashcode */
		
		if(p1.equals(p2))
		{
		
			System.out.println("iguales");
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
		}
		else
		{
			System.out.println("NONONO");
		}
		
		if(p1.hashCode() == p2.hashCode())
		{
			System.out.println(p1.hashCode());
			System.out.println("NONONO");
			System.out.println(p2.hashCode());
		}
		
	}
	
	
	
	
}
