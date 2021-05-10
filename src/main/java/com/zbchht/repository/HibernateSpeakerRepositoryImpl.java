package com.zbchht.repository;

import com.zbchht.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Zach");
        speaker.setFirstName("Buchheit");

        speakers.add(speaker);

        return speakers;
    }
}
