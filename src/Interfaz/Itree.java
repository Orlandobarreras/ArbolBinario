/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Exepciones.TreeException;

/**
 *
 * @author jobb2
 */
public class Itree {
   

public interface ITree<T> {
    public T getRootData() throws TreeException; ;
    public int getHeight();
    public int getNumberNodes();
    public boolean empty();
    public void clear();
}
}