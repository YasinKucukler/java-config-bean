package com.yasin.springcoredemo.config;

import com.yasin.springcoredemo.common.Coach;
import com.yasin.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //burada bean id verebiliriz
    //var olan swimcoach u configure ediyoruz
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
