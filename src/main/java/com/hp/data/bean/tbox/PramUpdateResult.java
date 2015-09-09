package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramUpdateResult extends TBoxUpBean{
    private Long eventID;
    private Short pramUpdateResult;
    private Long packetNumber;
    private Long backPacketNumber;
    private Short responseStatus;
    private Short check;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public Short getPramUpdateResult() {
        return pramUpdateResult;
    }

    public void setPramUpdateResult(short pramUpdateResult) {
        this.pramUpdateResult = pramUpdateResult;
    }

    public Long getPacketNumber() {
        return packetNumber;
    }

    public void setPacketNumber(long packetNumber) {
        this.packetNumber = packetNumber;
    }

    public Long getBackPacketNumber() {
        return backPacketNumber;
    }

    public void setBackPacketNumber(long backPacketNumber) {
        this.backPacketNumber = backPacketNumber;
    }

    public Short getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(short responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Short getCheck() {
        return check;
    }

    public void setCheck(short check) {
        this.check = check;
    }
}
