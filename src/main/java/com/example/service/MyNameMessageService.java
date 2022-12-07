package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class MyNameMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Raman Viartsinski";
    }
}
