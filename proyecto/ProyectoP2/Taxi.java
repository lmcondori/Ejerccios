
/**
 * Write a description of class Taxi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//Esta clase representa un taxi. --> Comentario general que puede incluir: cometido, autor, version, etc...
public class Taxi 
{//Nombre de la clase
    private String ciudad; //Ciudad de cada objeto de taxi
    private String matricula; //Matricula de cada objeto de taxi
    private String distrito; //Distrito de cada objeto de taxi
    private int tipoMotor; //tipo de motor asignado a cada objeto taxi. 0 = desconocido, 1 = gasolina, 2 = diesel
    
    //Constructor: cuando se cree un objeto taxi se ejecutará el código que incluyamos en el constructor
    public Taxi ()
    {
        ciudad = "Lima";
        matricula = "";
        distrito = "Desconocido";
        tipoMotor = 0;
    }//Cierre del constructor ... el código continua ...
    
    public void setMatricula (String valorMatricula)
    {
        matricula = valorMatricula; //La matricula del objeto taxi adopta el valor que contenga valorMatricula
    }//Cierre del método
    
    //Método para establecer el distrito de un taxi
    public void setDistrito (String valorDistrito)
    {
        distrito = valorDistrito; //El distrito del objeto taxi adopta el valor indicado
    }//Cierre del método
    
    public void setTipoMotor(int valorTipoMotor)
    {
        tipoMotor = valorTipoMotor; //El tipoMotor del objeto taxi adopta el valor que contenga valorTipoMotor
    }//Cierre del método
    
    //Método para obtener la matricula del objeto taxi
    public String getMatricula() {return matricula; } //Cierre del método
    //Método para obtener el distrito del objeto taxi
    public String getDistrito() {return distrito; } //Cierre del método
    //Método para obtener el tipo de motor del objeto taxi
    public int getTipoMotor() {return tipoMotor;} //Cierre del método
    
}//Cierre de la clase