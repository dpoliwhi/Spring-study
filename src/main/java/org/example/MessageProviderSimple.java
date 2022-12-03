package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:annotation.properties")
public class MessageProviderSimple implements MessageProvider {
    private String message;

    @Value("${provider.simple.args}")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
       return message;
    }
}
