package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RemoteSettingReq extends TBoxDownBean{
    private Long eventID;
    private Integer remoteFunction;
    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Integer getRemoteFunction() {
        return remoteFunction;
    }

    public void setRemoteFunction(Integer remoteFunction) {
        this.remoteFunction = remoteFunction;
    }
}
