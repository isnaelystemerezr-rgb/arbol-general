public class Main {
    public static void main(String[] args) {
        ArbolGeneral arbol = new ArbolGeneral("A");

        NodoGeneral b = new NodoGeneral("B");
        NodoGeneral c = new NodoGeneral("C");
        NodoGeneral d = new NodoGeneral("D");

        arbol.raiz.agregarHijo(b);
        arbol.raiz.agregarHijo(c);
        arbol.raiz.agregarHijo(d);

        b.agregarHijo(new NodoGeneral("E"));
        b.agregarHijo(new NodoGeneral("F"));
        c.agregarHijo(new NodoGeneral("G"));
        d.agregarHijo(new NodoGeneral("H"));
        d.agregarHijo(new NodoGeneral("I"));

        System.out.println("Recorrido BFS:");
        arbol.bfs();   // A B C D E F G H I

        System.out.println("\nRecorrido DFS:");
        arbol.dfs();   // A B E F C G D H I
    }
}
