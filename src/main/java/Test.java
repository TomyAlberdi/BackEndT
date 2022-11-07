import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ContactoIO.write(Arrays.asList(new Contacto("Tomas","email","12345"), new Contacto("Tomas2","email","12345")));

        List<Contacto> contactos = ContactoIO.read();

        contactos.forEach(System.out::println);
    }
}
