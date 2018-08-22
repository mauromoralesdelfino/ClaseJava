package prueba;

public class Persona 
{
  private double _dni;
  private String _nombre;
  private String _apellido; 
  
  
  public Persona(double dni,String nombre, String Apellido)
  {
	  _dni = dni;
	  _nombre=nombre;
	  _apellido = Apellido;
	  
  }
  public Persona()
  {}
  
  public String getNombre()
  {
          return _nombre;
  }
  public void setNombre(String nombre)
  {
          this._nombre = nombre;
  }

  public String getApellido()
  {
          return _apellido;
  }
  public void setApellido(String apellido)
  {
          this._apellido = apellido;
  }
  
  public double getDni()
  {
	  return _dni;
  }
  public void setDni(double dni)
  {
	  this._dni = dni;
  }
  
  @Override
  public String toString()
  { 
	  return "Nombre: " + this._nombre + " Apellido: " + this._apellido + " DNI: " + this._dni;
  }

 /* @Override
  public boolean equals(Object obj)
  {
	  if(obj instanceof Persona)
	  {
		  Persona tmpPersona = (Persona)obj;
		  if (this._nombre.equals(tmpPersona._nombre) && this._apellido.equals(tmpPersona._apellido) &&
				  this._dni == tmpPersona._dni) 
		  		{ return true; } 
		  else { return false; }
	  } 
	  else 
	  	{ return false; }
				 
	  
	  return true;
  }*/
  
  @Override
  public boolean equals(Object obj)
  {
	  if(this == obj)
	  {
		  return true;
		  
	  }
	  if(obj == null)
	  {
		  return false;
	  }
	  if(this.getClass() != obj.getClass())
	  	{
		  return false;
	  	}
	  
	  Persona tmpPersona = (Persona) obj;
	  //if(tmpPersona._dni != null)
	  	//{
		  if(this._dni == tmpPersona._dni)
		  {
			  return true;
		  }
	  	//}
	  
	  return false;
	  
  }
  @Override
  public int hashCode()
  {
	  final int key = 31;
	  int numero =1;
	  
	  if(this._nombre != null)
	  {
		  numero += numero *  key * this._nombre.hashCode();
	  }
	  if(this._apellido != null)
	  {
		  numero += numero *  key * this._apellido.hashCode();
	  }
	 
	  
	  return numero;
  }
}
