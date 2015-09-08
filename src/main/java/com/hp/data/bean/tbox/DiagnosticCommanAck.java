package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class DiagnosticCommanAck extends TBoxUpBean{
    private long eventID;
    private short diaDataSizeAck;
    private short diaNumberAck;
    private short diaIDAck;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public short getDiaDataSizeAck() {
        return diaDataSizeAck;
    }

    public void setDiaDataSizeAck(short diaDataSizeAck) {
        this.diaDataSizeAck = diaDataSizeAck;
    }

    public short getDiaNumberAck() {
        return diaNumberAck;
    }

    public void setDiaNumberAck(short diaNumberAck) {
        this.diaNumberAck = diaNumberAck;
    }

    public short getDiaIDAck() {
        return diaIDAck;
    }

    public void setDiaIDAck(short diaIDAck) {
        this.diaIDAck = diaIDAck;
    }
}
