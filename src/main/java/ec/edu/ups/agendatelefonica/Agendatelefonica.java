package ec.edu.ups.agendatelefonica;

import ec.edu.ups.agendatelefonica.clases.OperadoraTelefonica;
import ec.edu.ups.agendatelefonica.clases.Persona;
import ec.edu.ups.agendatelefonica.clases.Telefono;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Asus
 */
public class Agendatelefonica {

    public static void main(String[] args) {
        
        Date fechaDeNacimientoUno = new Date(2000, 0, 15);
        Persona personaUno = new Persona("0123", "Juan Perez", fechaDeNacimientoUno);
        OperadoraTelefonica operadoraUno = new OperadoraTelefonica(1, "Claro");
        
        Telefono telefonoUno = new Telefono(997654321, "Movil", personaUno, operadoraUno);
        
        //Imprimir el objeto telefono
                
        //System.out.println(telefonoUno);
        
        //Manejo de Listas en Java
        
        Scanner entrada = new Scanner(System.in);
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList();
        
        String continuar = "N";
        do{
            System.out.println("Ingresa el codigo de la operadora: ");
            int codigo = entrada.nextInt();
            System.out.println("Ingrese el nombre de la operadora: ");
            String nombre = entrada.next();
            
            OperadoraTelefonica operadora = new OperadoraTelefonica();
            operadora.setCodigo(codigo);
            operadora.setNombre(nombre);
            operadoras.add(operadora);
            
            System.out.println("¿Desea ingresar otra operadora? (S/N) ");
            continuar = entrada.next();
        }while(continuar.equalsIgnoreCase("S"));
            
        for (OperadoraTelefonica operadorita : operadoras){
            System.out.println(operadorita);
        }
        
        /*
            Menu
            1. Registrar Contactos (Implementar)
            2. Registrar Operadoras (Implementar)
            3. Registrar Telefonos (No implementar)
            4. Salir
            
            Subir a GitHub (En teams)
        */
        
    }
}
