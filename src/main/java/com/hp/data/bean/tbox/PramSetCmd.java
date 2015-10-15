package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class PramSetCmd extends TBoxDownBean{
    private Long eventID;
    private Short pramSetNumber;
    private byte[] pramSetID;
    private int frequencySaveLocalMedia;
    private int frequencyForReport;
    private int frequencyForWarningReport;
    private Short frequencyHeartbeat;
    private int timeOutForTerminalSearch;
    private int timeOutForServerSearch;
    private Short uploadType;
    private byte[] enterpriseBroadcastAddress1;
    private int enterpriseBroadcastPort1;
    private byte[] enterpriseBroadcastAddress2;
    private int enterpriseBroadcastPort2;
    private Short enterpriseDomainNameSize;
    private String enterpriseDomainName;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getPramSetNumber() {
        return pramSetNumber;
    }

    public void setPramSetNumber(Short pramSetNumber) {
        this.pramSetNumber = pramSetNumber;
    }

    public byte[] getPramSetID() {
        return pramSetID;
    }

    public void setPramSetID(byte[] pramSetID) {
        this.pramSetID = pramSetID;
    }

    public int getFrequencySaveLocalMedia() {
        return frequencySaveLocalMedia;
    }

    public void setFrequencySaveLocalMedia(int frequencySaveLocalMedia) {
        this.frequencySaveLocalMedia = frequencySaveLocalMedia;
    }

    public int getFrequencyForReport() {
        return frequencyForReport;
    }

    public void setFrequencyForReport(int frequencyForReport) {
        this.frequencyForReport = frequencyForReport;
    }

    public int getFrequencyForWarningReport() {
        return frequencyForWarningReport;
    }

    public void setFrequencyForWarningReport(int frequencyForWarningReport) {
        this.frequencyForWarningReport = frequencyForWarningReport;
    }

    public Short getFrequencyHeartbeat() {
        return frequencyHeartbeat;
    }

    public void setFrequencyHeartbeat(Short frequencyHeartbeat) {
        this.frequencyHeartbeat = frequencyHeartbeat;
    }

    public int getTimeOutForTerminalSearch() {
        return timeOutForTerminalSearch;
    }

    public void setTimeOutForTerminalSearch(int timeOutForTerminalSearch) {
        this.timeOutForTerminalSearch = timeOutForTerminalSearch;
    }

    public int getTimeOutForServerSearch() {
        return timeOutForServerSearch;
    }

    public void setTimeOutForServerSearch(int timeOutForServerSearch) {
        this.timeOutForServerSearch = timeOutForServerSearch;
    }

    public Short getUploadType() {
        return uploadType;
    }

    public void setUploadType(Short uploadType) {
        this.uploadType = uploadType;
    }

    public byte[] getEnterpriseBroadcastAddress1() {
        return enterpriseBroadcastAddress1;
    }

    public void setEnterpriseBroadcastAddress1(byte[] enterpriseBroadcastAddress1) {
        this.enterpriseBroadcastAddress1 = enterpriseBroadcastAddress1;
    }

    public int getEnterpriseBroadcastPort1() {
        return enterpriseBroadcastPort1;
    }

    public void setEnterpriseBroadcastPort1(int enterpriseBroadcastPort1) {
        this.enterpriseBroadcastPort1 = enterpriseBroadcastPort1;
    }

    public byte[] getEnterpriseBroadcastAddress2() {
        return enterpriseBroadcastAddress2;
    }

    public void setEnterpriseBroadcastAddress2(byte[] enterpriseBroadcastAddress2) {
        this.enterpriseBroadcastAddress2 = enterpriseBroadcastAddress2;
    }

    public int getEnterpriseBroadcastPort2() {
        return enterpriseBroadcastPort2;
    }

    public void setEnterpriseBroadcastPort2(int enterpriseBroadcastPort2) {
        this.enterpriseBroadcastPort2 = enterpriseBroadcastPort2;
    }

    public Short getEnterpriseDomainNameSize() {
        return enterpriseDomainNameSize;
    }

    public void setEnterpriseDomainNameSize(Short enterpriseDomainNameSize) {
        this.enterpriseDomainNameSize = enterpriseDomainNameSize;
    }

    public String getEnterpriseDomainName() {
        return enterpriseDomainName;
    }

    public void setEnterpriseDomainName(String enterpriseDomainName) {
        this.enterpriseDomainName = enterpriseDomainName;
    }
}
