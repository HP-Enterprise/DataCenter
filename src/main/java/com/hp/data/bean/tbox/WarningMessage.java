package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class WarningMessage extends TBoxUpBean{
    private Short isLocation;
    private Long latitude;
    private Long longitude;
    private Long speed;
    private Long heading;
    private Short bcm1;
    private Short ems;
    private Short tcu;
    private Short ic;
    private Short abs;
    private Short pdc;
    private Short bcm2;

    public Short getBcm1() {
        return bcm1;
    }

    public void setBcm1(short bcm1) {
        this.bcm1 = bcm1;
    }

    public Short getEms() {
        return ems;
    }

    public void setEms(short ems) {
        this.ems = ems;
    }

    public Short getTcu() {
        return tcu;
    }

    public void setTcu(short tcu) {
        this.tcu = tcu;
    }

    public Short getIc() {
        return ic;
    }

    public void setIc(short ic) {
        this.ic = ic;
    }

    public Short getAbs() {
        return abs;
    }

    public void setAbs(short abs) {
        this.abs = abs;
    }

    public Short getPdc() {
        return pdc;
    }

    public void setPdc(short pdc) {
        this.pdc = pdc;
    }

    public Short getBcm2() {
        return bcm2;
    }

    public void setBcm2(short bcm2) {
        this.bcm2 = bcm2;
    }

    public Short getIsLocation() {
        return isLocation;
    }

    public void setIsLocation(short isLocation) {
        this.isLocation = isLocation;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public Long getHeading() {
        return heading;
    }

    public void setHeading(long heading) {
        this.heading = heading;
    }
   }
