package com.example.mission_002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableAutoConfiguration

public class Mission002Application
{
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		return "test works";
	}

	@RequestMapping("/Album")
	@ResponseBody
	public String getAlbumId()
	{
		return null;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(Mission002Application.class, args);
	}
}

/*
* {
        "id": "A001",
        "title": "Melodrama",
        "artist": "Lorde",
        "producer": "x",
        "recordLabel": "BigMachine",
        "releaseYear": 2017,
        "copiesSold": 100000
    },
    {
        "id": "A002",
        "title": "Pony",
        "artist": "Rex Orange County",
        "producer": "x",
        "recordLabel": "BigMachine",
        "releaseYear": 2019,
        "copiesSold": 200000
    },
    {
        "id": "A003",
        "title": "Where Do We Go When We Fell Asleep",
        "artist": "Billie Eilish",
        "producer": "x",
        "recordLabel": "Sony Music",
        "releaseYear": 2020,
        "copiesSold": 1200000
    }


	*/