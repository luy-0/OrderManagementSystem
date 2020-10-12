package cn.orderManagement.bean;

import java.math.BigDecimal;

public class Order {
    private Integer orderId;

    private Integer employeeId;

    private Integer merchantId;

    private BigDecimal totalPrice;

    private Integer orderState;

    private String destitation;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getDestitation() {
        return destitation;
    }

    public void setDestitation(String destitation) {
        this.destitation = destitation == null ? null : destitation.trim();
    }
}