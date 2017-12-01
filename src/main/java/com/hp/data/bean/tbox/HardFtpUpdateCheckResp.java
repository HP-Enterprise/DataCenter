package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class HardFtpUpdateCheckResp extends TBoxDownBean{
    private Long eventID;
    private Short model;
    private String fwDestVersion;
    private String fileName;
    private Short isUpdate;
    private String fwSrcVersion;
    private byte[] ftpIp;
    private Integer ftpPort;
    private String dialUserNumber;
    private String dialPin;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getModel() {
        return model;
    }

    public void setModel(Short model) {
        this.model = model;
    }

    public String getFwDestVersion() {
        return fwDestVersion;
    }

    public void setFwDestVersion(String fwDestVersion) {
        this.fwDestVersion = fwDestVersion;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Short getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Short isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getFwSrcVersion() {
        return fwSrcVersion;
    }

    public void setFwSrcVersion(String fwSrcVersion) {
        this.fwSrcVersion = fwSrcVersion;
    }

    public byte[] getFtpIp() {
        return ftpIp;
    }

    public void setFtpIp(byte[] ftpIp) {
        this.ftpIp = ftpIp;
    }

    public Integer getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(Integer ftpPort) {
        this.ftpPort = ftpPort;
    }

    public String getDialUserNumber() {
        return dialUserNumber;
    }

    public void setDialUserNumber(String dialUserNumber) {
        this.dialUserNumber = dialUserNumber;
    }

    public String getDialPin() {
        return dialPin;
    }

    public void setDialPin(String dialPin) {
        this.dialPin = dialPin;
    }
}
