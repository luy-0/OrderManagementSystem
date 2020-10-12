package cn.orderManagement.dao;

import cn.orderManagement.bean.Complaint;
import cn.orderManagement.bean.ComplaintExample;
import cn.orderManagement.bean.ComplaintWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ComplaintMapper {
    long countByExample(ComplaintExample example);

    int deleteByExample(ComplaintExample example);

    int deleteByPrimaryKey(Integer complaintId);

    int insert(ComplaintWithBLOBs record);

    int insertSelective(ComplaintWithBLOBs record);

    List<ComplaintWithBLOBs> selectByExampleWithBLOBsWithRowbounds(ComplaintExample example, RowBounds rowBounds);

    List<ComplaintWithBLOBs> selectByExampleWithBLOBs(ComplaintExample example);

    List<Complaint> selectByExampleWithRowbounds(ComplaintExample example, RowBounds rowBounds);

    List<Complaint> selectByExample(ComplaintExample example);

    ComplaintWithBLOBs selectByPrimaryKey(Integer complaintId);

    int updateByExampleSelective(@Param("record") ComplaintWithBLOBs record, @Param("example") ComplaintExample example);

    int updateByExampleWithBLOBs(@Param("record") ComplaintWithBLOBs record, @Param("example") ComplaintExample example);

    int updateByExample(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByPrimaryKeySelective(ComplaintWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ComplaintWithBLOBs record);

    int updateByPrimaryKey(Complaint record);
}