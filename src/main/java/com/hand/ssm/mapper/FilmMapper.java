package com.hand.ssm.mapper;

import java.util.List;

import com.hand.ssm.dto.Film;
/*与FilmMapper.xml 方法对应*/
public interface FilmMapper {
    public List<Film> select(Film film);
    public List<Film> select1(Film film);
    
    public int insertOneItem(Film film);
    
}
