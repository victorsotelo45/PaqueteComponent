package co.agenciaviajes.negocio;

import java.util.ArrayList;

/**
 * Representa una region del planeta, como continente o pais
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class RegionComponent extends PaqueteComponent {

    public ArrayList<PaqueteComponent> regionContenido = new ArrayList();

    // Complete constructor

    public RegionComponent(String nombre) {
        super(nombre);
    }
    
    
    
    @Override
    public long getComponentPrecio() {
        long precioOfAllHojas = 0;

        for (Object component : regionContenido) {
            precioOfAllHojas = precioOfAllHojas + (((PaqueteComponent) component).getComponentPrecio());
        }
        return precioOfAllHojas;
    }
    
    
    // Complete demas  metodos
    @Override
    public void addComponent(PaqueteComponent fc){
        regionContenido.add(fc);
    }
    @Override
    public PaqueteComponent getComponent(int location){
        return regionContenido.get(location);
    }
            
}
