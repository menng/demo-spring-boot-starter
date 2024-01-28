package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.example")
public class GreeterProperties {
    private String userName;
    private String morningMessage;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMorningMessage() {
        return morningMessage;
    }

    public void setMorningMessage(String morningMessage) {
        this.morningMessage = morningMessage;
    }
}
