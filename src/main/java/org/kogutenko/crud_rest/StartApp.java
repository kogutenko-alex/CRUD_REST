package org.kogutenko.crud_rest;

import org.kogutenko.crud_rest.model.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music musicBean = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerWithSetterScope", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerWithSetterScope", MusicPlayer.class);

        boolean comporison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comporison);
        System.out.println(firstMusicPlayer);
        firstMusicPlayer.playMusic();
        System.out.println(secondMusicPlayer);
        secondMusicPlayer.playMusic();

        firstMusicPlayer.setMaxVolume(10);
        System.out.println(firstMusicPlayer.getMaxVolume());
        System.out.println(secondMusicPlayer.getMaxVolume());

        context.close();
    }
}
