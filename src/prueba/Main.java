package prueba;

public class Main 
{

	public static void main(String[] args)
	{
		System.out.println("Bienvenidos!");
		
		
		Persona p1 = new Persona(37762902,"Mauro","Morales Delfino");
		Persona p2 = new Persona();
		p2.setDni(37762902);
		p2.setNombre("Mauro");
		p2.setApellido("Morales Delfino");
		
		
		if(p1 == p2)
		{
			System.out.println("BHola!");
		}
		
	}
	
	
	
	
}
