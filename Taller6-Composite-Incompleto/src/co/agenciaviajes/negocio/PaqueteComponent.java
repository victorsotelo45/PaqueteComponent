package co.agenciaviajes.negocio;

/**
 * Clase abstracta 
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public abstract class PaqueteComponent {

    private String nombre;

    public PaqueteComponent(String nombre) {
        this.nombre = nombre;
    }

    public void addComponent(PaqueteComponent component) throws Exception {
        throw new Exception("Invalid Operation. Not Supported");
    }

    public PaqueteComponent getComponent(int componentNum) throws Exception {
        throw new Exception("Invalid Operation. Not Supported");
    }

    public abstract long getComponentPrecio();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
