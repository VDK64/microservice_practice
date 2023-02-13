package com.speaker.speaker.controllers;

import com.speaker.speaker.dtos.SpeakerDto;
import com.speaker.speaker.service.SpeakerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/speaker-api")
public class SpeakerController {
    private final SpeakerServiceImpl speakerServiceImpl;

    public SpeakerController(SpeakerServiceImpl speakerServiceImpl) {
        this.speakerServiceImpl = speakerServiceImpl;
    }

    @GetMapping("/speaker")
    public ResponseEntity<SpeakerDto[]> getSpeaker() {
        return speakerServiceImpl.getAllSpeakers();
    }

    @PostMapping("/speaker")
    public ResponseEntity<Void> saveSpeaker(@RequestBody SpeakerDto speaker) {
        speakerServiceImpl.saveSpeaker(speaker);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
