package cn.orderManagement.service.interfaces;

import cn.orderManagement.bean.DeliveryClerk;
import cn.orderManagement.vo.LoginVO;

public interface ClerkService {
    String registerClerk(DeliveryClerk deliveryClerk);

    boolean loginClerk(LoginVO loginVO);
}
