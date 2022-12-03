package org.example;

public class MessageProviderSimple implements MessageProvider {
    @Override
    public String getMessage() {
       return "Happy new year!";
    }
}
