public class Doctor {
    //Atributos
    int id;
    String name;
    String speciality;
    Doctor(){
        System.out.println("Se declara el metodo constructor");
        System.out.println("Aunque no es NECESARIO");
    }

    Doctor(String name){ //Ahora tengo dos opciones de poder construir el objeto
        System.out.println("El nombre del doctor es " + name);
    }
    //Metodos ó Comportamientos
    public void showName() {
        System.out.println(name);
    }
}
