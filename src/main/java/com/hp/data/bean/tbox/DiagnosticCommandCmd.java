package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class DiagnosticCommandCmd extends TBoxDownBean{
    private Long eventID;
    private Short diaCmdDataSize;
    private Short diaNumber;
    private Short diaID;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getDiaCmdDataSize() {
        return diaCmdDataSize;
    }

    public void setDiaCmdDataSize(short diaCmdDataSize) {
        this.diaCmdDataSize = diaCmdDataSize;
    }

    public Short getDiaNumber() {
        return diaNumber;
    }

    public void setDiaNumber(short diaNumber) {
        this.diaNumber = diaNumber;
    }

    public Short getDiaID() {
        return diaID;
    }

    public void setDiaID(short diaID) {
        this.diaID = diaID;
    }
}
