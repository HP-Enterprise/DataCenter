package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class RemoteControlCmd extends TBoxDownBean{
    private long eventID;
    private long remoteControlType;
    private short acTemperature;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public long getRemoteControlType() {
        return remoteControlType;
    }

    public void setRemoteControlType(long remoteControlType) {
        this.remoteControlType = remoteControlType;
    }

    public short getAcTemperature() {
        return acTemperature;
    }

    public void setAcTemperature(short acTemperature) {
        this.acTemperature = acTemperature;
    }
}
