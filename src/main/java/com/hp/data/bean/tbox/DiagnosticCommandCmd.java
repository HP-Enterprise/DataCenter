package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class DiagnosticCommandCmd extends TBoxDownBean{
    private long eventID;
    private short diaCmdDataSize;
    private short diaNumber;
    private short diaID;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public short getDiaCmdDataSize() {
        return diaCmdDataSize;
    }

    public void setDiaCmdDataSize(short diaCmdDataSize) {
        this.diaCmdDataSize = diaCmdDataSize;
    }

    public short getDiaNumber() {
        return diaNumber;
    }

    public void setDiaNumber(short diaNumber) {
        this.diaNumber = diaNumber;
    }

    public short getDiaID() {
        return diaID;
    }

    public void setDiaID(short diaID) {
        this.diaID = diaID;
    }
}
