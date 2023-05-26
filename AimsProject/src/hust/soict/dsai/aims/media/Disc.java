package hust.soict.dsai.aims.media;

public class Disc extends Media{
    protected int length;
    protected String director;
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    public Disc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }
    public Disc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public Disc( String title, String category, float cost) {
        super(title, category, cost);
    }
    public Disc( String title) {
        super(title);
    }
    @Override
    public void play() {
        System.out.println("Playing disc: " + getTitle());
        System.out.println("Disc length: " + length);
    }
}
