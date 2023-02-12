package com.speaker.speaker.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SpeakerDto {
    private final String name;
    private final int age;

}
