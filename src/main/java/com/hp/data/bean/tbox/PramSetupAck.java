package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramSetupAck extends TBoxUpBean{
    private Long eventID;
    private Short pramSetAck;
    private Short pramSetID;
    private Short pramValue;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public short getPramSetAck() {
        return pramSetAck;
    }

    public void setPramSetAck(short pramSetAck) {
        this.pramSetAck = pramSetAck;
    }

    public short getPramSetID() {
        return pramSetID;
    }

    public void setPramSetID(short pramSetID) {
        this.pramSetID = pramSetID;
    }

    public short getPramValue() {
        return pramValue;
    }

    public void setPramValue(short pramValue) {
        this.pramValue = pramValue;
    }
}
