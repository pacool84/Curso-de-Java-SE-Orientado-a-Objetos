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

        Patient myPatient = new Patient("Sebastian Lopez", "5528886165");
        myPatient.showPatientInfo();

    }
}