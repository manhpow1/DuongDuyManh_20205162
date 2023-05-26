package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store(int maxSize) {
        itemsInStore = new ArrayList<>(maxSize);
    }

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Media \"" + media.getTitle() + "\" added to store.");
    }

    public void removeMedia(Media media) {
        boolean removed = itemsInStore.remove(media);
        if (removed) {
            System.out.println("Media \"" + media.getTitle() + "\" removed from store.");
        } else {
            System.out.println("Media \"" + media.getTitle() + "\" not found in store.");
        }
    }
}