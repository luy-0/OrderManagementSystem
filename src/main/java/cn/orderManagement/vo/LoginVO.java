package cn.orderManagement.vo;

import lombok.Data;

@Data
public class LoginVO {
    String workNumberOrUserName;
    String password;
    String personnel;
}
