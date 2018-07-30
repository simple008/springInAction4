package com.cc.lpz.soundsystem;

import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

@Component("lonelyHeartsClub")
//@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt.Pepper's.lonely Hearts Club Band";
    private String artist = " The beatles";

    public void play(){
        System.out.println("Playing" + title + "by" + artist);
    }
}
