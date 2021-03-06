package cn.springmvc.service;
 
import cn.springmvc.model.User;
 

public interface UserService {
 
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
    
    int deleteByPrimaryKey(Integer userId);
 
    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}