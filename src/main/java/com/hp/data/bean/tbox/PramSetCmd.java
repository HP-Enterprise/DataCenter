package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramSetCmd extends TBoxDownBean{
    private Long eventID;
    private Short pramSetNumber;
    private Short pramSetID;
    private Short pramValue;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getPramSetNumber() {
        return pramSetNumber;
    }

    public void setPramSetNumber(short pramSetNumber) {
        this.pramSetNumber = pramSetNumber;
    }

    public Short getPramSetID() {
        return pramSetID;
    }

    public void setPramSetID(short pramSetID) {
        this.pramSetID = pramSetID;
    }

    public Short getPramValue() {
        return pramValue;
    }

    public void setPramValue(short pramValue) {
        this.pramValue = pramValue;
    }
}
