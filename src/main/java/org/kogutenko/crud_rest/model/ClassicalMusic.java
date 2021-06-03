package org.kogutenko.crud_rest.model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classicalSongs")
@Scope("prototype")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {  }

    @Override
    public String getSong() {
        return "Classical";
    }

    @PostConstruct
    public void initialization() {
        System.out.println("init classical");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy classical");
    }

    public static ClassicalMusic createClassicalMusic() {
        return  new ClassicalMusic();
    }
}
