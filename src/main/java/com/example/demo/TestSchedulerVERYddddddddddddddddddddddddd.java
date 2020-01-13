package com.example.demo;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class TestSchedulerVERYddddddddddddddddddddddddd {

    @Scheduled(fixedRate = 2000)
    public void logSmt(){
        log.info(" i am log");
        log.error(" i am log");
        log.debug(" i am log");
        log.trace(" i am log");
    }

}
