package dao;

import pojo.Hero;

public interface HeroMapper {
    int insert(Hero record);

    int insertSelective(Hero record);
}