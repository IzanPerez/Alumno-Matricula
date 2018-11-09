public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;
    // Longitud nombre
    private int longitudNombre;
    // Longitud matricula
    private int longitudMatricula;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3){
            nombre = nombreCompleto;
            System.out.println("Nombre con pocas letras");
        }
        else {
            nombre = nombreCompleto;
        }
        if (numeroMatricula.length() < 4){
            numeroMatricula = numeroMatriculaAlumno;
            System.out.println("Matricula con pocos digitos");
        }
        else {
            numeroMatricula = numeroMatriculaAlumno;
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int longitudNombre;
        int longitudMatricula;
        if (nombre.length() < 3) {
          longitudNombre = nombre.length();
        }
        else {
         longitudNombre = 3;
        }
        if(numeroMatricula.length() < 4 ){
            longitudMatricula = numeroMatricula.length();
        }
        else {
            longitudMatricula = 4;
        }
        return nombre.substring(0, longitudNombre) + numeroMatricula.substring(0, longitudMatricula);
    }
}
