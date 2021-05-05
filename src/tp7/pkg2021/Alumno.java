package tp7.pkg2021;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias=new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return apellido + " " + nombre;
    }
    public void agregarMateria(Materia m){
        if(materias.add(m)){
        JOptionPane.showMessageDialog(null,"La materia se agrego con exito");
        }else {JOptionPane.showMessageDialog(null,"La materia no se pudo agregar");}
    }
    public int cantidadMaterias(){
    return materias.size();
    }
    
    
}
