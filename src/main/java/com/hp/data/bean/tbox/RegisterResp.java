package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class RegisterResp extends TBoxDownBean{
    private Long eventID;
    private Short registerResult;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getRegisterResult() {
        return registerResult;
    }

    public void setRegisterResult(Short registerResult) {
        this.registerResult = registerResult;
    }
}
