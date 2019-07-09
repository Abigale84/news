package com.lq.user.mapper;

import com.lq.user.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/9 17:21
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("select id,mobile,password from news_user where mobile = #{mobile} and password = #{password}")
    List<UserBean> selectUser(String mobile, String password);
}