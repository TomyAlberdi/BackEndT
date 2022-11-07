import java.io.*;
import java.util.List;

public class ContactoIO {

    private static final String FILENAME = "contactos.dat";

    public static void write(List<Contacto> contactos) {
        try(FileOutputStream fo = new FileOutputStream(FILENAME);
            ObjectOutputStream os = new ObjectOutputStream(fo)) {
            os.writeObject(contactos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Contacto> read() {
        try(FileInputStream fi = new FileInputStream(FILENAME);
            ObjectInputStream os = new ObjectInputStream(fi)) {
            return ((List<Contacto>) os.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
