import java.io.Console;
import java.io.IOException;

public class TestPrinter {
    public static void main(String[] args) {
        System.out.println("Test Nachricht generiert in Java TestPrinter Class. Neue Nachricht wenn Tom keine kacke gebaut hat! User Input beendet den Service");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
