package model;

//Al agregar "abstract" a la clase User, estamos indicando que esta clase no puede ser instanciada, es decir, no se pueden crear objetos de esta clase desde fuera de ella.
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //Constructor del Usuario
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.phoneNumber = phoneNumber;
        if(phoneNumber.length() > 8) {
            System.out.println("El número telefonica debe de ser de maximo 8 digitos");
        } else if(phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    //Sobre escritura del método toString
    @Override // Esto nos dice que estamos sobre escribiendo el método toString el cual NO es el que pertenece a la clase model.User si no a la superclase Object
    public String toString() {
//        return super.toString(); Aqui hacemos la referencia con super a la super clase object
        return "model.User: " + name + "Email: " + email + "\nAddress: " + address + ". Phone: " + phoneNumber;
    }

    // Este método es abstracto, por lo que no tiene implementación aquí.
    // Las subclases deben proporcionar su propia implementación.
    public abstract void showDataUser();
}
