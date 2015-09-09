package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class RemoteControlAck extends TBoxUpBean{
    private Long eventID;
    private Short remoteControlAck;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getRemoteControlAck() {
        return remoteControlAck;
    }

    public void setRemoteControlAck(short remoteControlAck) {
        this.remoteControlAck = remoteControlAck;
    }
}
