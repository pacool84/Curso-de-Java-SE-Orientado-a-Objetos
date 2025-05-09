import static ui.UIMenu.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//
//        Doctor myDoctor = new Doctor(); //Declarando e instanciando mi objeto
//        myDoctor.name = "Paulina López";
//        myDoctor.showName();
//        myDoctor.showId();
//
//        Doctor myDoctorSebas = new Doctor();
//        myDoctor.showId();

//        showMenu();

        Doctor myOverChargeDoctor = new Doctor("Paulina Lopez", "Dentista");
        myOverChargeDoctor.showId();
        myOverChargeDoctor.showName();
        myOverChargeDoctor.showSpeciality();

//        Patient myPatient = new Patient("Sebastian Lopez", "5528886165");
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

        System.out.println("La referencia en memoria es: " + myVariablePatient); // Patient@65b3120a
        System.out.println("La referencia en memoria es: " + myVariablePatient2); // Patient@65b3120a
        System.out.println(myVariablePatient.getName()); // Sara Moreno
        System.out.println(myVariablePatient2.getName()); // Sara Moreno




    }
}