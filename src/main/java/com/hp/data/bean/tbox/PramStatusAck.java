package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class PramStatusAck extends TBoxUpBean{
    private Long eventID;
    private Short pramCmdDataSize;
    private Long frequencySaveLocalMedia;
    private Long frequencyForRealTimeReport;
    private Long frequencyForWarningReport;
    private String hardwareVersion;
    private String softwareVersion;
    private Short frequencyHeartbeat;
    private Long timeOutForTerminalSearch;
    private Long timeOutForServerSearch;
    private Short enterpriseBroadcastAddress;
    private Long enterpriseBroadcastPort;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getPramCmdDataSize() {
        return pramCmdDataSize;
    }

    public void setPramCmdDataSize(Short pramCmdDataSize) {
        this.pramCmdDataSize = pramCmdDataSize;
    }

    public Long getFrequencySaveLocalMedia() {
        return frequencySaveLocalMedia;
    }

    public void setFrequencySaveLocalMedia(Long frequencySaveLocalMedia) {
        this.frequencySaveLocalMedia = frequencySaveLocalMedia;
    }

    public Long getFrequencyForRealTimeReport() {
        return frequencyForRealTimeReport;
    }

    public void setFrequencyForRealTimeReport(Long frequencyForRealTimeReport) {
        this.frequencyForRealTimeReport = frequencyForRealTimeReport;
    }

    public Long getFrequencyForWarningReport() {
        return frequencyForWarningReport;
    }

    public void setFrequencyForWarningReport(Long frequencyForWarningReport) {
        this.frequencyForWarningReport = frequencyForWarningReport;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Short getFrequencyHeartbeat() {
        return frequencyHeartbeat;
    }

    public void setFrequencyHeartbeat(Short frequencyHeartbeat) {
        this.frequencyHeartbeat = frequencyHeartbeat;
    }

    public Long getTimeOutForTerminalSearch() {
        return timeOutForTerminalSearch;
    }

    public void setTimeOutForTerminalSearch(Long timeOutForTerminalSearch) {
        this.timeOutForTerminalSearch = timeOutForTerminalSearch;
    }

    public Long getTimeOutForServerSearch() {
        return timeOutForServerSearch;
    }

    public void setTimeOutForServerSearch(Long timeOutForServerSearch) {
        this.timeOutForServerSearch = timeOutForServerSearch;
    }

    public Short getEnterpriseBroadcastAddress() {
        return enterpriseBroadcastAddress;
    }

    public void setEnterpriseBroadcastAddress(Short enterpriseBroadcastAddress) {
        this.enterpriseBroadcastAddress = enterpriseBroadcastAddress;
    }

    public Long getEnterpriseBroadcastPort() {
        return enterpriseBroadcastPort;
    }

    public void setEnterpriseBroadcastPort(Long enterpriseBroadcastPort) {
        this.enterpriseBroadcastPort = enterpriseBroadcastPort;
    }
}
