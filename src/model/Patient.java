package model;

public class Patient extends User {
    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor, se encarga de definir los atributos mandatorios de cada objeto
    public Patient(String name, String email){
        super(name, email); //Llamando al constructor de la clase padre
    }

    //Metodos

//    public void showPatientInfo() {
//        System.out.println("Nombre del paciente: " + name);
//        System.out.println("Telefono del paciente: " + phoneNumber);
//        System.out.println("ID del paciente: " + id);
//    }

    //Getters y Setters, ayudan a validar todo dato que se le quiera asignar a un atributo asi como la logica de negocio
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return (this.weight + " KG.");
    }

    public void setPhoneNumber(String phoneNumber) {
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    //Sobreescritura del método toString


    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeigh: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial del paciente");
    }
}
