package com.info.info.service;

import com.info.info.dtos.SpeakerDto;
import com.info.info.entities.Speaker;
import com.info.info.repository.SpeakerRepository;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {
    private final SpeakerRepository repository;

    public InfoServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(SpeakerDto speaker) {
        repository.save(
                Speaker.builder()
                        .age(speaker.getAge())
                        .name(speaker.getName())
                        .build());
    }

    @Override
    public Iterable<Speaker> getAll() {
        return repository.findAll();
    }
}
