package com.example.backend.mapper;

import com.example.backend.entity.Info;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InfoMapper {

    @Select("SELECT * FROM INFO")
    List<Info> findALL();



    @Select("SELECT * FROM INFO WHERE SNAME = #{sname}")
    List<Info> findBySname(@Param("sname") String sname);


}
