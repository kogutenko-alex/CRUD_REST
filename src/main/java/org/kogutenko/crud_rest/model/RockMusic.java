package org.kogutenko.crud_rest.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockSongs")
@Scope("prototype")
public class RockMusic implements Music {
    private RockMusic() {
    }

    @Override
    public String getSong() {
        return "Rock";
    }

    @PostConstruct
    public void initialization() {
        System.out.println("init rock");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy rock");
    }

    public static RockMusic createRockMusic() {
        return new RockMusic();
    }
}
