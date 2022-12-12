package com.furkant.CinemaRestApi.controller;

import com.furkant.CinemaRestApi.entity.Film;
import com.furkant.CinemaRestApi.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    FilmService filmService;

    @PostMapping("/save")
    public ResponseEntity<Film> saveFilm(@RequestBody Film film){
        Film savedFilm = filmService.saveFilm(film);
        return new ResponseEntity<Film>(savedFilm, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Film>> getAllFilm(){
        List<Film> allFilm =filmService.getAllFilm();
        return new ResponseEntity<List<Film>>(allFilm, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable(name = "id") Long filmId){
        Film film = filmService.getFilmById(filmId);
        return new ResponseEntity<Film>(film, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Film> updateFilmById(@RequestBody Film film){
        Film updatedFilm = filmService.updateFilm(film);
        return new ResponseEntity<Film>(updatedFilm, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFilmById(@PathVariable(name = "id") Long filmId){
        filmService.deleteFilmById(filmId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
