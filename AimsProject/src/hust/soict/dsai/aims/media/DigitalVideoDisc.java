package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title) {
        super(title);
    }
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $", title, category, director, length, cost);
    }

    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
