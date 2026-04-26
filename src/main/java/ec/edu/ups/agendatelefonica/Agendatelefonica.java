package ec.edu.ups.agendatelefonica;

import ec.edu.ups.agendatelefonica.clases.OperadoraTelefonica;
import ec.edu.ups.agendatelefonica.clases.Persona;
import ec.edu.ups.agendatelefonica.clases.Telefono;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Agendatelefonica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Telefono> contactos = new ArrayList<>();
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList<>();

        int selec;

        do {
            System.out.println("\n--Menu--");
            System.out.println("1. Ingresar contactos");
            System.out.println("2. Ingresar operadoras");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            selec = entrada.nextInt();

            switch (selec) {

                case 1:
                    String continuar1;

                    do {
                        System.out.println("\nRegistrar contacto");

                        System.out.print("Ingrese el numero de telefono: ");
                        int numeroTelefono = entrada.nextInt();

                        System.out.print("Ingrese el tipo de telefono: ");
                        String tipoTelefono = entrada.next();

                        System.out.print("Ingrese la cedula de la persona: ");
                        String cedula = entrada.next();

                        System.out.print("Ingrese el nombre de la persona: ");
                        String nombrePersona = entrada.next();


                        Persona persona = new Persona();
                        persona.setCedula(cedula);
                        persona.setNombre(nombrePersona);

                        Telefono telefono = new Telefono();
                        telefono.setNumero(numeroTelefono);
                        telefono.setTipo(tipoTelefono);
                        telefono.setUnaPersona(persona);

                        contactos.add(telefono);

                        System.out.println("\nContacto registrado:");
                        System.out.println(telefono);

                        System.out.print("\n¿Desea ingresar otro contacto? (S/N): ");
                        continuar1 = entrada.next();

                    } while (continuar1.equalsIgnoreCase("S"));

                    break;

                case 2:
                    String continuar2;

                    do {
                        System.out.println("\n--- Registrar operadora ---");

                        System.out.print("Ingrese el codigo de la operadora: ");
                        int codigo = entrada.nextInt();

                        System.out.print("Ingrese el nombre de la operadora: ");
                        String nombre = entrada.next();

                        OperadoraTelefonica operadora = new OperadoraTelefonica();
                        operadora.setCodigo(codigo);
                        operadora.setNombre(nombre);

                        operadoras.add(operadora);

                        System.out.println("\nOperadora registrada:");
                        System.out.println(operadora);

                        System.out.print("\n¿Desea ingresar otra operadora? (S/N): ");
                        continuar2 = entrada.next();

                    } while (continuar2.equalsIgnoreCase("S"));

                    break;

                case 3:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (selec != 3);

        entrada.close();
    }
}
