package com.speaker.speaker.service;

import com.speaker.speaker.dtos.SpeakerDto;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpeakerServiceImpl implements SpeakerService{
    private final RestTemplate restTemplate;

    public SpeakerServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void saveSpeaker(SpeakerDto speakerDto) {
        restTemplate.postForEntity("http://info-service.default.svc.cluster.local:8080/info/speaker", speakerDto, Void.class);
    }

    public ResponseEntity<SpeakerDto[]> getAllSpeakers() {
        return restTemplate.getForEntity("http://info-service.default.svc.cluster.local:8080/info/speaker", SpeakerDto[].class);
    }

}
