package com.hand.ssm.service;

import java.util.List;

import com.hand.ssm.dto.Film;



public interface FilmService {
    public List<Film> select(Film film);
    public List<Film> select1(Film film);
    public int insert(Film film);
}
