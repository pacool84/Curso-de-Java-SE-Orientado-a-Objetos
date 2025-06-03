package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;

//    model.Doctor(){
//        System.out.println("Se declara el metodo constructor");
//        System.out.println("Aunque no es NECESARIO");
//    }

    public Doctor(String name, String email){ //Ahora tengo dos opciones de poder construir el objeto
//      System.out.println("El nombre del doctor es " + name);
        super(name, email); //Llamando al constructor de la clase padre
        this.speciality = speciality;

    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Odontología");

    }
    //Metodos ó Comportamientos
//    public void showName() {
//        System.out.println("El nombre del model.Doctor es: " + name);
//    }

    public void showSpeciality() {
        System.out.println("La especialidad del doctor es: " + speciality);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>(); //Colección de citas disponibles

    public void addAvailableAppointment(String date, String time) {
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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        //Constructor de AvailableAppointment
        public AvailableAppointment(String date, String time) {
            try {
            this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
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

        public String getDate(String DATE) {
            return format.format(date);
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
