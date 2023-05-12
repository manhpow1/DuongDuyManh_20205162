package OtherProjects.hust.soict.globalict.garbage;
import java.util.ArrayList;
public class GarbageCreator {
    private static ArrayList<Object> objects = new ArrayList<Object>(); 
    public static void createGarbage() {
        while (true) {
            objects.add(new Object());
        }
    }
}
