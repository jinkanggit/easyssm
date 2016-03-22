package cn.springmvc.service;

import cn.springmvc.model.Jrisdiction;

public interface JrisdictionService {
	
	 int deleteByPrimaryKey(Integer jrisdictionId);

	    int insert(Jrisdiction record);

	    int insertSelective(Jrisdiction record);

	    Jrisdiction selectByPrimaryKey(Integer jrisdictionId);

	    int updateByPrimaryKeySelective(Jrisdiction record);

	    int updateByPrimaryKey(Jrisdiction record);

}
