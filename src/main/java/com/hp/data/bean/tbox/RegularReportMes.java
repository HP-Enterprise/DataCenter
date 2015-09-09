package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RegularReportMes extends TBoxUpBean{
    private Long frequencyForRealTimeReport;
    private Long frequencyForWarningReport;
    private Short frequencyHeartbeat;
    private Long timeOutForTerminalSearch;
    private Long timeOutForServerSearch;
    private Short vehicleType;
    private Long vehicleModels;
    private Short maxSpeed;
    private String hardwareVersion;
    private String softwareVersion;
    private Long frequencySaveLocalMedia;
    private Short enterpriseBroadcastAddress;
    private Long enterpriseBroadcastPort;

    public Long getFrequencyForRealTimeReport() {
        return frequencyForRealTimeReport;
    }

    public void setFrequencyForRealTimeReport(long frequencyForRealTimeReport) {
        this.frequencyForRealTimeReport = frequencyForRealTimeReport;
    }

    public Long getFrequencyForWarningReport() {
        return frequencyForWarningReport;
    }

    public void setFrequencyForWarningReport(long frequencyForWarningReport) {
        this.frequencyForWarningReport = frequencyForWarningReport;
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

    public void setTimeOutForTerminalSearch(long timeOutForTerminalSearch) {
        this.timeOutForTerminalSearch = timeOutForTerminalSearch;
    }

    public Long getTimeOutForServerSearch() {
        return timeOutForServerSearch;
    }

    public void setTimeOutForServerSearch(long timeOutForServerSearch) {
        this.timeOutForServerSearch = timeOutForServerSearch;
    }

    public Short getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(short vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Long getVehicleModels() {
        return vehicleModels;
    }

    public void setVehicleModels(long vehicleModels) {
        this.vehicleModels = vehicleModels;
    }

    public Short getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(short maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public Long getFrequencySaveLocalMedia() {
        return frequencySaveLocalMedia;
    }

    public void setFrequencySaveLocalMedia(long frequencySaveLocalMedia) {
        this.frequencySaveLocalMedia = frequencySaveLocalMedia;
    }

    public Short getEnterpriseBroadcastAddress() {
        return enterpriseBroadcastAddress;
    }

    public void setEnterpriseBroadcastAddress(short enterpriseBroadcastAddress) {
        this.enterpriseBroadcastAddress = enterpriseBroadcastAddress;
    }

    public Long getEnterpriseBroadcastPort() {
        return enterpriseBroadcastPort;
    }

    public void setEnterpriseBroadcastPort(long enterpriseBroadcastPort) {
        this.enterpriseBroadcastPort = enterpriseBroadcastPort;
    }
}
