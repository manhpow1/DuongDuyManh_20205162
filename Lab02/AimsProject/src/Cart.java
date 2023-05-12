public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full.");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
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
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                break;
            }
        }
        if (found) {
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc is not found.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
