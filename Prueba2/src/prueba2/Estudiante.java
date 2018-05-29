
package prueba2;


public class Estudiante {
    public String nombre;
    public int edad;

    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

   

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

    @Override
    public String toString() {
        return "Estudiante:" +" "+ "Nombre Estudiante:" + nombre + ", Edad=" + edad;
    }
}
