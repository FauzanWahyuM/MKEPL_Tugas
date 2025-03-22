package Tugas;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("001", "Timeless", "2024",
                "https://open.spotify.com/track/1Es7AUAhQvapIcoh3qMKDL?si=Uz5-lpYdSGydRNlx95_fJg&context=spotify%3Aalbum%3A2IRxVVqbSbqHJo8Zx50LYn");

        // Atur Genre
        song.setGenre(Genre.RNB);

        // Atur Artist
        Artist artist = new Artist("The Weeknd", "Abel Makkonen Tesfaye");
        song.setArtist(artist);

        // Atur Album
        Album album = new Album("Timeless");
        song.setAlbum(album);

        // Print dengan detail penuh
        song.printInfo(3);
    }
}
