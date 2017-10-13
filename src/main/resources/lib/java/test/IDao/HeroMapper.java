package test.IDao;

import test.domain.Hero;

public interface HeroMapper {
    int insert(Hero record);

    int insertSelective(Hero record);
}