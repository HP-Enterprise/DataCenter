package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramUpdateCmd extends TBoxDownBean{
    private long eventID;
    private String pramUpdateReady;

    public String getPramUpdateReady() {
        return pramUpdateReady;
    }

    public void setPramUpdateReady(String pramUpdateReady) {
        this.pramUpdateReady = pramUpdateReady;
    }

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }
}
