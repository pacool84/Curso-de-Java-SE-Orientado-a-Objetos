package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                   // showPatientMenu();
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType) {
        //userType = 1 Doctor
        //userType = 2 Patient
        ArrayList<Doctor> doctors = new ArrayList<>(); //Lista que solo puede almacenar objetos de tipo Doctor
        doctors.add(new Doctor("Dr. Santiago Hernandez", "santiago.hernandez@hotmail.com"));
        doctors.add(new Doctor("Dr. Maria Lopez", "maria.lopez@hotmail.com"));
        doctors.add(new Doctor("Dr. Juan Perez", "juan.perez@hotmail.com"));

        ArrayList<Patient> patients = new ArrayList<>(); //Lista que solo puede almacenar objetos de tipo Patient
        patients.add(new Patient("Ana Gomez", "ana.gomez@gmail.com"));
        patients.add(new Patient("Carlos Ruiz", "carlos.ruiz@gmail.com"));
        patients.add(new Patient("Laura Torres", "laura.torres@gmail.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("Enter your email [xxx@gmail.com]: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if(userType == 1) {
                for(Doctor doc: doctors){
                    if(doc.getEmail().equals(email)){
                        System.out.println("Welcome " + doc.getName());
                        emailCorrect = true;

                        //Obtener el usuario logeado
                        doctorLogged = doc;

                        //Mostrar el menu del doctor

                    }
                }
            }

            if(userType == 2) {
                for(Patient pat: patients){
                    if(pat.getEmail().equals(email)){
                        System.out.println("Welcome " + pat.getName());
                        emailCorrect = true;

                        //Obtener el usuario logeado
                        patientLogged = pat;

                        //Mostrar el menu del paciente
                        showPatientMenu();
                    }
                }
            }

        }while (!emailCorrect);
    };

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println( i+1 + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}