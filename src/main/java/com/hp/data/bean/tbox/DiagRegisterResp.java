package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class DiagRegisterResp extends TBoxDownBean{
    private Long eventID;
    private Short registerResult;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getRegisterResult() {
        return registerResult;
    }

    public void setRegisterResult(Short registerResult) {
        this.registerResult = registerResult;
    }
}
