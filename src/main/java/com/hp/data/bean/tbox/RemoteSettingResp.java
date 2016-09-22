package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RemoteSettingResp extends TBoxUpBean{
    private Long eventID;
    private Short response;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getResponse() {
        return response;
    }

    public void setResponse(Short response) {
        this.response = response;
    }
}
