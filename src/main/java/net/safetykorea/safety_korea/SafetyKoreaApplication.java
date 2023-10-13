package net.safetykorea.safety_korea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableDiscoveryClient
public class SafetyKoreaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SafetyKoreaApplication.class, args);
    run();
  }

  public static void run() {
      Runnable runnable = () -> System.out.println("Hi Virtual Thread");
      Thread virtualThread1 = Thread.ofVirtual().start(runnable);
      System.out.println("Thread is Virtual? " + virtualThread1.isVirtual());
  }
}
