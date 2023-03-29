package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;
import Salud.Suma;

public class Inicio {
    public static void main(String[] args) {
        int num1,num2,resultado;
         /*//crear un objeto-> Instancia una clase
         Persona documento=new Persona();
         //invocando un metodo
         sumar.registrarDocuments();
         sumar.mostrarDocuments();
         sumar.pesoActual();
         sumar.mayorEdad();*/
         Suma sumar=new Suma();
         //invocar metodos
         sumar.perdirNumero();
         sumar.restar();
         sumar.sumar();
         sumar.mostrarDocuments();
         Scanner captura=new Scanner(System.in);
         System.out.println("Ingresar el primer numero");
         num1=captura.nextInt();
         System.out.println("Ingresar el segundo numero");
         num2=captura.nextInt();
         // Argumentos se envian 
         sumar.sumar(num1, num2);
         resultado=sumar.restar();
         sumar.mostrarDocuments();
         System.out.println("el resultado de la resta es "+resultado);
         sumar.mostrarDocuments(); 
        //aqui empieza el tercero 
        
        //pido datos de la clase 
        System.out.println("por favor digite el tipo de documento ya sea CC o TI");
        String tipoDocuments = captura.next();

        System.out.println("por favor digite su numero de documento");
        int documento = captura.nextInt();

        System.out.println("por favor digite su nombre");
        String nombre = captura.next();

        System.out.println("por favor digite su apellido");
        String apellido = captura.next();

        System.out.println("por favor digite su cargo");
        String cargo = captura.next();

        System.out.println("por favor digite el valor de la hora");
        int valorHora = captura.nextInt();

        System.out.println("por favor digite las horas trabajadas");
        String horasTrabajadas = captura.next();

        System.out.println("por favor digite su departamento");
        String departamento = captura.next();

        Empleado empleado=new Empleado(tipoDocuments, documento, nombre, apellido, cargo, valorHora, horasTrabajadas, departamento);
        Empleado.calcularHorarios();
        captura.close();
         

}

} 
         
 
 
