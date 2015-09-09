package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class PramSetCmd extends TBoxDownBean{
    private Long eventID;
    private Short pramSetNumber;
    private Short pramSetID;
    private Short pramValue;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getPramSetNumber() {
        return pramSetNumber;
    }

    public void setPramSetNumber(Short pramSetNumber) {
        this.pramSetNumber = pramSetNumber;
    }

    public Short getPramSetID() {
        return pramSetID;
    }

    public void setPramSetID(Short pramSetID) {
        this.pramSetID = pramSetID;
    }

    public Short getPramValue() {
        return pramValue;
    }

    public void setPramValue(Short pramValue) {
        this.pramValue = pramValue;
    }
}
