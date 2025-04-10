package com.example.demo.mapper;

import com.example.demo.bean.Depart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import java.util.List;

@Mapper
public interface DepartMapper {
    @Select({
            "select",
            "id, depName, grades",
            "from departments"
    })
    List<Depart> selectAll();
    @Insert({
           "INSERT INTO `test`.`departments` ( `depName`, `grades`) VALUES ( #{name}, #{location});"
    })
    Boolean insert(@Param("name")String name, @Param("location") Integer location);

}