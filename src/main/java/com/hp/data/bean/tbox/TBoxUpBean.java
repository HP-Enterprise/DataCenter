package com.hp.data.bean.tbox;


public abstract class TBoxUpBean extends TBoxBean{
    private Long sendingTime;
    private Short applicationID;
    private Short messageID;
    private String imei;
    private Short protocolVersionNumber;
    private Integer vehicleID;
    private Short tripID;
    private Integer reserved;

    public Long getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(Long sendingTime) {
        this.sendingTime = sendingTime;
    }

    public Short getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(Short applicationID) {
        this.applicationID = applicationID;
    }

    public Short getMessageID() {
        return messageID;
    }

    public void setMessageID(Short messageID) {
        this.messageID = messageID;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Short getProtocolVersionNumber() {
        return protocolVersionNumber;
    }

    public void setProtocolVersionNumber(Short protocolVersionNumber) {
        this.protocolVersionNumber = protocolVersionNumber;
    }

    public Integer getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(Integer vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Short getTripID() {
        return tripID;
    }

    public void setTripID(Short tripID) {
        this.tripID = tripID;
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }
}
