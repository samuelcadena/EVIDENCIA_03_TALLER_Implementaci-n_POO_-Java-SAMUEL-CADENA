package Salud;

import java.util.Scanner;

public class Empleado extends Persona {
    //creo atributo de la subClase o de la clase 
    private String cargo;
    private static int valorHora;
    private static int horasTrabajadas;
    private String departamento;

    //creo el metodo constructor de la subclase y traje los atributos de la superClase
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo, int valorHora, String horasTrabajadas2, String departamento){

        super(tipoDoc,documento,nombre, apellido);
    this.cargo=cargo;
    this.valorHora=valorHora;
    this.horasTrabajadas=horasTrabajadas;
    this.departamento=departamento;
    }
    //creo los metodos propios de la subClase
    public static void calcularHorarios(){

        double totalPagar;

        totalPagar = valorHora*horasTrabajadas;
        totalPagar = ((totalPagar) - (0.9667100));


        System.out.println("su tipo de documento es: "+getTipoDocuments()+"su documento es: "+getDocumento()+"su nombre es:"+getNombre()+"su apellido es:"+getApellido()+"su cargo es: "+cargo()+"sus horas trabajadas son: "+horasTrabajadas()+"el valor por hora es de: "+valorHora()+"su departamento es: "+departamento());
    }
    private static String horasTrabajadas() {
        return null;
    }
}
    


