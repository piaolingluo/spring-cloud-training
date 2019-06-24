package com.example.demo;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author gechenpeng
 * @date 2019-06-19
 */
@EnableSwagger2Doc
@EnableFeignClients
@EnableHystrixDashboard
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServletRegistrationBean() {
        return new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/actuator/hystrix.stream");
    }
}
