import java.io.Serializable;

public record Contacto(String nombre, String mail, String tel) implements Serializable {
}
