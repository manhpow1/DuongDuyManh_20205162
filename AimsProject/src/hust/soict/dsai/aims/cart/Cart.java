package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.*;
public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full.");
            return;
        }
        itemsOrdered.add(media);
        System.out.println("The media has been added.");
    }

    public void removeMedia(Media media) {
        boolean found = itemsOrdered.remove(media);
        if (found) {
            System.out.println("The media has been removed.");
        } else {
            System.out.println("The media is not found.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        double totalCost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            System.out.printf("%d. %s - %s - %.2f $\n",
                    i+1, media.getTitle(), media.getCategory(), media.getCost());
            totalCost += media.getCost();
        }
        System.out.printf("Total cost: %.2f $\n", totalCost);
        System.out.println("***************************************************");
    }

    public void searchByID(int id) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            if (media.getId() == id) {
                System.out.printf("Media found: %s - %s - %.2f $\n",
                        media.getTitle(), media.getCategory(), media.getCost());
                return;
            }
        }
        System.out.println("No matching media found.");
    }

    public void searchByTitle(String title) {
        ArrayList<Media> matchedMedia = new ArrayList<>();
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            if (media.isMatch(title)) {
                matchedMedia.add(media);
            }
        }
        if (matchedMedia.isEmpty()) {
            System.out.println("No matching media found.");
            return;
        }
        System.out.printf("Matching media (%d):\n", matchedMedia.size());
        for (int i = 0; i < matchedMedia.size(); i++) {
            Media media = matchedMedia.get(i);
            System.out.printf("%d. %s - %s - %.2f $\n",
                    i+1, media.getTitle(), media.getCategory(), media.getCost());
        }
    }
}