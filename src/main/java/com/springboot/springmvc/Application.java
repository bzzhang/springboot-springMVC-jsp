package com.springboot.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zbz on 2017/2/13.
 */

/*@Configuration
@EnableAutoConfiguration
@ComponentScan*/
@SpringBootApplication(scanBasePackages="com.springboot.springmvc")
public class Application extends SpringBootServletInitializer /*implements EmbeddedServletContainerCustomizer*/ {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    /*@Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8081);
    }*/
}
