package com.stackroute.spring.domain.config.config;

import com.stackroute.spring.domain.Actor;
import com.stackroute.spring.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class BeanConfigurations {
        @Bean(name="movie")
        public Movie getMovieBean()
        {
            return new Movie("Bahubali","S S Rajamouli",new Actor("Prabhas",40,"Male"));
        }

        @Bean(name="actor")
        public Actor getBeanActor()
        {
            return new Actor("Shah",50,"Male");
        }
    }
