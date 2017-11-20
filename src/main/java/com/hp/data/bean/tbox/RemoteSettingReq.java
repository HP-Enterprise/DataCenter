package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RemoteSettingReq extends TBoxUpBean{
    private Long eventID;
    private Short remoteFunction;
    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getRemoteFunction() {
        return remoteFunction;
    }

    public void setRemoteFunction(Short remoteFunction) {
        this.remoteFunction = remoteFunction;
    }
}
