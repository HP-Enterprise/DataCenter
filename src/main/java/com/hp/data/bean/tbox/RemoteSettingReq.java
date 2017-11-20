package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RemoteSettingReq extends TBoxUpBean{
    private Long eventID;
    private Byte remoteFunction;
    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Byte getRemoteFunction() {
        return remoteFunction;
    }

    public void setRemoteFunction(Byte remoteFunction) {
        this.remoteFunction = remoteFunction;
    }
}
