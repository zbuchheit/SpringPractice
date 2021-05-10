package com.zbchht.service;

import com.zbchht.model.Speaker;
import com.zbchht.repository.HibernateSpeakerRepositoryImpl;
import com.zbchht.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
