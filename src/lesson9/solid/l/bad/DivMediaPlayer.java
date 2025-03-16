package lesson9.solid.l.bad;

public class DivMediaPlayer extends MediaPlayer {

    @Override
    void playVideo() {
        super.playVideo();
    }

    @Override
    void playMusic() {
        throw new RuntimeException();
    }
}
