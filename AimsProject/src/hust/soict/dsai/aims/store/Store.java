package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int currentIndex;
    public Store(int maxSize) {
        itemsInStore = new DigitalVideoDisc[maxSize];
        currentIndex = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (currentIndex >= itemsInStore.length) {
            System.out.println("The store is full. Cannot add DVD.");
            return;
        }
        itemsInStore[currentIndex] = dvd;
        currentIndex++;
        System.out.println("DVD \"" + dvd.getTitle() + "\" added to store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < currentIndex; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < currentIndex - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                currentIndex--;
                System.out.println("DVD \"" + dvd.getTitle() + "\" removed from store.");
                return;
            }
        }
        System.out.println("DVD \"" + dvd.getTitle() + "\" not found in store.");
    }
}