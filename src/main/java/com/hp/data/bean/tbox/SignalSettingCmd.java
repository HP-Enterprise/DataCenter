package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class SignalSettingCmd extends TBoxDownBean{
    private Long eventID;
    private Long realTimeDataValid;
    private Long frequencyForRealTimeReport;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Long getRealTimeDataValid() {
        return realTimeDataValid;
    }

    public void setRealTimeDataValid(long realTimeDataValid) {
        this.realTimeDataValid = realTimeDataValid;
    }

    public Long getFrequencyForRealTimeReport() {
        return frequencyForRealTimeReport;
    }

    public void setFrequencyForRealTimeReport(long frequencyForRealTimeReport) {
        this.frequencyForRealTimeReport = frequencyForRealTimeReport;
    }
}
