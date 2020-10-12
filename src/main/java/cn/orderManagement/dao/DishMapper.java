package cn.orderManagement.dao;

import cn.orderManagement.bean.Dish;
import cn.orderManagement.bean.DishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DishMapper {
    long countByExample(DishExample example);

    int deleteByExample(DishExample example);

    int deleteByPrimaryKey(Integer dishId);

    int insert(Dish record);

    int insertSelective(Dish record);

    List<Dish> selectByExampleWithRowbounds(DishExample example, RowBounds rowBounds);

    List<Dish> selectByExample(DishExample example);

    Dish selectByPrimaryKey(Integer dishId);

    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByExample(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);
}