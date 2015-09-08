package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramSetupAck extends TBoxUpBean{
    private Long eventID;
    private Short pramSetAck;
    private Short pramSetID;
    private Short pramValue;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getPramSetAck() {
        return pramSetAck;
    }

    public void setPramSetAck(Short pramSetAck) {
        this.pramSetAck = pramSetAck;
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
