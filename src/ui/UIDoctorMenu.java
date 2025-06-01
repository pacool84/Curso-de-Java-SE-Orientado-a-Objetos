package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println(("\n\n"));
            System.out.println("Welcome Doctor " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My Schedule appointments");
            System.out.println("3. Logout");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    UIMenu.showMenu();
                    break;

            }

        }while (response != 0);
    };

    private static void showAddAvailableAppointmentMenu() {
        int response = 0;

        do{
            System.out.println();
            System.out.println("::Add available appointment");
            System.out.println("::Select a month");

            for (int i = 0; i<=3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            if(response > 0 && response <= 4){
                int monthSelected = response;
                System.out.println(monthSelected + " ." + UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available: (DD/MM/YYYY)");
                String date = scanner.nextLine();

                System.out.println("Your date is: " + date + "\n 1. Correct \n 2. Change Date");

            } else if(response == 0){
                showDoctorMenu();
            }
        } while (response != 0);
    }
}
