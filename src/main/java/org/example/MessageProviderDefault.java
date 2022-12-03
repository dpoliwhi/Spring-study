package org.example;

import org.springframework.stereotype.Component;

//@Component
public class MessageProviderDefault implements MessageProvider {

    @Override
    public String getMessage() {
        return "DEFAULT STRING";
    }
}
