package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class SoftFtpUpdateResult extends TBoxUpBean{
    private Long eventID;
    private String vin;
    private Short updateType;
    private String destVersion;
    private Short updateStep;
    private Short updateResult;
    private Short errorCode;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Short getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Short updateType) {
        this.updateType = updateType;
    }

    public String getDestVersion() {
        return destVersion;
    }

    public void setDestVersion(String destVersion) {
        this.destVersion = destVersion;
    }

    public Short getUpdateStep() {
        return updateStep;
    }

    public void setUpdateStep(Short updateStep) {
        this.updateStep = updateStep;
    }

    public Short getUpdateResult() {
        return updateResult;
    }

    public void setUpdateResult(Short updateResult) {
        this.updateResult = updateResult;
    }

    public Short getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Short errorCode) {
        this.errorCode = errorCode;
    }
}
