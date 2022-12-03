package org.example;

public class MessageProviderSimple implements MessageProvider {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
       return message;
    }
}
