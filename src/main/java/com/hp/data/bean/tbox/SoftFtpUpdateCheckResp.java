package com.hp.data.bean.tbox;

public class SoftFtpUpdateCheckResp extends TBoxDownBean{
    private Long eventID;
    private Short model;
    private String appVersion;
    private String fileName;
    private Short isUpdate;
    private String url;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Short getModel() {
        return model;
    }

    public void setModel(Short model) {
        this.model = model;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Short getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Short isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
