package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GreeterProperties.class)
public class GreeterAutoConfiguration {

    @Autowired
    private GreeterProperties greeterProperties;

    @Bean
    public Greeter greeter(GreeterConfig greeterConfig) {
        return new Greeter(greeterConfig);
    }

    @Bean
    public GreeterConfig greeterConfig() {
        GreeterConfig greeterConfig = new GreeterConfig();
        greeterConfig.put("userName", greeterProperties.getUserName());
        greeterConfig.put("morningMessage", greeterProperties.getMorningMessage());
        return greeterConfig;
    }

}
