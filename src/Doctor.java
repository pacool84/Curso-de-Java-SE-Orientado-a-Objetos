import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;

    Doctor(){
        System.out.println("Se declara el metodo constructor");
        System.out.println("Aunque no es NECESARIO");
    }

    Doctor(String name, String speciality){ //Ahora tengo dos opciones de poder construir el objeto
//        System.out.println("El nombre del doctor es " + name);
        id++;
        this.name = name;
        this.speciality = speciality;

    }
    //Metodos ó Comportamientos
    public void showName() {
        System.out.println("El nombre del Doctor es: " + name);
    }

    public void showId() {
        System.out.println("El id del doctor es: " + id);
    }

    public void showSpeciality() {
        System.out.println("La especialidad del doctor es: " + speciality);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>(); //Colleccion de citas disponibles

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    //Devolver la lista de citas disponibles
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

// Creando una clase static anidada

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        //Constructor de AvailableAppointment
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        //Getters y Setters

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
