
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables 
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;

    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
        // initialise instance variables
        
    }
    
    public void setNombre(String valorNombre){
        nombre = valorNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellidos(String valorApellidos){
        apellidos = valorApellidos;
    }
    
    public String getApellidos (){
        return apellidos;
    }
    
    public void setEdad (int valorEdad){
        edad = valorEdad;
    }
    
    public int getEdad (){
        return edad;
    }
    
    public void setCasado (boolean valorCasado){
        casado = valorCasado;
    }
    
    public boolean getCasado (){
        return casado;
    }
    
    public void setNumeroDocumentoIdentidad(String valorNumeroDocumentoIdentidad){
        numeroDocumentoIdentidad = valorNumeroDocumentoIdentidad;
    }
    
    public String getNumeroDocumentoIdentidad(){
        return numeroDocumentoIdentidad;
    }

}
