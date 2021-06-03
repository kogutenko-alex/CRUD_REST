package org.kogutenko.crud_rest;

import org.kogutenko.crud_rest.model.ClassicalMusic;
import org.kogutenko.crud_rest.model.Computer;
import org.kogutenko.crud_rest.model.Music;
import org.kogutenko.crud_rest.model.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("player", MusicPlayer.class);
        System.out.println(musicPlayer.getMaxVolume());
        System.out.println(musicPlayer.getNamePlayer());
        context.close();
    }
}
