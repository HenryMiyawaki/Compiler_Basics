import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Scanner {
    private char[] content;

    public Scanner(String filename) {
        try {
            String txtContent;
            txtContent = new String(Files.reaAllBytes());
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
