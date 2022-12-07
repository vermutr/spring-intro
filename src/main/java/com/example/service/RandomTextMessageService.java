package com.example.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class RandomTextMessageService implements MessageService {

    private final List<String> randomList = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

    private final Random randomno = new Random();

    @Override
    public String getMessage() {
        return randomList.get((randomno.nextInt(randomList.size())));
    }
}
