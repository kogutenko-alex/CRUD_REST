package org.kogutenko.crud_rest.model;

import org.springframework.stereotype.Component;

@Component("rockSongs")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Marry";
    }

    public void initialization() {

    }

    public void destroy() {

    }
}
