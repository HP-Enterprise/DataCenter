package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class DiagResp extends TBoxDownBean{
    private long eventID;
    private Short diagReportResp;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getDiagReportResp() {
        return diagReportResp;
    }

    public void setDiagReportResp(Short diagReportResp) {
        this.diagReportResp = diagReportResp;
    }
}
