package com.syly8.SpringBootDemo.schedulingtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledTask {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    @Scheduled(fixedRate = 5000)
    public void ReportCurrentTime() {
        log.info("the time is {}", new Date().toString());
    }
}
