package com.stackroute.springboot.feedcomponent;


import com.stackroute.springboot.domain.Track;
import com.stackroute.springboot.exception.TrackAlreadyExistsException;
import com.stackroute.springboot.repository.TrackRepo;
import com.stackroute.springboot.service.TrackService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component

    @Data

    @Primary

    public class SeedDataApplicationListener implements ApplicationListener<ContextRefreshedEvent>

    {
        private TrackRepo trackRepository;    @Autowired
    public SeedDataApplicationListener(TrackRepo trackRepository) {
        this.trackRepository = trackRepository;
    }    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        trackRepository.save(new Track(11, "Alan Walker", "Good"));
        trackRepository.save(new Track(44, "Sia", "Good"));
    }
    }



