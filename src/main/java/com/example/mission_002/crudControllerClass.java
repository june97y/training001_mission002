package com.example.mission_002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@EnableAutoConfiguration

    public class crudControllerClass
    {
        List<Album> albumsList = new ArrayList<Album>();

        //first thing is to insert albums using POST
        @PostMapping("/Album")
        public void createNewAlbum(@RequestBody Album album)
        {
            albumsList.add(album);
        }

        //return all albums
        @GetMapping("/Album")
        @ResponseBody
        public List<Album> viewAllAlbum()
        {
            return albumsList;
        }

        //only return one specific album
        @GetMapping("/Album/{id}") //short cut for @RequestMapping(value = "/Pet/{id}", method = RequestMethod.GET)
        @ResponseBody
        public Album viewAnAlbum(@PathVariable (value = "id") String id)
        {
            Album storeAlbum = null;

            for(int i=0; i<albumsList.size(); i++)
            {
                if(albumsList.get(i).getId().equals(id))
                {
                    storeAlbum = albumsList.get(i);
                }
            }
            return storeAlbum;
        }

        //update the album info
        @PutMapping("/Album/{id}")
        @ResponseBody
        public void updateAlbumInfo(@PathVariable (value="id") String id, @RequestBody Album requestAlbum)
        {
            Album tempAlbum = requestAlbum;
            albumsList = albumsList.stream().filter(al -> al.getId().equals(id)).map(alObj -> alObj=tempAlbum).collect(Collectors.toList());
        }

        //delete album from list
        @DeleteMapping("/Album/{id}")
        @ResponseBody
        public void deleteAlbum(@PathVariable (value = "id") String aId)
        {
            albumsList.removeIf(al -> al.getId().equals(aId));
        }

        /*
        1. why does putmapping need response body annotation?
        2. what is the arrow equation
        3. what is the purpose of second line in updateAlbumInfo function
        4  @PathVariable = Spring annotation which indicates that a method parameter should be bound to a URI template variable.
        */
    }