import java.util.ArrayList;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full.");
            return;
        }
        itemsOrdered.add(disc);
        qtyOrdered++;
        System.out.println("The disc has been added.");
    }
    /*  public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED && dvd != null) {
                itemsOrdered[qtyOrdered++] = dvd;
            } else {
                System.out.println("The cart is full.");
                break;
            }
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED && dvd != null) {
                itemsOrdered[qtyOrdered++] = dvd;
            } else {
                System.out.println("The cart is full.");
                break;
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED && dvd1 != null && dvd2 != null) {
            itemsOrdered[qtyOrdered++] = dvd1;
            itemsOrdered[qtyOrdered++] = dvd2;
        } else {
            System.out.println("The cart is full or one of the DVDs is null.");
        }
    }*/
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = itemsOrdered.remove(disc);
        if (found) {
            qtyOrdered--;
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc is not found.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        double totalCost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc dvd = itemsOrdered.get(i);
            System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                    i+1, dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
            totalCost += dvd.getCost();
        }
        System.out.printf("Total cost: %.2f $\n", totalCost);
        System.out.println("***************************************************");
    }

    public void searchByID(int id) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc dvd = itemsOrdered.get(i);
            if (dvd.getId() == id) {
                System.out.printf("DVD found: %s - %s - %s - %d: %.2f $\n",
                        dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
                return;
            }
        }
        System.out.println("No matching DVD found.");
    }

    public void searchByTitle(String title) {
        ArrayList<DigitalVideoDisc> matchedDvds = new ArrayList<>();
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc dvd = itemsOrdered.get(i);
            if (dvd.isMatch(title)) {
                matchedDvds.add(dvd);
            }
        }
        if (matchedDvds.isEmpty()) {
            System.out.println("No matching DVD found.");
            return;
        }
        System.out.printf("Matching DVDs (%d):\n", matchedDvds.size());
        for (int i = 0; i < matchedDvds.size(); i++) {
            DigitalVideoDisc dvd = matchedDvds.get(i);
            System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                    i+1, dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
        }
    }
}