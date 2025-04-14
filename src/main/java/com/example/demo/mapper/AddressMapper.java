package com.example.demo.mapper;

import com.example.demo.bean.Address;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AddressMapper {
    @Select({
            "select count(name) as counts from address"
    })
    Integer getAddressCounts();
    @Select({
            "select",
            "id, name, phone, address",
            "from address"
    })
    List<Address> selectAll();
    @Select({
            "select",
            "id, name, phone, address",
            "from address limit #{start},#{count}"
    })
    List<Address> selectByPageNum(@Param("start")Integer start,@Param("count") Integer count);
    @Insert({
           "INSERT INTO `test`.`address` ( `name`, `phone`,`address`) VALUES ( #{name}, #{phone},#{address});"
    })
    Boolean insert(@Param("name")String name, @Param("phone") String phone,@Param("address") String address);

    @Delete({
            "DELETE FROM `test`.`address` WHERE (`id` = #{id});"
    })
    Boolean delete(@Param("id") Integer id);
    @Update({
           "UPDATE `test`.`address` SET `name` = #{name}, `phone` = #{phone}, `address` = #{address} WHERE (`id` = #{id});"
    })
    Boolean update(@Param("id") Integer id,@Param("name")String name, @Param("phone") String phone,@Param("address") String address);
}