package com.wn.test;

import com.wn.entity.Teacher;
import com.wn.mapper.TeacherMapper;
import com.wn.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MybatisMapperTest {
    private static SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
    private static TeacherMapper mapper = session.getMapper(TeacherMapper.class);
    public static void main(String[] args) throws IOException {
//        mapper.deleteById(6);
//        session.commit();

//        selectById();
//        selectAll();
//        insertTeacher();
        update();
    }

    private static void update() {
        Teacher updateTea = mapper.getById(12);
        updateTea.setTname("老马识途");
        mapper.updateById(updateTea);
        session.commit();
    }


    private static void insertTeacher() {
        Teacher teacher = new Teacher(12, "老马", "网络安全",30);
        mapper.insert(teacher);
        session.commit();
    }

    private static void selectAll() {
        List<Teacher> list = mapper.findAll();
        list.forEach(System.out::println);
    }

    public static void selectById() throws IOException {
        //调用方法
        Teacher teacher = mapper.getById(3);
        System.out.println(teacher);
    }
}
