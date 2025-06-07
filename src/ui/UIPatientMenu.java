package ui;

import model.Doctor;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Patient Menu");
            System.out.println("Welcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return to main menu");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response) {
                case 1:

                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        } while (response != 0);

    }

    public static void showBookAppointmentMenu() {
        int response = 0;

        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select a date");

            //Numeracion de la lista de fechas
            //Indice de la fecha seleccionada por el paciente
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();

            for (int i = 0; i < UIDoctorMenu.doctorAvailableAppointments.size(); i++) {
                int k = 0;
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size() ; j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }

            }

            Scanner scanner = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(scanner.nextLine());

        } while (response != 0);
    }
}
