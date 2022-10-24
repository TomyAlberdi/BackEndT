import java.util.ArrayList;

public class Bosque {
    private ArrayList<Arbol> arboles;

    public Bosque() {
        this.arboles = new ArrayList<>();
    }

    public void agregarArbol(Arbol arbol) {
        arboles.add(arbol);
    }

    public String mostrarArboles() {
        return "Hay " + arboles.size() + " arbol " + arboles.get(0).tipo() ;
    }

}
