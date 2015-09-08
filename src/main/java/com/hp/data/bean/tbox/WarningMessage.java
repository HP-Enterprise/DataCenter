package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class WarningMessage extends TBoxUpBean{
    private Short isLocation;
    private Long latitude;
    private Long longitude;
    private Integer speed;
    private Integer heading;
    private byte[] bcm1;
    private byte[] ems;
    private byte[] tcu;
    private byte[] ic;
    private byte[] abs;
    private byte[] pdc;
    private byte[] bcm2;

    public Short getIsLocation() {
        return isLocation;
    }

    public void setIsLocation(Short isLocation) {
        this.isLocation = isLocation;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getHeading() {
        return heading;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    public byte[] getBcm1() {
        return bcm1;
    }

    public void setBcm1(byte[] bcm1) {
        this.bcm1 = bcm1;
    }

    public byte[] getEms() {
        return ems;
    }

    public void setEms(byte[] ems) {
        this.ems = ems;
    }

    public byte[] getTcu() {
        return tcu;
    }

    public void setTcu(byte[] tcu) {
        this.tcu = tcu;
    }

    public byte[] getIc() {
        return ic;
    }

    public void setIc(byte[] ic) {
        this.ic = ic;
    }

    public byte[] getAbs() {
        return abs;
    }

    public void setAbs(byte[] abs) {
        this.abs = abs;
    }

    public byte[] getPdc() {
        return pdc;
    }

    public void setPdc(byte[] pdc) {
        this.pdc = pdc;
    }

    public byte[] getBcm2() {
        return bcm2;
    }

    public void setBcm2(byte[] bcm2) {
        this.bcm2 = bcm2;
    }
}
