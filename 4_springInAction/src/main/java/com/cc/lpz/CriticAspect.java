package com.cc.lpz;

public class CriticAspect {
    public aspect CriticAspect{
        public CriticAspect{}
        pointcut performance() : execution(* perform(..));Z

    }

}
