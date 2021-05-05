package tp7.pkg2021;

public class Colegio {

    
    public static void main(String[] args) {
        Materia ingles=new Materia(101,"Ingles I",1);
        Materia matematica=new Materia(102,"Matematica I",1);
        Materia laboratorio=new Materia(103,"Lab I",1);
        Alumno alumno1 = new Alumno(1001,"Lopez","Martin");
        Alumno alumno2 = new Alumno(1002,"Martinez","Brenda");
        alumno1.agregarMateria(ingles);
        alumno1.agregarMateria(matematica);
        alumno1.agregarMateria(laboratorio);
        alumno2.agregarMateria(ingles);
        alumno2.agregarMateria(matematica);
        alumno2.agregarMateria(laboratorio);
        alumno2.agregarMateria(laboratorio);
        System.out.println(alumno1.cantidadMaterias());
        System.out.println(alumno2.cantidadMaterias());
    }
    
}
