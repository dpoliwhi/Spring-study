package org.example;

import java.util.Arrays;

public class MessageProviderArgs implements MessageProvider{
    private final String message;

    public MessageProviderArgs(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Can't find any arguments");
        }
        Arrays.stream(args).forEach(System.out::println);

        message = args[1];
    }

    @Override
    public String getMessage() {
        return message;
    }
}
