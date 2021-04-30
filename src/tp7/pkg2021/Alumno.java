package tp7.pkg2021;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;

    public Alumno(int legajo, String apellido) {
        this.legajo = legajo;
        this.apellido = apellido;
    }

    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
