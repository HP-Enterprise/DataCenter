package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramUpdateResp extends TBoxDownBean{
    private long eventID;
    private String PramVersion;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public String getPramVersion() {
        return PramVersion;
    }

    public void setPramVersion(String pramVersion) {
        PramVersion = pramVersion;
    }
}
