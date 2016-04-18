package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class PramStatusAck extends TBoxUpBean{
    private Long eventID;
    private byte[] pramCmdDataSize;
    private Integer frequencySaveLocalMedia;
    private Integer frequencyForRealTimeReport;
    private Integer frequencyForWarningReport;
    private String hardwareVersion;
    private String softwareVersion;
    private Short frequencyHeartbeat;
    private Integer timeOutForTerminalSearch;
    private Integer timeOutForServerSearch;
    private Short enterpriseDomainNameSize;
    private String enterpriseDomainName;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public byte[] getPramCmdDataSize() {
        return pramCmdDataSize;
    }

    public void setPramCmdDataSize(byte[] pramCmdDataSize) {
        this.pramCmdDataSize = pramCmdDataSize;
    }

    public Integer getFrequencySaveLocalMedia() {
        return frequencySaveLocalMedia;
    }

    public void setFrequencySaveLocalMedia(Integer frequencySaveLocalMedia) {
        this.frequencySaveLocalMedia = frequencySaveLocalMedia;
    }

    public Integer getFrequencyForRealTimeReport() {
        return frequencyForRealTimeReport;
    }

    public void setFrequencyForRealTimeReport(Integer frequencyForRealTimeReport) {
        this.frequencyForRealTimeReport = frequencyForRealTimeReport;
    }

    public Integer getFrequencyForWarningReport() {
        return frequencyForWarningReport;
    }

    public void setFrequencyForWarningReport(Integer frequencyForWarningReport) {
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

    public Integer getTimeOutForTerminalSearch() {
        return timeOutForTerminalSearch;
    }

    public void setTimeOutForTerminalSearch(Integer timeOutForTerminalSearch) {
        this.timeOutForTerminalSearch = timeOutForTerminalSearch;
    }

    public Integer getTimeOutForServerSearch() {
        return timeOutForServerSearch;
    }

    public void setTimeOutForServerSearch(Integer timeOutForServerSearch) {
        this.timeOutForServerSearch = timeOutForServerSearch;
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
