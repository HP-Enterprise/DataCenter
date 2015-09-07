package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class RemoteWakeUpReq extends TBoxUpBean {
    private long eventID;
    private String serialNumber;
    private String vin;
    private String swVersion;
    private String parmVersion;
    private String dbcVersion;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getSwVersion() {
        return swVersion;
    }

    public void setSwVersion(String swVersion) {
        this.swVersion = swVersion;
    }

    public String getParmVersion() {
        return parmVersion;
    }

    public void setParmVersion(String parmVersion) {
        this.parmVersion = parmVersion;
    }

    public String getDbcVersion() {
        return dbcVersion;
    }

    public void setDbcVersion(String dbcVersion) {
        this.dbcVersion = dbcVersion;
    }
}