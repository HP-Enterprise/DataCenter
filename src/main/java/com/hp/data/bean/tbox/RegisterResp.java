package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RegisterResp extends TBoxDownBean{
    private Long eventID;
    private Short registerResult;
    private Long totalSize;//总流量
    private Long usedSize;//已使用流量
    private byte[] keyInfo;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getRegisterResult() {
        return registerResult;
    }

    public void setRegisterResult(Short registerResult) {
        this.registerResult = registerResult;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public Long getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
    }

    public byte[] getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(byte[] keyInfo) {
        this.keyInfo = keyInfo;
    }
}
