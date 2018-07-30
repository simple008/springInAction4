package com.cc.lpz.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }

    @Autowired
     public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }

    @Autowired
    public void insertDisc(CompactDisc cd){
        this.cd = cd;
    }
}
