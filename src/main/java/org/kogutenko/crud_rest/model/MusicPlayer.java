package org.kogutenko.crud_rest.model;

public class MusicPlayer {
    private Music music;

    private String namePlayer;
    private int maxVolume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() { }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMusic (Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
