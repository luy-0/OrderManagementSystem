package cn.orderManagement.dao;

import cn.orderManagement.bean.MenuHasDishes;
import cn.orderManagement.bean.MenuHasDishesExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface MenuHasDishesMapper {
    long countByExample(MenuHasDishesExample example);

    int deleteByExample(MenuHasDishesExample example);

    int insert(MenuHasDishes record);

    int insertSelective(MenuHasDishes record);

    List<MenuHasDishes> selectByExampleWithRowbounds(MenuHasDishesExample example, RowBounds rowBounds);

    List<MenuHasDishes> selectByExample(MenuHasDishesExample example);

    int updateByExampleSelective(@Param("record") MenuHasDishes record, @Param("example") MenuHasDishesExample example);

    int updateByExample(@Param("record") MenuHasDishes record, @Param("example") MenuHasDishesExample example);
}