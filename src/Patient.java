public class Patient {
    //Atributos
    static int id = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor, se encarga de definir los atributos mandatorios de cada objeto
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

    //Getters y Setters, ayudan a validar todo dato que se le quiera asignar a un atributo asi como la logica de negocio
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return (this.weight + " KG.");
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Patient.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8) {
            System.out.println("El número telefonica debe de ser de maximo 8 digitos");
        } else if(phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }

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
}
