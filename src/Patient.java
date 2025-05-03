public class Patient {
    //Atributos
    static int id = 0;
    private String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String blood;

    //Constructor
    Patient(String name, String phoneNumber){
        id++;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //Metodos

    public void showPatientInfo() {
        System.out.println("Nombre del paciente: " + name);
        System.out.println("Telefono del paciente: " + phoneNumber);
        System.out.println("ID del paciente: " + id);
    }

}
