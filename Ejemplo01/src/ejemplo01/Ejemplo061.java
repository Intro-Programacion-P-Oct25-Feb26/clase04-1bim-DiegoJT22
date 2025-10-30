/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Diego Javier";
        String apellidoEstudiante = "Torres Auz";
        String edadEstudiante = "18";
        String direccionEstudiante = "Nueva Graada";
        String universidadEstudiante = "UTPL";
        String cicloEstudiante = "Primer ciclo";
        String nombreAsignatura = "Introduccion a la programacion";
        String paraleloEstudiante = "A";
        
        int nacimiento = 1983;
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        System.out.printf("Nombre:\n-\t%s\n "
                + "Apellido:\n-\t%s\n "
                + "Edad: \n-\t%s\n "
                + "Direccion: \n\n-\t%s\n----------------------------\n"
                + "Universidad: -\t%s\n "
                + "Ciclo Carrera: -\t%s\n "
                + "Asignatura: -\t%s\n Paralelo: \n-\t%s\n", nombreEstudiante,
                apellidoEstudiante, edadEstudiante, direccionEstudiante, universidadEstudiante, cicloEstudiante, nombreAsignatura, paraleloEstudiante);

    }
}
