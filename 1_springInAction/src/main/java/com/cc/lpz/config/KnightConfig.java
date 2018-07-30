package com.cc.lpz.config;


import com.cc.lpz.BraveKnight;
import com.cc.lpz.Knight;
import com.cc.lpz.Quest;
import com.cc.lpz.SlayDragonQuest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
