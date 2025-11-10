/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario;

import arbolbinario.Implementaciones.Arbolito;
import arbolbinario.Implementaciones.Familiar;
import com.sun.source.tree.BinaryTree;

/**
 *
 * @author jobb2
 */
public class ArbolBinario {

    public static void main(String[] args) {

        Familiar abuela = new Familiar("Maria", 68, "Jubilada", false, "Navojoa");
        Familiar padre = new Familiar("Orlando", 37, "No me acuerdoXd", true, "Navojoa");
        Familiar madre = new Familiar("Anabel", 38, "cocina", false, "Navojoa");
        Familiar hijo = new Familiar("Orlando", 19, "Estudiante", false, "Navojoa");
        Arbolito<Familiar> ramaPadre = new Arbolito<>(padre);
        Arbolito<Familiar> ramaMadre = new Arbolito<>(madre, new Arbolito<>(abuela), null);
        Arbolito<Familiar> familia = new Arbolito<>(hijo, ramaPadre, ramaMadre);
   
        familia.imprimirInOrder();

        Familiar buscar = new Familiar("Patricio", 19, "Webon", false, "Navojoa");
        System.out.println("Esta el patricio en  arbol?: " + familia.buscar(buscar));
    }
}
    
    

