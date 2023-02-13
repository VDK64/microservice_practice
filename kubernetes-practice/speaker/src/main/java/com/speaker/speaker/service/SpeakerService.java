package com.speaker.speaker.service;

import com.speaker.speaker.dtos.SpeakerDto;
import org.springframework.http.ResponseEntity;

public interface SpeakerService {

    void saveSpeaker(SpeakerDto speakerDto);

    ResponseEntity<SpeakerDto[]> getAllSpeakers();

}
