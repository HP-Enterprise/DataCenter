package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RemoteControlCmd extends TBoxDownBean{
    private Long eventID;
    private Long remoteControlType;
    private Short acTemperature;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Long getRemoteControlType() {
        return remoteControlType;
    }

    public void setRemoteControlType(long remoteControlType) {
        this.remoteControlType = remoteControlType;
    }

    public Short getAcTemperature() {
        return acTemperature;
    }

    public void setAcTemperature(short acTemperature) {
        this.acTemperature = acTemperature;
    }
}
