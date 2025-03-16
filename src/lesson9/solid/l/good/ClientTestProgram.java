package lesson9.solid.l.good;

import lesson9.solid.l.good.DivMediaPlayer;
import lesson9.solid.l.good.MediaPlayer;
import lesson9.solid.l.good.WinampMediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {
        List<VideoMediaPlayer> allPlayers = new ArrayList<>();
//        allPlayers.add(new WinampMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);
    }

    private static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {
        for (VideoMediaPlayer mediaPlayer : allPlayers) {
            mediaPlayer.playVideo();
        }
    }
}
