package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//      Конфигурация через XML
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
//        MessageRenderer renderer = context.getBean(MessageRenderer.class);
//        renderer.render();

        //      Конфигурация через аннотации
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        MessageRenderer render = context.getBean(MessageRenderer.class);
        render.render();

    }
}