package Coche;
import java.util.List;

public class Main {

    static CocheCRUD cocheCRUD;


    public static void main(String[] args) {
        cocheCRUD.vertodo();
        cocheCRUD.guardar(new Coche());
        cocheCRUD.vertodo();
        System.out.println(cocheCRUD);



    }
}
