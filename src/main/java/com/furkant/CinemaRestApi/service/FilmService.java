package com.furkant.CinemaRestApi.service;

import com.furkant.CinemaRestApi.entity.Film;
import com.furkant.CinemaRestApi.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmRepository filmRepository;

    public Film saveFilm( Film  film){
        return  filmRepository.save(film);
    }

    public List<Film> getAllFilm(){
        return  filmRepository.findAll();
    }

    public Film getFilmById(Long filmId){
        return  filmRepository.findById( filmId).get();
    }

    public Film updateFilm( Film  film){
        return  filmRepository.save(film);
    }

    public void deleteFilmById(Long  filmId){
        filmRepository.deleteById(filmId);
    }

}
