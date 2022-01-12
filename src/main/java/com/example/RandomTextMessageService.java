package com.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("messageService1")
public class RandomTextMessageService implements MessageService{
    List<String> givenList = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

    @Override
    public String getMessage() {
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }
}
