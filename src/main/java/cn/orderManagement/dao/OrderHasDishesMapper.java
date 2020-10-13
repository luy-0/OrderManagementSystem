package cn.orderManagement.dao;

import cn.orderManagement.bean.OrderHasDishes;
import cn.orderManagement.bean.OrderHasDishesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderHasDishesMapper {
    long countByExample(OrderHasDishesExample example);

    int deleteByExample(OrderHasDishesExample example);

    int insert(OrderHasDishes record);

    int insertSelective(OrderHasDishes record);

    List<OrderHasDishes> selectByExampleWithRowbounds(OrderHasDishesExample example, RowBounds rowBounds);

    List<OrderHasDishes> selectByExample(OrderHasDishesExample example);

    int updateByExampleSelective(@Param("record") OrderHasDishes record, @Param("example") OrderHasDishesExample example);

    int updateByExample(@Param("record") OrderHasDishes record, @Param("example") OrderHasDishesExample example);
}