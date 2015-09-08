package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramSetCmd extends TBoxDownBean{
    private long eventID;
    private short pramSetNumber;
    private short pramSetID;
    private short pramValue;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public short getPramSetNumber() {
        return pramSetNumber;
    }

    public void setPramSetNumber(short pramSetNumber) {
        this.pramSetNumber = pramSetNumber;
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
