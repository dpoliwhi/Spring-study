package org.example;

public class MessageRenderConsole implements MessageRenderer {
    MessageProvider messageProvider;
    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider mp) {
        this.messageProvider = mp;
    }
}
