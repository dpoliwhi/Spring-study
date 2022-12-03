package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageRenderConsole implements MessageRenderer {
    MessageProvider messageProvider;
    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider mp) {
        this.messageProvider = mp;
    }
}
