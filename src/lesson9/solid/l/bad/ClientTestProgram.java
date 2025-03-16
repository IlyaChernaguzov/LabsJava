package lesson9.solid.l.bad;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {
        List<MediaPlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new WinampMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);
    }

    private static void playVideoInAllMediaPlayers(List<MediaPlayer> allPlayers) {
        for (MediaPlayer mediaPlayer : allPlayers) {
            mediaPlayer.playVideo();
        }
    }
}
