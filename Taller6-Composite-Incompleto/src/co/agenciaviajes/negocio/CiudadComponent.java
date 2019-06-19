package co.agenciaviajes.negocio;

/**
 * Ciudades a visitar
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class CiudadComponent extends PaqueteComponent {

    private int precio;

    private Vuelo vuelo;
    private Hotel hotel;
    private CityTour cityTour;
    private PlanAlimentacion planAlimentacion;
    
    // Completar constructor, getters and setters

    public CiudadComponent(String nombre, int precio) {
        super(nombre);
        this.precio = precio;
    }



    @Override
    public long getComponentPrecio() {
        return precio;
    }

}
