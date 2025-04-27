public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;

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
}
