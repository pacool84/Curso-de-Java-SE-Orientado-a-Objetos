package model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.printf("Nurse: %s\n", getName());
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Department: Pediatrics");
        System.out.println("Department: Nutriología");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
