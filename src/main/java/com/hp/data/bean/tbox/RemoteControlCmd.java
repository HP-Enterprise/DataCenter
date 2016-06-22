package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RemoteControlCmd extends TBoxDownBean{
    private Long eventID;
    private Integer remoteControlType;
    private Byte remoteStartEngine;
    private byte[] remoteFindCar;//size=4
    private Byte remoteLock;
    private byte[] remoteAc;//size=4
    private byte[] remoteHeating;//size=2

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Integer getRemoteControlType() {
        return remoteControlType;
    }

    public void setRemoteControlType(Integer remoteControlType) {
        this.remoteControlType = remoteControlType;
    }

    public Byte getRemoteStartEngine() {
        return remoteStartEngine;
    }

    public void setRemoteStartEngine(Byte remoteStartEngine) {
        this.remoteStartEngine = remoteStartEngine;
    }

    public byte[] getRemoteFindCar() {
        return remoteFindCar;
    }

    public void setRemoteFindCar(byte[] remoteFindCar) {
        this.remoteFindCar = remoteFindCar;
    }

    public Byte getRemoteLock() {
        return remoteLock;
    }

    public void setRemoteLock(Byte remoteLock) {
        this.remoteLock = remoteLock;
    }

    public byte[] getRemoteAc() {
        return remoteAc;
    }

    public void setRemoteAc(byte[] remoteAc) {
        this.remoteAc = remoteAc;
    }

    public byte[] getRemoteHeating() {
        return remoteHeating;
    }

    public void setRemoteHeating(byte[] remoteHeating) {
        this.remoteHeating = remoteHeating;
    }
}
