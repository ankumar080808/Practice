package com.example.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/*@Component*/
public class MyScheduler {

    @Scheduled(fixedRate = 1000) // Execute every 1000 milliseconds
    public void scheduleTaskWithFixedRate() {
        // Your scheduled task logic goes here
        System.out.println("Fixed rate task executed");
    }

    @Scheduled(fixedDelay = 2000) // Execute every 2000 milliseconds with a delay
    public void scheduleTaskWithFixedDelay() throws InterruptedException {
        // Your scheduled task logic goes here
        System.out.println("Fixed delay task executed");
        Thread.sleep(500); // Simulate some work
    }

    @Scheduled(cron = "0 * * * * ?") // Execute every minute
    public void scheduleTaskWithCron() {
        // Your scheduled task logic goes here
        System.out.println("Cron task executed");
    }

    @Scheduled(initialDelay = 5000, fixedRate = 3000) // Execute after 5 seconds and then every 3 seconds
    public void scheduleTaskWithInitialDelay() {
        // Your scheduled task logic goes here
        System.out.println("Initial delay task executed");
    }
}