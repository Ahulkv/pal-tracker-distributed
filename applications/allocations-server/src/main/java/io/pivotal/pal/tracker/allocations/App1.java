//
//package io.pivotal.pal.tracker.allocations;
//
//import io.pivotal.pal.tracker.allocations.ProjectClient;
//import org.springframework.beans.factory.annotation.Value;
//        import org.springframework.boot.SpringApplication;
//        import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//        import org.springframework.context.annotation.Bean;
//        import org.springframework.context.annotation.ComponentScan;
//        import org.springframework.web.client.RestOperations;
//
//        import java.util.TimeZone;
//
//@EnableCircuitBreaker
//@EnableEurekaClient
//@SpringBootApplication
//@ComponentScan({"io.pivotal.pal.tracker.allocations", "io.pivotal.pal.tracker.restsupport"})
//public class App1 {
//
//    public static void main(String[] args) {
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//        SpringApplication.run(App1.class, args);
//    }
//
//    @Bean
//    ProjectClient projectClient(
//            RestOperations restOperations,
//            @Value("${registration.server.endpoint}") String registrationEndpoint
//    ) {
//        return new ProjectClient(restOperations, registrationEndpoint);
//    }
//}