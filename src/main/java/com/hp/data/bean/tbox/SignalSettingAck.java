package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class SignalSettingAck extends TBoxUpBean{
    private Long eventID;
    private Short signalSettingAck;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getSignalSettingAck() {
        return signalSettingAck;
    }

    public void setSignalSettingAck(short signalSettingAck) {
        this.signalSettingAck = signalSettingAck;
    }
}
