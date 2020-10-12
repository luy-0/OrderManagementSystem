package cn.orderManagement.dao;

import cn.orderManagement.bean.Merchant;
import cn.orderManagement.bean.MerchantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MerchantMapper {
    long countByExample(MerchantExample example);

    int deleteByExample(MerchantExample example);

    int deleteByPrimaryKey(Integer merchantId);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    List<Merchant> selectByExampleWithRowbounds(MerchantExample example, RowBounds rowBounds);

    List<Merchant> selectByExample(MerchantExample example);

    Merchant selectByPrimaryKey(Integer merchantId);

    int updateByExampleSelective(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByExample(@Param("record") Merchant record, @Param("example") MerchantExample example);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}