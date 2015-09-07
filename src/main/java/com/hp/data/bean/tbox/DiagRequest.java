package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class DiagRequest extends TBoxUpBean{
    private Long eventID;
    private Short diagReportDataSize;
    private String serialNumber;
    private Long testTime;
    private Short ledTest;
    private Short framTest;
    private Short sdTest;
    private Short gpsTest;
    private Short gprsTest;
    private Short resetBatteryMapArrayTest;
    private Short canactionTest;
    private Short serverCommTest;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getDiagReportDataSize() {
        return diagReportDataSize;
    }

    public void setDiagReportDataSize(Short diagReportDataSize) {
        this.diagReportDataSize = diagReportDataSize;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Long getTestTime() {
        return testTime;
    }

    public void setTestTime(Long testTime) {
        this.testTime = testTime;
    }

    public Short getLedTest() {
        return ledTest;
    }

    public void setLedTest(Short ledTest) {
        this.ledTest = ledTest;
    }

    public Short getFramTest() {
        return framTest;
    }

    public void setFramTest(Short framTest) {
        this.framTest = framTest;
    }

    public Short getSdTest() {
        return sdTest;
    }

    public void setSdTest(Short sdTest) {
        this.sdTest = sdTest;
    }

    public Short getGpsTest() {
        return gpsTest;
    }

    public void setGpsTest(Short gpsTest) {
        this.gpsTest = gpsTest;
    }

    public Short getGprsTest() {
        return gprsTest;
    }

    public void setGprsTest(Short gprsTest) {
        this.gprsTest = gprsTest;
    }

    public Short getResetBatteryMapArrayTest() {
        return resetBatteryMapArrayTest;
    }

    public void setResetBatteryMapArrayTest(Short resetBatteryMapArrayTest) {
        this.resetBatteryMapArrayTest = resetBatteryMapArrayTest;
    }

    public Short getCanactionTest() {
        return canactionTest;
    }

    public void setCanactionTest(Short canactionTest) {
        this.canactionTest = canactionTest;
    }

    public Short getServerCommTest() {
        return serverCommTest;
    }

    public void setServerCommTest(Short serverCommTest) {
        this.serverCommTest = serverCommTest;
    }
}
