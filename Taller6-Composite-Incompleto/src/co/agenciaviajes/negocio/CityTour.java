package co.agenciaviajes.negocio;

/**
 * Almacena los tours por una determinada ciudad
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class CityTour {

    private String[] tours;

    public CityTour(String[] tours) {
        this.tours = tours;
    }

    public String[] getTours() {
        return tours;
    }

    public void setTours(String[] tours) {
        this.tours = tours;
    }

}
