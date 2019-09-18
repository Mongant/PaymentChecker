package com.mongant.checker.schedule;

import com.mongant.checker.entity.Route;
import handler.PayCheckerHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import repository.PayCheckerRepository;

import java.util.*;
import java.util.logging.Handler;

@EnableScheduling
@Component
public class ScheduledTasks {

    @Autowired
    PayCheckerRepository payCheckerRepository;

    PayCheckerHandler handler = new PayCheckerHandler();

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        RestTemplate restTemplate = new RestTemplate();
        List<Route> rotes = Arrays.asList(restTemplate.getForObject("http://localhost:8090/process", Route[].class));
        for (Route route : rotes) {
            payCheckerRepository.updateStatusPay(route.getRef(), handler.getRandomStatus());
        }
    }
}