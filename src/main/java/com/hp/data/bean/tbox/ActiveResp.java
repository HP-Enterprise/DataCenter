package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class ActiveResp extends TBoxDownBean{
    private Long eventID;
    public Long getEventID() {
        return eventID;
    }
    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }
}
