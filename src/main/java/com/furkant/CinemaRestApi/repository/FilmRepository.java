package com.furkant.CinemaRestApi.repository;

import com.furkant.CinemaRestApi.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Long> {

}
