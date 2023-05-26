package hust.soict.dsai.aims.media;

import java.util.*;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        Book book = new Book(1, "The Lion King", "Animation", 19.95f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
