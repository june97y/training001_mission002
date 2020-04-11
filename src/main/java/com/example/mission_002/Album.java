package com.example.mission_002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.NonNull;

@Setter
@Getter
@NoArgsConstructor
public class Album
{
    @NonNull private String id;
    @NonNull private String title;
    @NonNull private String artist;
    @Nullable private String producer;
    @Nullable private String recordLabel;
    @Nullable private int releaseYear;
    private int copiesSold;

    public Album(String id, String title, String artist, String producer, String recordLabel, int releaseYear, int copiesSold)
    {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.producer = producer;
        this.recordLabel = recordLabel;
        this.releaseYear = releaseYear;
        this.copiesSold = copiesSold;
    }
}

