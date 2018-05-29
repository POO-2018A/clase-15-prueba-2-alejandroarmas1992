/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

/**
 *
 * @author ESFOT
 */
public class Materia {
    public String Nombre;
    public int Nivel;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getNivel() {
        return Nivel;
    }

    public Materia(String Nombre, int Nivel) {
        this.Nombre = Nombre;
        this.Nivel = Nivel;
    }

    @Override
    public String toString() {
        return "Materia:" + Nombre + ", Nivel:" + Nivel;
    }
}
