package com.zc.test;


import com.zc.mapper.UserDetailsMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDetails {
    public static void main(String[] args) {
        SqlSession session = com.zc.util.MybatisUtil.getSqlSession();
        UserDetailsMapper mapper = session.getMapper(UserDetailsMapper.class);


        List<UserDetails> userDetails = mapper.findUserDetails();

        userDetails.forEach(System.out::println);
    }
}
