import java.util.ArrayList;

class NodoGeneral {
    String dato;
    ArrayList<NodoGeneral> hijos;

    NodoGeneral(String d) {
        dato = d;
        hijos = new ArrayList<NodoGeneral>();
    }

    void agregarHijo(NodoGeneral h) {
        hijos.add(h);
    }
}
