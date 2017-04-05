package com.hand.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.ssm.dto.Film;
import com.hand.ssm.mapper.FilmMapper;
import com.hand.ssm.service.FilmService;

@Service
@Transactional
public class FilmServiceImpl implements FilmService {
	
	 @Autowired
	 private FilmMapper filmMapper;
	 
	


	public List<Film> select(Film film) {
		List<Film> filmList=filmMapper.select(film);
		return filmList;
	}
	
	public List<Film> select1(Film film) {
		List<Film> filmList=filmMapper.select(film);
		return filmList;
	}


	public int insert(Film film) {
		return filmMapper.insertOneItem(film);
	}

}
