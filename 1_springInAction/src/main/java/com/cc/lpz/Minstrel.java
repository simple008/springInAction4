package com.cc.lpz;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("fffffff");
    }

    public void singAfterQuest(){
        stream.println("the  eeeeeee");
    }
}
