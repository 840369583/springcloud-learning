package com.springcloud.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Logger;

@Configuration
public class MyFeignClientsConfiguration {

    @Bean
    public Contract feignContract() {
      return new feign.Contract.Default();
    }

    @Bean
    Logger.Level feignLoggerLevel() {
      return Logger.Level.FULL;
    }
}
