package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MessageRenderXML implements MessageRenderer{
    MessageProvider messageProvider;
    @Override
    public void render() {
        try (FileWriter wr = new FileWriter(new File("text.xml"));) {
            wr.append(String.format("<render>\n\t%s\n</render>",messageProvider.getMessage()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setMessageProvider(MessageProvider mp) {
        this.messageProvider = mp;
    }
}
