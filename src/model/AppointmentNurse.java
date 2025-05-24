package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable {
    private int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;
    private String time;

    //Setter y Getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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

    // Tip, option + enter te permite insertar el metodo de la interfaz
    @Override
    public void schedule(Date date, String time) {
    }
}
