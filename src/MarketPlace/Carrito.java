package MarketPlace;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Elemento> cesta;

    public Carrito(){
        this.cesta = new ArrayList<>();
    }

    public void agrega(Elemento e){
        cesta.add(e);
    }

    public int numeroDeElementos(){
        return cesta.size();
    }

    public double importeTotal(){
        double total = 0.0;
        for (Elemento e : cesta) {
            total += (e.getPrecio() * e.getCantidad());
        }
        return total;
    }
}
