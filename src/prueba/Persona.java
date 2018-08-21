package prueba;

public class Persona 
{
  private int _dni;
  private String _nombre;
  private String _apellido; 
  
  
  public Persona(int dni,String nombre, String Apellido)
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
  
  public int getDni()
  {
	  return _dni;
  }
  public void setDni(int dni)
  {
	  this._dni = dni;
  }
  
  @Override
  public String toString()
  { 
	  return "Nombre: " + this._nombre + " Apellido: " + this._apellido + " DNI: " + this._dni;
  }

}
