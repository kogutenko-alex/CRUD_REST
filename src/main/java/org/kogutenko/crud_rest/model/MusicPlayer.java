package org.kogutenko.crud_rest.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("player")
public class MusicPlayer {

    private Music music1, music2;
    @Value("${musicPlayer.namePlayer}")
    private String namePlayer;
    @Value("${musicPlayer.maxVolume}")
    private int maxVolume;

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

    @Autowired
    public MusicPlayer(@Qualifier("classicalSongs") Music music1,
                       @Qualifier("rockSongs") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + " and " + music2.getSong();
    }
}
