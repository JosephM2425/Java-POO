import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Joseph Murillo", "General");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}
