package vuelos;

import java.util.Comparator;

public class CriteriosComparacion {
    
}
class porRentabilidad implements Comparator<Vuelo>{

    @Override
    public int compare(Vuelo o1, Vuelo o2) {
        return(o1.getNumPasajeros()*(int)(o1.getPrecio()))-(o2.getNumPasajeros()*(int)(o2.getPrecio()));
    }
}

