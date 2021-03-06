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
     * @required FALSE
     */
    private List<GoodsInfo> goods;

    private MultiTypeDto<String, Integer, GoodsInfo> multiTypeDto;

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

    public List<GoodsInfo> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsInfo> goods) {
        this.goods = goods;
    }

    public MultiTypeDto<String, Integer, GoodsInfo> getMultiTypeDto() {
        return multiTypeDto;
    }

    public void setMultiTypeDto(
        MultiTypeDto<String, Integer, GoodsInfo> multiTypeDto) {
        this.multiTypeDto = multiTypeDto;
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
            ", payType=" + payType +
            ", paymentFlowNo='" + paymentFlowNo + '\'' +
            ", payNo='" + payNo + '\'' +
            ", deliveryCode='" + deliveryCode + '\'' +
            ", deliverCompanyName='" + deliverCompanyName + '\'' +
            ", payTime=" + payTime +
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
            ", goods=" + goods +
            '}';
    }
}
