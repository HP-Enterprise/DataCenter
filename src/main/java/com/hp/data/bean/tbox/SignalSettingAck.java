package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class SignalSettingAck extends TBoxUpBean{
    private long eventID;
    private short signalSettingAck;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public short getSignalSettingAck() {
        return signalSettingAck;
    }

    public void setSignalSettingAck(short signalSettingAck) {
        this.signalSettingAck = signalSettingAck;
    }
}
