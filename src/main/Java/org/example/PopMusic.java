package org.example;

import org.springframework.stereotype.Component;

@Component("somePopMusic")
public class PopMusic implements Music {
    @Override
    public String getSong(){
        return "Many many many bdzin-zin";
    }

}
