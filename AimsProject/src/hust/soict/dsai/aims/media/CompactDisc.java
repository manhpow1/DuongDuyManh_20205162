package hust.soict.dsai.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
        super(id, title, category, cost);
        this.director = director;
        this.artist = artist;
        tracks = new ArrayList<Track>();
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track added successfully.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed successfully.");
        } else {
            System.out.println("Track does not exist in the CD.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() {
        System.out.println("Playing CompactDisc: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        for (Track track : tracks) {
            track.play();
        }
    }
}
