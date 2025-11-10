
package arbolbinario.Implementaciones;

/**
 *
 * @author jobb2
 */
public class Arbolito<T> extends ArbolComun<T> {
       public Arbolito() {
        raiz = null;
    }

    public Arbolito(T datoRaiz) {
        raiz = new NodoArbolBinario<>(datoRaiz);
    }

    public Arbolito(T datoRaiz, Arbolito<T> arbolIzq, Arbolito<T> arbolDer) {
        setTree(datoRaiz, arbolIzq, arbolDer);
    }

    public void setTree(T datoRaiz, Arbolito<T> arbolIzq, Arbolito<T> arbolDer) {
        raiz = new NodoArbolBinario<>(datoRaiz);
        if ((arbolIzq != null) && !arbolIzq.empty()) {
            raiz.hijoIzq = copy(arbolIzq.raiz);
        }
        if ((arbolDer != null) && !arbolDer.empty()) {
            raiz.hijoDer = copy(arbolDer.raiz);
        }
    }

    public NodoArbolBinario<T> copy(NodoArbolBinario<T> nodo) {
        NodoArbolBinario<T> nuevoNodo = new NodoArbolBinario<>(nodo.dato);
        if (nodo.hijoIzq != null) {
            nuevoNodo.hijoIzq = copy(nodo.hijoIzq);
        }
        if (nodo.hijoDer != null) {
            nuevoNodo.hijoDer = copy(nodo.hijoDer);
        }
        return nuevoNodo;
    }

    public boolean buscar(T dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(NodoArbolBinario<T> nodo, T dato) {
        if (nodo == null) return false;
        if (nodo.dato.equals(dato)) return true;
        return buscarRec(nodo.hijoIzq, dato) || buscarRec(nodo.hijoDer, dato);
    }

    public void imprimirInOrder() {
        imprimirInOrder(raiz);
    }

    private void imprimirInOrder(NodoArbolBinario<T> nodo) {
        if (nodo != null) {
            imprimirInOrder(nodo.hijoIzq);
            System.out.println(nodo.dato);
            imprimirInOrder(nodo.hijoDer);
}
    }
}

