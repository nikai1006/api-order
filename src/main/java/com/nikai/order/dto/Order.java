package com.nikai.order.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * order-service com.nikai.order.dto
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 22:00 2018/11/11
 * @Modified By:
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 4619448751647285531L;
    /**
     * Long:下单用户
     */
    private Long userId;

    /**
     * String:下单用户名
     */
    private String userName;

    /**
     * java.math.BigDecimal:商品总金额
     */
    private BigDecimal orderAmount;

    /**
     * java.math.BigDecimal:配送费用
     */
    private BigDecimal postage;

    /**
     * java.math.BigDecimal:优惠金额
     */
    private BigDecimal couponAmount;

    /**
     * String:优惠券
     */
    private String couponCode;

    /**
     * java.math.BigDecimal:满减金额
     */
    private BigDecimal reduceAmount;

    /**
     * java.lang.Integer:赠送积分
     */
    private Integer point;

    /**
     * java.lang.Integer:订单状态
     */
    private Integer status;

    /**
     * java.lang.Integer:支付状态
     */
    private Integer payStatus;

    /**
     * java.lang.Integer:配送状态
     */
    private Integer deliverStatus;

    /**
     * java.lang.Integer:支付方式
     */
    private Integer payType;

    /**
     * java.lang.String:支付平台交易号
     */
    private String paymentFlowNo;

    /**
     * java.lang.String:支付单 Id
     */
    private String payNo;

    /**
     * java.lang.String:快递单号
     */
    private String deliveryCode;

    /**
     * java.lang.String:快递公司名
     */
    private String deliverCompanyName;

    /**
     * java.util.Date:付款时间
     */
    private Date payTime;

    /**
     * java.lang.Integer:省
     */
    private Integer province;

    /**
     * java.lang.Integer:市id
     */
    private Integer city;

    /**
     * java.lang.Integer:地区id
     */
    private Integer area;

    /**
     * java.lang.String:省市字符串
     */
    private String pca;


    /**
     * java.lang.Integer:城市编码
     */
    private Integer country;

    /**
     * java.lang.String:详细地址
     */
    private String detatilAddress;


    /**
     * java.lang.String:收货人
     */
    private String deliverUserName;

    /**
     * java.lang.String:手机
     */
    private String mobile;

    /**
     * java.lang.String:邮编
     */
    private String postCode;

    /**
     * java.lang.String:电话
     */
    private String telphone;

    /**
     * java.util.Date:发货时间
     */
    private Date deliverStartedTime;

    /**
     * java.util.Date:下单时间
     */
    private Date createdTime;

    /**
     * java.util.Date:完成时间
     */
    private Date completedTime;

    /**
     * java.lang.Long:关闭时间
     */
    private Long closeTime;

    /**
     * java.lang.Long: 备货时间
     */
    private Long pickingTime;

    /**
     * java.lang.Integer: 删除状态
     */
    private Integer deleteStatus;


    /**
     * java.lang.Integer: 订单来源 1pc 2 m 3 android 4 iphone 5 ipad
     */
    private Integer from;

    /**
     * java.lang.Integer: 支付来源
     */
    private Integer payFrom;

    /**
     * java.lang.String: 用户备注
     */
    private String userRemark;

    /**
     * java.lang.Integer: 取消原因
     */
    private Integer reason;

    /**
     * java.lang.Long: 商家id
     */
    private Long sellerId;

    /**
     * java.lang.String: 商家名称
     */
    private String sellerName;

    /**
     * java.lang.String:商家备注
     */
    private String sellerRemark;

    /**
     * java.lang.String:管理员备注
     */
    private String manageComments;

    /**
     * java.math.BigDecimal:实付款
     */
    private BigDecimal amount;

    /**
     * java.util.Date:审核时间
     */
    private Date verifyTime;

    /**
     * java.lang.Integer:订单类型
     */
    private Integer type;

    /**
     * java.lang.Integer:订单售后类型
     */
    private Integer subType;

    /**
     * java.lang.Integer:延期时间
     */
    private String expireTime;

    /**
     * java.lang.String:服务器时间
     */
    private String currentServerTime;

    /**
     * java.lang.Integer: 订单下商品总数量
     */
    private Integer goodsNum;

    /**
     * java.lang.Integer: 有没有更改地址
     */
    private Integer isModifyAddress;

    /**
     * java.lang.Integer:是否可以取消 0:不可取消 1:可以取消
     */
    private Integer cancelFlag;

    /**
     * java.lang.Integer: 是否有关联订单 0:没有关联订单 1:有关联订单
     */
    private Integer relatedOrderFlag;


    /**
     * java.lang.Integer: 待发货订单关联订单是否存在发货前退款商品 0：不存在 1：存在
     */
    private Integer goodsRefundFlag;

    /**
     * java.lang.Integer: 是否有赠品标示
     */
    private Integer giftFlag;

    /**
     * @required FALSE
     */
    private List<GoodsInfo> goods;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public BigDecimal getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(Integer deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPaymentFlowNo() {
        return paymentFlowNo;
    }

    public void setPaymentFlowNo(String paymentFlowNo) {
        this.paymentFlowNo = paymentFlowNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getDeliveryCode() {
        return deliveryCode;
    }

    public void setDeliveryCode(String deliveryCode) {
        this.deliveryCode = deliveryCode;
    }

    public String getDeliverCompanyName() {
        return deliverCompanyName;
    }

    public void setDeliverCompanyName(String deliverCompanyName) {
        this.deliverCompanyName = deliverCompanyName;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getPca() {
        return pca;
    }

    public void setPca(String pca) {
        this.pca = pca;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public String getDetatilAddress() {
        return detatilAddress;
    }

    public void setDetatilAddress(String detatilAddress) {
        this.detatilAddress = detatilAddress;
    }

    public String getDeliverUserName() {
        return deliverUserName;
    }

    public void setDeliverUserName(String deliverUserName) {
        this.deliverUserName = deliverUserName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Date getDeliverStartedTime() {
        return deliverStartedTime;
    }

    public void setDeliverStartedTime(Date deliverStartedTime) {
        this.deliverStartedTime = deliverStartedTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Date completedTime) {
        this.completedTime = completedTime;
    }

    public Long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
    }

    public Long getPickingTime() {
        return pickingTime;
    }

    public void setPickingTime(Long pickingTime) {
        this.pickingTime = pickingTime;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getPayFrom() {
        return payFrom;
    }

    public void setPayFrom(Integer payFrom) {
        this.payFrom = payFrom;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark;
    }

    public String getManageComments() {
        return manageComments;
    }

    public void setManageComments(String manageComments) {
        this.manageComments = manageComments;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getCurrentServerTime() {
        return currentServerTime;
    }

    public void setCurrentServerTime(String currentServerTime) {
        this.currentServerTime = currentServerTime;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getIsModifyAddress() {
        return isModifyAddress;
    }

    public void setIsModifyAddress(Integer isModifyAddress) {
        this.isModifyAddress = isModifyAddress;
    }

    public Integer getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(Integer cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public Integer getRelatedOrderFlag() {
        return relatedOrderFlag;
    }

    public void setRelatedOrderFlag(Integer relatedOrderFlag) {
        this.relatedOrderFlag = relatedOrderFlag;
    }

    public Integer getGoodsRefundFlag() {
        return goodsRefundFlag;
    }

    public void setGoodsRefundFlag(Integer goodsRefundFlag) {
        this.goodsRefundFlag = goodsRefundFlag;
    }

    public Integer getGiftFlag() {
        return giftFlag;
    }

    public void setGiftFlag(Integer giftFlag) {
        this.giftFlag = giftFlag;
    }

    public List<GoodsInfo> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsInfo> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Order{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", orderAmount=" + orderAmount +
            ", postage=" + postage +
            ", couponAmount=" + couponAmount +
            ", couponCode='" + couponCode + '\'' +
            ", reduceAmount=" + reduceAmount +
            ", point=" + point +
            ", status=" + status +
            ", payStatus=" + payStatus +
            ", deliverStatus=" + deliverStatus +
            ", payType=" + payType +
            ", paymentFlowNo='" + paymentFlowNo + '\'' +
            ", payNo='" + payNo + '\'' +
            ", deliveryCode='" + deliveryCode + '\'' +
            ", deliverCompanyName='" + deliverCompanyName + '\'' +
            ", payTime=" + payTime +
            ", province=" + province +
            ", city=" + city +
            ", area=" + area +
            ", pca='" + pca + '\'' +
            ", country=" + country +
            ", detatilAddress='" + detatilAddress + '\'' +
            ", deliverUserName='" + deliverUserName + '\'' +
            ", mobile='" + mobile + '\'' +
            ", postCode='" + postCode + '\'' +
            ", telphone='" + telphone + '\'' +
            ", deliverStartedTime=" + deliverStartedTime +
            ", createdTime=" + createdTime +
            ", completedTime=" + completedTime +
            ", closeTime=" + closeTime +
            ", pickingTime=" + pickingTime +
            ", deleteStatus=" + deleteStatus +
            ", from=" + from +
            ", payFrom=" + payFrom +
            ", userRemark='" + userRemark + '\'' +
            ", reason=" + reason +
            ", sellerId=" + sellerId +
            ", sellerName='" + sellerName + '\'' +
            ", sellerRemark='" + sellerRemark + '\'' +
            ", manageComments='" + manageComments + '\'' +
            ", amount=" + amount +
            ", verifyTime=" + verifyTime +
            ", type=" + type +
            ", subType=" + subType +
            ", expireTime='" + expireTime + '\'' +
            ", currentServerTime='" + currentServerTime + '\'' +
            ", goodsNum=" + goodsNum +
            ", isModifyAddress=" + isModifyAddress +
            ", cancelFlag=" + cancelFlag +
            ", relatedOrderFlag=" + relatedOrderFlag +
            ", goodsRefundFlag=" + goodsRefundFlag +
            ", giftFlag=" + giftFlag +
            '}';
    }
}
