package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MessageRenderFile implements MessageRenderer {
    MessageProvider messageProvider;

    @Override
    public void render() {
        File file = new File("text.txt");
        try (FileWriter wr = new FileWriter(file);) {
            wr.append(messageProvider.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setMessageProvider(MessageProvider mp) {
        this.messageProvider = mp;
    }
}
