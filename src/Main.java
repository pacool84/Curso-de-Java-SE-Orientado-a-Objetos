//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Doctor myDoctor = new Doctor(); //Declarando e instanciando mi objeto
        myDoctor.name = "Paulina López";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorSebas = new Doctor();
        myDoctor.showId();


    }
}