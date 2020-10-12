package cn.orderManagement.dao;

import cn.orderManagement.bean.Bill;
import cn.orderManagement.bean.BillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BillMapper {
    long countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExampleWithRowbounds(BillExample example, RowBounds rowBounds);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}