package ui;

import java.sql.SQLOutput;
import java.util.Scanner;

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

        switch(response) {
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

        do{
            System.out.println("::Book an appointment");
            System.out.println("::Select a date");

        } while(response != 0);
    }
}
