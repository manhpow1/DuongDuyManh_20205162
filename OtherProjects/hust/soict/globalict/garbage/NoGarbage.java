package OtherProjects.hust.soict.globalict.garbage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class NoGarbage {
    public static String readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        reader.close();
        return builder.toString();
    }
}
