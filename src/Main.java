import model.*;

import java.util.Date;

import static ui.UIMenu.showMenu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//
//        model.Doctor myDoctor = new model.Doctor(); //Declarando e instanciando mi objeto
//        myDoctor.name = "Paulina López";
//        myDoctor.showName();
//        myDoctor.showId();
//
//        model.Doctor myDoctorSebas = new model.Doctor();
//        myDoctor.showId();

        showMenu();

        Doctor myOverChargeDoctor = new Doctor("Paulina Lopez", "Dentista");
//        myOverChargeDoctor.showId();
//        myOverChargeDoctor.showName();
        myOverChargeDoctor.showSpeciality();

//        myOverChargeDoctor.addAvailableAppointment(new Date(), "16:00");
//        myOverChargeDoctor.addAvailableAppointment(new Date(), "17:00");
//        myOverChargeDoctor.addAvailableAppointment(new Date(), "17:30");

        System.out.println(myOverChargeDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment timeAvailable : myOverChargeDoctor.getAvailableAppointments()) {
            System.out.println("Horario Disponible: " + timeAvailable.getDate() + " " + timeAvailable.getTime());
        }

//        model.Patient myPatient = new model.Patient("Sebastian Lopez", "5528886165");
//        myPatient.showPatientInfo();
//
//        System.out.println(myPatient.name = "Mateo Hernandez");

//      Usando Setters y Getters
        Patient myPatient = new Patient("Brenda Rosales", "5528886165");
        myPatient.setWeight(70.5);
        myPatient.setPhoneNumber("5528886165");
        System.out.println(myPatient.getName() + " " + myPatient.getPhoneNumber() + " " + myPatient.getWeight());

//      Variables primitivas y objetos en memoria

        Patient myVariablePatient = new Patient("Santi Moreno", "5528886165");
        Patient myVariablePatient2 = new Patient("Sara Moreno", "5528886165");

        System.out.println("La referencia en memoria es: " + myVariablePatient);
        System.out.println("La referencia en memoria es: " + myVariablePatient2);
        System.out.println(myVariablePatient.getName()); // Santi Moreno
        System.out.println(myVariablePatient2.getName()); // Sara Moreno

        myVariablePatient = myVariablePatient2; //Se asigna la referencia de memoria de myVariablePatient2 a myVariablePatient

        System.out.println("La referencia en memoria es: " + myVariablePatient); // model.Patient@65b3120a
        System.out.println("La referencia en memoria es: " + myVariablePatient2); // model.Patient@65b3120a
        System.out.println(myVariablePatient.getName()); // Sara Moreno
        System.out.println(myVariablePatient2.getName()); // Sara Moreno

        //Validando la sobre escritura del metodo toString()
        Patient myOverWritePatient = new Patient("Zury", "zury@hotmail.com");
        System.out.println(myOverWritePatient);

        //Creando objetos de las clases Doctor, Nurse y Patient desde el concepto de abstract class y polimorfismo
        User userDoctor = new Doctor("anahi", "anahi@hotmail.com");
        User userNurse = new Nurse("Brendita", "vicky@hotmail.com");
        User userPatient = new Patient("Sebas", "chevy@hotmail.com");
//      Veamos polimorfismo
        userDoctor.showDataUser();
        userNurse.showDataUser();
        userPatient.showDataUser();

        //Clases Anonimas, Hack para crear objetos de una clase abstracta en donde su ciclo de vida es solo en el momento que se crea el objeto
//Esta tecnica se utiliza usualmente en ANDROID para crear listeners, callbacks, etc.
        User userForClassAnonymous = new User("Paquito", "pacool@hotmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Soy una clase anonima que implementa el metodo abstracto de la clase model.User");
            }
        };
        userForClassAnonymous.showDataUser();
    }

    ISchedulable mySchedulable = new ISchedulable() {
        @Override
        public void schedule(Date date, String time) {
            System.out.println("Estoy utilizando mi interfaz ISchedulable para programar una cita.");
            System.out.println("Cita programada para el " + date + " a las " + time);
        }
    };

    //Falta corregir este error de compilacion, no se puede crear un objeto de una interfaz
    // mySchedulable.schedule(new Date(), "10:00 AM");
}