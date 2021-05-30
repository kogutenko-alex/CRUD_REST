package org.kogutenko.crud_rest.model;

import java.sql.SQLOutput;

public class MusicPlayer {
    private Music music;

    public MusicPlayer (Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSing());
    }
}
