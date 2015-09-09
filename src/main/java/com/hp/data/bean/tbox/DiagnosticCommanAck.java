package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class DiagnosticCommanAck extends TBoxUpBean{
    private Long eventID;
    private byte[] diaDataSizeAck;
    private byte[] diaNumberAck;
    private Short diaIDAck;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public byte[] getDiaDataSizeAck() {
        return diaDataSizeAck;
    }

    public void setDiaDataSizeAck(byte[] diaDataSizeAck) {
        this.diaDataSizeAck = diaDataSizeAck;
    }

    public byte[] getDiaNumberAck() {
        return diaNumberAck;
    }

    public void setDiaNumberAck(byte[] diaNumberAck) {
        this.diaNumberAck = diaNumberAck;
    }

    public Short getDiaIDAck() {
        return diaIDAck;
    }

    public void setDiaIDAck(Short diaIDAck) {
        this.diaIDAck = diaIDAck;
    }
}
