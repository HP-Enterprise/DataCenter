package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class WarningMessage extends TBoxUpBean{
    private Short isLocation;
    private Long latitude;
    private Long longitude;
    private Integer speed;
    private Integer heading;
    private Byte bcm1;
    private Byte ems;
    private Byte tcu;
    private Byte ic;
    private Byte abs;
    private Byte pdc;
    private Byte bcm2;

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

    public Byte getBcm1() {
        return bcm1;
    }

    public void setBcm1(Byte bcm1) {
        this.bcm1 = bcm1;
    }

    public Byte getEms() {
        return ems;
    }

    public void setEms(Byte ems) {
        this.ems = ems;
    }

    public Byte getTcu() {
        return tcu;
    }

    public void setTcu(Byte tcu) {
        this.tcu = tcu;
    }

    public Byte getIc() {
        return ic;
    }

    public void setIc(Byte ic) {
        this.ic = ic;
    }

    public Byte getAbs() {
        return abs;
    }

    public void setAbs(Byte abs) {
        this.abs = abs;
    }

    public Byte getPdc() {
        return pdc;
    }

    public void setPdc(Byte pdc) {
        this.pdc = pdc;
    }

    public Byte getBcm2() {
        return bcm2;
    }

    public void setBcm2(Byte bcm2) {
        this.bcm2 = bcm2;
    }
}
