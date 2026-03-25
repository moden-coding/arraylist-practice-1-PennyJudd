import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        // Step 1: Create your ArrayList to hold song titles
        ArrayList<String> playlist = new ArrayList<String>();

        playlist.add("song 1");
        playlist.add("song 2");
        playlist.add("song 3");
        playlist.add("song 4");
        playlist.add("song 5");
        playlist.add("song 6");
        // Example: playlist.add("Song Title Here");


        // Step 3: Print the full playlist with track numbers
        // Track numbers should start at 1, not 0
        int i =5;
        int number = 6;
        System.out.println("--- My Playlist ---");
        while( i > -1 && i < 6){
            System.out.println(number+". " + playlist.get(i));
            number = number - 1;
            i = i-1;
        }



       System.out.println("First song: " + playlist.get(5));
       System.out.println("Last song: " + playlist.get(0));


        // Step 5: Print the last song in the playlist
        

    }
}
