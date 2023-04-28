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
