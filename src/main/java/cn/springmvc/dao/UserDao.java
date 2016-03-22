package cn.springmvc.dao;
 
import cn.springmvc.model.User;
 
 
public interface UserDao {
 
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