package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class DiagnosticCommanAck extends TBoxUpBean{
    private Long eventID;
    private Short diaDataSizeAck;
    private Short diaNumberAck;
    private Short diaIDAck;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getDiaDataSizeAck() {
        return diaDataSizeAck;
    }

    public void setDiaDataSizeAck(short diaDataSizeAck) {
        this.diaDataSizeAck = diaDataSizeAck;
    }

    public Short getDiaNumberAck() {
        return diaNumberAck;
    }

    public void setDiaNumberAck(short diaNumberAck) {
        this.diaNumberAck = diaNumberAck;
    }

    public Short getDiaIDAck() {
        return diaIDAck;
    }

    public void setDiaIDAck(short diaIDAck) {
        this.diaIDAck = diaIDAck;
    }
}
