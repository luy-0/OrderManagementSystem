package cn.orderManagement.dao;

import cn.orderManagement.bean.orderHasDishes;
import cn.orderManagement.bean.orderHasDishesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface orderHasDishesMapper {
    long countByExample(orderHasDishesExample example);

    int deleteByExample(orderHasDishesExample example);

    int insert(orderHasDishes record);

    int insertSelective(orderHasDishes record);

    List<orderHasDishes> selectByExampleWithRowbounds(orderHasDishesExample example, RowBounds rowBounds);

    List<orderHasDishes> selectByExample(orderHasDishesExample example);

    int updateByExampleSelective(@Param("record") orderHasDishes record, @Param("example") orderHasDishesExample example);

    int updateByExample(@Param("record") orderHasDishes record, @Param("example") orderHasDishesExample example);
}