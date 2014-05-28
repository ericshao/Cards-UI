package com.afollestad.sample;

import co.yun56.ui.card.CardData;

import java.sql.Timestamp;

/**
 * Created by eric on 14-5-27.
 */
public class LoadData implements CardData {
    private int loadId;
    private int loadType;           //货源类型，1:整车普货 2:集装箱 3:特种货物

    private int type;

    private String origin;            //起始地
    private String originCityCode;    //起始地城市代码
    private String destination;              //目的地
    private String destCityCode;      //目的地城市代码
    //时间要求
    private Timestamp pickupDate;        //提货日期时间
    private Timestamp deliverDate;       //交付日期时间

    private int dispatcherId;       //调车人的userId
    private Timestamp createDate;        //创建日期时间
    private Timestamp publishDate;       //发布日期时间
    private Timestamp completeDate;      //完成日期时间

    private float amount;           //货物数量
    private int unitType;           //货物单位类型，重量或材积
    private String loadDesc;        //货物描述

    //集装箱货运要求
    private int containerType;      //集装箱箱型

    //普通整车货运要求
    private String vehicleType;     //要求车型
    private String vehicleLength;   //要求车长

    //调度视角
    private int appliedNumber;      //申请数量
    private int status;             //调车状态：0:待调度、1:调度中、2:已完成

    //司机视角
    private boolean applied;        //是否已申请
    private boolean carried;        //是否已承运

    private boolean topped;         //是否已置顶

    //private int isTop;
    //private int isCarriage;
    //private int submitted;


    public LoadData() {
    }




    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginCityCode() {
        return originCityCode;
    }

    public void setOriginCityCode(String originCityCode) {
        this.originCityCode = originCityCode;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestCityCode() {
        return destCityCode;
    }

    public void setDestCityCode(String destCityCode) {
        this.destCityCode = destCityCode;
    }

    public Timestamp getPickupDate() {
        return pickupDate;
    }

    public Timestamp getDeliverDate() {
        return deliverDate;
    }


    public int getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(int dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }


    public Timestamp getPublishDate() {
        return publishDate;
    }


    public Timestamp getCompleteDate() {
        return completeDate;
    }


    public int getLoadType() {
        return loadType;
    }

    public void setLoadType(int loadType) {
        this.loadType = loadType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getUnitType() {
        return unitType;
    }

    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

    public String getLoadDesc() {
        return loadDesc;
    }

    public void setLoadDesc(String loadDesc) {
        this.loadDesc = loadDesc;
    }

    public int getContainerType() {
        return containerType;
    }

    public void setContainerType(int containerType) {
        this.containerType = containerType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleLength() {
        return vehicleLength;
    }

    public void setVehicleLength(String vehicleLength) {
        this.vehicleLength = vehicleLength;
    }

    public int getAppliedNumber() {
        return appliedNumber;
    }

    public void setAppliedNumber(int appliedNumber) {
        this.appliedNumber = appliedNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isApplied() {
        return applied;
    }

    public void setApplied(boolean applied) {
        this.applied = applied;
    }

    public boolean isCarried() {
        return carried;
    }

    public void setCarried(boolean carried) {
        this.carried = carried;
    }

    public boolean isTopped() {
        return topped;
    }

    public void setTopped(boolean topped) {
        this.topped = topped;
    }

    public void setPickupDate(Timestamp pickupDate) {
        this.pickupDate = pickupDate;
    }

    public void setDeliverDate(Timestamp deliverDate) {
        this.deliverDate = deliverDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }

    public void setCompleteDate(Timestamp completeDate) {
        this.completeDate = completeDate;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int getCardType() {
        return type;
    }
}
