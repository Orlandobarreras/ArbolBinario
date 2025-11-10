/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario.Implementaciones;

/**
 *
 * @author jobb2
 */
public class Familiar {
      private String nombre;
    private int edad;
    private String ocupacion;
    private boolean finado;
    private String lugarNacimiento;

    public Familiar(String nombre, int edad, String ocupacion, boolean finado, String lugarNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.finado = finado;
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años, " + ocupacion + ", " +
               (finado ? "finado" : "vivo") + ", nacido en " + lugarNacimiento + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Familiar f = (Familiar) obj;
        return nombre.equalsIgnoreCase(f.nombre);
}
}
