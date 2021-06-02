package org.kogutenko.crud_rest.model;


import org.springframework.stereotype.Component;

@Component("classicalSongs")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void initialization() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public static ClassicalMusic createClassicalMusic() {
        return  new ClassicalMusic();
    }
}
