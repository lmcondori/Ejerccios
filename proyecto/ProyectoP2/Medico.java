
/**
 * Write a description of class Medico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medico
{
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    private String especialidad;
    
    public Medico(){
        nombre = "Luis";
        apellidos = "Condori";
        edad = 29;
        casado = true;
        numeroDocumentoIdentidad = "43393795";
        especialidad = "Pruebas";
    }
    
    public void setNombre(String valorNombre){
        System.out.println("Ha cambiado el nombre del médico de nombre " + this.nombre + " . El nuevo nombre es: " + valorNombre);
        nombre = valorNombre;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellidos(String valorApellidos){
        apellidos = valorApellidos;
        System.out.println("Ha cambiado el apellido del médico de nombre " + this.nombre + " . El nuevo apellido es: " + valorApellidos);
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setEdad(int valorEdad){
        edad = valorEdad;
        System.out.println("Ha cambiado la edad del médico de nombre " + this.nombre + " . La nueva edad es: " + valorEdad);
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setCasado(boolean valorCasado){
        casado = valorCasado;
        System.out.println("Ha cambiado el estado del médico de nombre " + this.nombre + " . El nuevo estado es: " + valorCasado);
    }
    
    public boolean getCasado(){
        return casado;
    }
    
    public void setNumeroDocumentoIdentidad(String valorNumeroDocumentoIdentidad){
        numeroDocumentoIdentidad = valorNumeroDocumentoIdentidad;
        System.out.println("Ha cambiado el numero de documento de identidad del médico de nombre " + this.nombre + " . El nuevo apellido es: " + valorNumeroDocumentoIdentidad);
    }
    
    public String getNumeroDocumentoIdentidad(){
        return numeroDocumentoIdentidad;
    }
    
    public void setEspecialidad(String valorEspecialidad){
        especialidad = valorEspecialidad;
        System.out.println("Ha cambiado la especialidad del médico de nombre " + this.nombre + " . La nueva especialidad es: " + this.especialidad);
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void calculoParaMultiploEdad(){
        int calculo;
        int constante = 5;
        int saldo = 3;
        int precioCaja = 2;
        int cantidadCajas = 4;
        calculo = this.edad % constante;
        calculo = constante - calculo;
        System.out.println("El médico de nombre " + nombre + " con especialidad " + especialidad + " tendrá una edad múltiplo de 5 dentro de " + Integer.toString(calculo) + " años");
        
        saldo -= precioCaja * cantidadCajas;
        System.out.println("El saldo es de " + Integer.toString(saldo) + ".");
    }
    
}
