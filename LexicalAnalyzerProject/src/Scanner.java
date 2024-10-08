import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Scanner {
    private char[] content;

    public Scanner(String filename) {
        try {
            String txtContent;
            txtContent = new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
            System.out.println("DEBUG ------");
            System.out.println(txtContent);
            System.out.println("------------");
            content = txtContent.toCharArray();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
