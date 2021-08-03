public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(String name, String speciality){
        System.out.println("Iniciando la construccion del objeto Doctor");
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // Methods
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
