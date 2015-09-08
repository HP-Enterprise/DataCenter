package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramUpdateReq extends TBoxUpBean{
    private Long eventID;
    private String PramVersion;

    public String getPramVersion() {
        return PramVersion;
    }

    public void setPramVersion(String pramVersion) {
        PramVersion = pramVersion;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }
}
