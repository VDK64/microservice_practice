package com.info.info.controllers;

import com.info.info.dtos.SpeakerDto;
import com.info.info.entities.Speaker;
import com.info.info.service.InfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("info")
public class InfoController {
    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @PostMapping("speaker")
    public ResponseEntity<Void> saveSpeaker(@RequestBody SpeakerDto speaker) {
        infoService.save(speaker);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("speaker")
    public ResponseEntity<Iterable<Speaker>> getAllSpeaker() {
        return ResponseEntity.ok(infoService.getAll());
    }

}
