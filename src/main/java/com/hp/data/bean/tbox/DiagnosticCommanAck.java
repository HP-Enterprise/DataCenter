package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class DiagnosticCommanAck extends TBoxUpBean{
    private Long eventID;
    private int diagData;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public int getDiagData() {
        return diagData;
    }

    public void setDiagData(int diagData) {
        this.diagData = diagData;
    }
}
