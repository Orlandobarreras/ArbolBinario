/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario.Implementaciones;

import Interfaz.Itree.ITree;
import Exepciones.TreeException;

/**
 *
 * @author jobb2
 */
public class ArbolComun <T> implements ITree<T> {

    public static class NodoArbolBinario<T> {
        T dato;
        NodoArbolBinario<T> hijoIzq;
        NodoArbolBinario<T> hijoDer;

        public NodoArbolBinario(T dato) {
            this.dato = dato;
        }
    }

    public NodoArbolBinario<T> raiz;

    @Override
    public T getRootData() throws TreeException {
        if (empty()) {
            throw new TreeException("el Arbol esta vacio");
        }
        return raiz.dato;
    }

    @Override
    public int getHeight() {
        return getHeight(raiz);
    }

    public int getHeight(NodoArbolBinario<T> nodo) {
        int height = 0;
        if (nodo != null) {
            height = 1 + Math.max(getHeight(nodo.hijoIzq), getHeight(nodo.hijoDer));
        }
        return height;
    }

    @Override
    public int getNumberNodes() {
        return getNumberNodes(raiz);
    }

    private int getNumberNodes(NodoArbolBinario<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        int numNodosIzq = getNumberNodes(nodo.hijoIzq);
        int numNodosDer = getNumberNodes(nodo.hijoDer);
        return 1 + numNodosIzq + numNodosDer;
    }

    @Override
    public boolean empty() {
        return raiz == null;
    }

    @Override
    public void clear() {
        raiz = null;
}
}
