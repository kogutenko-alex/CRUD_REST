package org.kogutenko.crud_rest;

import org.kogutenko.crud_rest.models.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music musicBean = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        MusicPlayer musicPlayer = context.getBean("musicPlayerWithSetter", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
