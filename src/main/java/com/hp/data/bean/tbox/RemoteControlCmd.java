package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class RemoteControlCmd extends TBoxDownBean{
    private Long eventID;
    private Long remoteControlType;
    private Short acTemperature;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Long getRemoteControlType() {
        return remoteControlType;
    }

    public void setRemoteControlType(Long remoteControlType) {
        this.remoteControlType = remoteControlType;
    }

    public Short getAcTemperature() {
        return acTemperature;
    }

    public void setAcTemperature(Short acTemperature) {
        this.acTemperature = acTemperature;
    }
}
