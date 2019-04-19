package com.newer.gym.repository;

import com.newer.gym.bean.CourseInstruction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: 课程管理Mapper
 * @Author: pjun
 * @CreateDate: 2019-04-18 16:31
 */
@Mapper
public interface CourseMapper {
    /**
     * 添加一个课程介绍信息
     *
     * @param ci 课程介绍实体
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 16:52
     */
    @Select("insert into course_instruction() values()")
    public void addCourseInstruction(CourseInstruction ci);

    /**
     * 修改课程介绍信息
     *
     * @param ci 课程介绍实体
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 16:53
     */
    public void updateCourseInstruction(CourseInstruction ci);

    /**
     * 根据id删除课程介绍信息
     *
     * @param id 课程介绍id
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 16:54
     */
    public void deleteCourseInstruction(int id);

    /**
     * 获得所有课程介绍信息
     *
     * @param
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-18 16:58
     */
    public List<CourseInstruction> selectCourseInstructions();

    /**
     * 根据id查询
     *
     * @param
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-19 9:06
     */
    public CourseInstruction selectCourseInstruction(int CourseInstructionId);
}
