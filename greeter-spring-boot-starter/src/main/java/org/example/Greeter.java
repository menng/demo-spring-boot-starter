package org.example;

public class Greeter {

    private GreeterConfig greeterConfig;

    public Greeter(GreeterConfig greeterConfig) {
        this.greeterConfig = greeterConfig;
    }

    public String greet() {
        return greeterConfig.get("userName") + " " + greeterConfig.get("morningMessage");
    }
}
