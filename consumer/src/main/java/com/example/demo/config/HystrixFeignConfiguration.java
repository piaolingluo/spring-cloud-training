package com.example.demo.config;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import feign.Feign;
import feign.hystrix.HystrixFeign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gechenpeng
 * @date 2019-06-24
 */
@Configuration
public class HystrixFeignConfiguration {

    @Bean
    public Feign.Builder feignHystrixBuilder() {
        return HystrixFeign.builder().setterFactory((target, method) -> {
            String groupKey = new StringBuilder(target.name()).append("#")
                    .append(target.type().getSimpleName()).toString();
            String commandKey = Feign.configKey(target.type(), method);
            return HystrixCommand.Setter
                    .withGroupKey(HystrixCommandGroupKey.Factory.asKey(groupKey))
                    .andCommandKey(HystrixCommandKey.Factory.asKey(commandKey));
        });
    }
}
