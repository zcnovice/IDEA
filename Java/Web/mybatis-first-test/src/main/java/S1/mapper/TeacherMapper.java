package S1.mapper;

import S1.entity.Teacher;

public interface TeacherMapper {
    //根据id查询教师信息
    Teacher getTeacherById(Integer tid);
}
