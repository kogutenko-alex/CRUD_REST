package org.kogutenko.crud_rest;

import org.kogutenko.crud_rest.model.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music musicBean = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        MusicPlayer musicPlayer = context.getBean("musicPlayerWithSetter2", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(
                "name of player is " + musicPlayer.getNamePlayer() + "\n" +
                "max volume is " + musicPlayer.getMaxVolume()
        );


        context.close();
    }
}
