import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArbolGeneral {
    NodoGeneral raiz;

    ArbolGeneral(String d) {
        raiz = new NodoGeneral(d);
    }

    // Recorrido en Anchura (BFS) usando cola
    void bfs() {
        Queue<NodoGeneral> cola = new LinkedList<NodoGeneral>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            NodoGeneral n = cola.poll();
            System.out.print(n.dato + " ");
            for (NodoGeneral h : n.hijos) {
                cola.add(h);
            }
        }
    }

    // Recorrido en Profundidad (DFS) usando pila
    void dfs() {
        Stack<NodoGeneral> pila = new Stack<NodoGeneral>();
        pila.push(raiz);

        while (!pila.isEmpty()) {
            NodoGeneral n = pila.pop();
            System.out.print(n.dato + " ");
            for (int i = n.hijos.size() - 1; i >= 0; i--) {
                pila.push(n.hijos.get(i));
            }
        }
    }
}
