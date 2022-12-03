package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
        MessageProvider provider = context.getBean(MessageProvider.class);
        MessageRenderer renderer = context.getBean(MessageRenderer.class);
        renderer.setMessageProvider(provider);
        renderer.render();
    }
}