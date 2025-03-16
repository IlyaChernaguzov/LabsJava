package lesson9.solid.l.bad;

import lesson9.solid.l.bad.MediaPlayer;

public class WinampMediaPlayer extends MediaPlayer {

    @Override
    void playVideo() {
        throw new RuntimeException();
    }

    @Override
    void playMusic() {
        super.playMusic();
    }
}
