package com.info.info.service;

import com.info.info.dtos.SpeakerDto;
import com.info.info.entities.Speaker;

public interface InfoService {

    void save(SpeakerDto speaker);

    Iterable<Speaker> getAll();

}
