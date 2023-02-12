package com.speaker.speaker.controllers;

import com.speaker.speaker.dtos.SpeakerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/speaker-api")
public class SpeakerController {

    @GetMapping("/speaker")
    public ResponseEntity<SpeakerDto> getSpeaker() {
        SpeakerDto speaker = new SpeakerDto("Jack", 25);
        return ResponseEntity.ok(speaker);
    }

}
