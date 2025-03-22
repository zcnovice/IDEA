package com.zc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * mybatis工具类
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        //加载核心配置文件创建SqlsessionFactory工厂类对象
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace(); //打印堆栈信息
        }
    }

    /**
     * 获取会话功能对象
     */
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

    /**
     * 根据会话工厂对象回去Sqlsession对象
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}