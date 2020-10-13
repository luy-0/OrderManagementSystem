package cn.orderManagement.bean;

public class DeliveryClerk {
    private Integer clerkId;

    private String workNumber;

    private String clearkName;

    private String clearkPassword;

    private Integer orderId;

    public Integer getClerkId() {
        return clerkId;
    }

    public void setClerkId(Integer clerkId) {
        this.clerkId = clerkId;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber == null ? null : workNumber.trim();
    }

    public String getClearkName() {
        return clearkName;
    }

    public void setClearkName(String clearkName) {
        this.clearkName = clearkName == null ? null : clearkName.trim();
    }

    public String getClearkPassword() {
        return clearkPassword;
    }

    public void setClearkPassword(String clearkPassword) {
        this.clearkPassword = clearkPassword == null ? null : clearkPassword.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}