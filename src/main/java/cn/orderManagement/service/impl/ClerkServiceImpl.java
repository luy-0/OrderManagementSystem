package cn.orderManagement.service.impl;

import cn.orderManagement.bean.DeliveryClerk;
import cn.orderManagement.bean.DeliveryClerkExample;
import cn.orderManagement.dao.DeliveryClerkMapper;
import cn.orderManagement.service.interfaces.ClerkService;
import cn.orderManagement.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClerkServiceImpl implements ClerkService {

    @Autowired
    DeliveryClerkMapper deliveryClerkMapper;

    @Override
    public String registerClerk(DeliveryClerk deliveryClerk) {
        DeliveryClerkExample deliveryClerkExample = new DeliveryClerkExample();
        DeliveryClerkExample.Criteria criteria = deliveryClerkExample.createCriteria();
        criteria.andWorkNumberEqualTo(deliveryClerk.getWorkNumber());
        List<DeliveryClerk> clerkList = deliveryClerkMapper.selectByExample(deliveryClerkExample);
        if(clerkList.size()!=0){
            return "已经有这个用户了";
        }
        deliveryClerkMapper.insert(deliveryClerk);
        return "注册成功";
    }

    @Override
    public boolean loginClerk(LoginVO loginVO) {
        String clerkName = loginVO.getWorkNumberOrUserName();
        String workNumber = loginVO.getWorkNumberOrUserName();
        DeliveryClerkExample deliveryClerkExample = new DeliveryClerkExample();
        DeliveryClerkExample.Criteria criteria1 = deliveryClerkExample.createCriteria();
        criteria1.andClearkNameEqualTo(clerkName);
        DeliveryClerkExample.Criteria criteria2 = deliveryClerkExample.createCriteria();
        criteria2.andWorkNumberEqualTo(workNumber);
        deliveryClerkExample.or(criteria2);
        List<DeliveryClerk> deliveryClerk = deliveryClerkMapper.selectByExample(deliveryClerkExample);
        if(deliveryClerk.size()!=0){
            return true;
        }
        return false;
    }
}
