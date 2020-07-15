package config;

import io.dropwizard.Configuration;

import java.util.Map;

public class AnthonyBarrettiConfiguration extends Configuration {

    private String applicationName;

    private Map<String, String> http;

    public String getApplicationName() {
        return applicationName;
    }

    public Map<String, String> getHttp() {
        return http;
    }
}
