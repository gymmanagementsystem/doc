package com.newer.gym.repository;

import com.newer.gym.bean.Department;
import com.newer.gym.bean.Staff;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
* @Description:    人事数据操作类
* @Author:         HiFiYi
* @CreateDate:     2019/4/17 11:29
*/
@Mapper
public interface PersonnelMapper {

    /**
    * 方法实现说明    插入一条员工信息
    * @author      HiFiYi
    * @date        2019/4/17 11:38
    */
    @Insert("insert into staff(name,sex,birthday,time,address,job,phone,department_id,remark)" +
            " values (#{name},#{sex},#{birthday},#{time},#{address},#{job},#{phone}," +
            "#{department.id},#{remark})")
    void insertStaff(Staff staff);

    /**
     * 方法实现说明   更新一条员工信息
     * @author      HiFiYi
     * @date        2019/4/17 11:38
     */
    @Update("update staff set name=#{name},sex=#{sex},birthday=#{birthday},time=#{time}," +
            "address=#{address},job=#{job},phone=#{phone},department_id=#{department.id}," +
            "remark=#{remark} where id=#{id}")
    void updateStaff(Staff staff);

    /**
     * 方法实现说明   删除一条员工信息
     * @author      HiFiYi
     * @date        2019/4/17 11:38
     */
    @Delete("delete from staff where id=#{id}")
    void deleteStaff(@Param("id") int staffId);

    /**
     * 方法实现说明   获得一条员工信息
     * @author      HiFiYi
     * @return
     * @exception
     * @date        2019/4/17 11:38
     */
    @Select("select * from staff where id=#{id}")
    @Results({@Result(column ="department_id",property = "department",one = @One(select = "selectDepartment"))})
    Staff selectStaff(@Param("id") int staffId);

    /**
    * 方法实现说明    获得多条员工信息
    * @author      HiFiYi
    * @return
    * @date        2019/4/17 11:38
    */
//    @Select("select * from staff")
//    @Results({@Result(column ="department_id",property = "department",one = @One(select = "selectDepartmentById"))})
//    List<Staff> selectStaffs ();
//    @Select("select * from department where id = #{id}")
//    Department selectDepartmentById(@Param("id") int departmentId);
//    @Select("select count(*) from staff")
//    int selectStaffsCount();
//
//    @Select("select * from staff where depardment_id=#{id}")
//    List<Staff> getStaffByDepartmentId(@Param("id") int department_id);
    @SelectProvider(method = "selectStaffs",type = PersonnelMapperProvider.class)
    @Results({@Result(column = "department_id",property = "department",one = @One(select = "selectDepartmentById"))})
    List<Staff> selectStaffs(Map<String,Object> map);
    @Select("select * from department where id = #{id}")
    Department selectDepartmentById(@Param("id") int departmentId);
    @SelectProvider(method = "selectStaffsCount",type = PersonnelMapperProvider.class)
    int selectStaffsCount(Map<String,Object> map);


    /**
     * 方法实现说明   插入一条部门信息
     * @author      HiFiYi
     * @date        2019/4/17 11:38
     */
    @Insert("insert into department(name,info,remark) values (#{name},#{info},#{remark})")
    void insertDepartment (Department department);

    /**
     * 方法实现说明   更新一条部门信息
     * @author      HiFiYi
     * @date        2019/4/17 11:38
     */
    @Update("update department set name=#{name},info=#{info},remark=#{remark} where id=#{id}")
    void updateDepartment(Department department);

    /**
     * 方法实现说明   删除一条部门信息
     * @author      HiFiYi
     * @date        2019/4/17 11:38
     */
    @Delete("delete from department where id=#{id}")
    void deleteDepartment(@Param("id") int departmentId);

    /**
     * 方法实现说明   获得多个部门信息
     * @author      HiFiYi
     * @return
     * @date        2019/4/17 11:38
     */
    @Select("select * from department")
    @Results({@Result(column = "id",property = "id")})
    List<Department> selectDepartments();

    /**
     * 方法实现说明
     * @author      HiFiYi
     * @return
     * @date        2019/4/17 11:38
     */
    @Select("select * from department where id = #{id}")
    @Results({@Result(column = "id",property = "staffs",one = @One(select = "selectStaffsByDepartmentId"))})
    Department selectDepartment(@Param("id") int departmentId);


    /**
     * 方法实现说明    根据部门编号获得多条员工信息
     * @author      HiFiYi
     * @return
     * @date        2019/4/17 11:39
     */
    @Select("select * from staff where department_id=#{id}")
    List<Staff> selectStaffsByDepartmentId (@Param("id") int departmentId);
}
