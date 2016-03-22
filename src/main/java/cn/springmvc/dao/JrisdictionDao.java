package cn.springmvc.dao;

import cn.springmvc.model.Jrisdiction;

public interface JrisdictionDao {
    int deleteByPrimaryKey(Integer jrisdictionId);

    int insert(Jrisdiction record);

    int insertSelective(Jrisdiction record);

    Jrisdiction selectByPrimaryKey(Integer jrisdictionId);

    int updateByPrimaryKeySelective(Jrisdiction record);

    int updateByPrimaryKey(Jrisdiction record);
}