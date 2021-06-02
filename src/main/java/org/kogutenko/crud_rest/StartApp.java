package org.kogutenko.crud_rest;

import org.kogutenko.crud_rest.model.ClassicalMusic;
import org.kogutenko.crud_rest.model.Music;
import org.kogutenko.crud_rest.model.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("classicalSongs", ClassicalMusic.class);
        MusicPlayer musicPlayerClassical = new MusicPlayer(music);
        musicPlayerClassical.playMusic();

        context.close();
    }
}
