package com.ps.config;

import com.ps.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * Created by iuliana.cosmina on 10/6/16.
 */
@Configuration
public class HttpInvokerConfig {

    @Autowired
    @Qualifier("userServiceImpl")
    UserService userService;

    @Bean(name = "/httpInvoker/userService")
    public HttpInvokerServiceExporter httpInvokerServiceExporter() {
        HttpInvokerServiceExporter invokerService = new HttpInvokerServiceExporter();
        invokerService.setService(userService);
        invokerService.setServiceInterface(UserService.class);
        return invokerService;
    }

}