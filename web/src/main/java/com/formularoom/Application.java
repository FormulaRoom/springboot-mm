package com.formularoom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by fr on 2017/4/01.
 */

@ComponentScan( basePackages = {"com.formularoom"})
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8081);
    }
}
