package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class DiaResp extends TBoxDownBean{
    private long eventID;
    private Short diaReportResp;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getDiagReportResp() {
        return diaReportResp;
    }

    public void setDiagReportResp(Short diagReportResp) {
        this.diaReportResp = diagReportResp;
    }
}
