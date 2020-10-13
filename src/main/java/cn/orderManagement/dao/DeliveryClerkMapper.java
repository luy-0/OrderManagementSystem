package cn.orderManagement.dao;

import cn.orderManagement.bean.DeliveryClerk;
import cn.orderManagement.bean.DeliveryClerkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DeliveryClerkMapper {
    long countByExample(DeliveryClerkExample example);

    int deleteByExample(DeliveryClerkExample example);

    int deleteByPrimaryKey(Integer clerkId);

    int insert(DeliveryClerk record);

    int insertSelective(DeliveryClerk record);

    List<DeliveryClerk> selectByExampleWithRowbounds(DeliveryClerkExample example, RowBounds rowBounds);

    List<DeliveryClerk> selectByExample(DeliveryClerkExample example);

    DeliveryClerk selectByPrimaryKey(Integer clerkId);

    int updateByExampleSelective(@Param("record") DeliveryClerk record, @Param("example") DeliveryClerkExample example);

    int updateByExample(@Param("record") DeliveryClerk record, @Param("example") DeliveryClerkExample example);

    int updateByPrimaryKeySelective(DeliveryClerk record);

    int updateByPrimaryKey(DeliveryClerk record);
}