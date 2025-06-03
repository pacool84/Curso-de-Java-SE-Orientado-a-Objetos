package ui;

import model.Doctor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println(("\n\n"));
            System.out.println("Welcome Doctor " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My Schedule appointments");
            System.out.println("3. Logout");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    UIMenu.showMenu();
                    break;

            }

        } while (response != 0);
    }

    ;

    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;

        do {
            System.out.println();
            System.out.println("::Add available appointment");
            System.out.println("::Select a month");

            for (int i = 0; i <= 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            if (response > 0 && response <= 4) {
                //1,2,3
                int monthSelected = response;
                System.out.println(monthSelected + " ." + UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available: (DD/MM/YYYY)");
                String date = scanner.nextLine();

                System.out.println("Your date is: " + date + "\n 1. Correct \n 2. Change Date");
                int responseDate = Integer.valueOf(scanner.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time avaliable for date: " + date + " (HH:MM)");
                    time = scanner.nextLine();
                    System.out.println("Your time is: " + time + "\n 1. Correct \n 2. Change Time");
                    responseTime = Integer.valueOf(scanner.nextLine());

                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            } else if (response == 0) {
                showDoctorMenu();
            }
        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 && !doctorAvailableAppointments.contains(doctor)) {
            doctorAvailableAppointments.add(doctor);

        }
    }
}
