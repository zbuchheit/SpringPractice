package com.zbchht.repository;

import com.zbchht.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
