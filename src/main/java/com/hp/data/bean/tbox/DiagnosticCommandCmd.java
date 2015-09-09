package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class DiagnosticCommandCmd extends TBoxDownBean{
    private Long eventID;
    private byte[] diaCmdDataSize;
    private byte[] diaNumber;
    private Short diaID;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public byte[] getDiaCmdDataSize() {
        return diaCmdDataSize;
    }

    public void setDiaCmdDataSize(byte[] diaCmdDataSize) {
        this.diaCmdDataSize = diaCmdDataSize;
    }

    public byte[] getDiaNumber() {
        return diaNumber;
    }

    public void setDiaNumber(byte[] diaNumber) {
        this.diaNumber = diaNumber;
    }

    public Short getDiaID() {
        return diaID;
    }

    public void setDiaID(Short diaID) {
        this.diaID = diaID;
    }
}
