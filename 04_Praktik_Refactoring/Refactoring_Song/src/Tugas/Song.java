package Tugas;

public class Song {
    private String id;
    private String title;
    private String releaseYear;
    private String musicFileURL;
    private Genre genre = Genre.UNDEFINED;
    private Artist artist;
    private Album album;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void printInfo(int detailLevel) {
        System.out.println("Song Title: " + title);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Genre: " + genre);

        if (detailLevel >= 1) {
            if (artist != null) {
                System.out.println("Artist Name: " + artist.getName());
                if (artist.getAlias() != null && !artist.getAlias().isEmpty()) {
                    System.out.println("Artist Also Known As: " + artist.getAlias());
                }
            } else {
                System.out.println("Artist is NULL!"); // Debugging
            }
        }

        if (detailLevel >= 2) {
            if (album != null) {
                System.out.println("Album Title: " + album.getName());
            } else {
                System.out.println("Album is NULL!"); // Debugging
            }
        }

        if (detailLevel >= 3) {
            System.out.println("Song ID: " + id);
            System.out.println("Music File: " + musicFileURL);
        }

    }
}
