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

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getDiaDataSizeAck() {
        return diaDataSizeAck;
    }

    public void setDiaDataSizeAck(Short diaDataSizeAck) {
        this.diaDataSizeAck = diaDataSizeAck;
    }

    public Short getDiaNumberAck() {
        return diaNumberAck;
    }

    public void setDiaNumberAck(Short diaNumberAck) {
        this.diaNumberAck = diaNumberAck;
    }

    public Short getDiaIDAck() {
        return diaIDAck;
    }

    public void setDiaIDAck(Short diaIDAck) {
        this.diaIDAck = diaIDAck;
    }
}
