package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();   
    public Book(int id, String title, String category, float cost) {
		super(id,title,category,cost);
	}
    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author '" + authorName + "' added successfully.");
        } else {
            System.out.println("Author '" + authorName + "' already exists in the list of authors.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author '" + authorName + "' removed successfully.");
        } else {
            System.out.println("Author '" + authorName + "' does not exist in the list of authors.");
        }
    }
    @Override
    public void play() {
        System.out.println("This book is not playable.");
    }
}