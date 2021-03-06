package com.hp.data.bean.tbox;
import com.hp.data.core.DataEntity;

/**
 * Created by luj on 2015/10/20.
 */
@DataEntity(key = "8995")
public class DataResendWarningMes extends TBoxUpBean{
    private Long eventID;
    private Short isLocation;
    private Long latitude;
    private Long longitude;
    private Integer speed;
    private Integer heading;
    private Byte srsWarning;
    private Byte crashWarning;
    private Byte ataWarning;
    private Short safetyBeltCount;
    private Integer[]  vehicleSpeedLast;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

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

    public Byte getSrsWarning() {
        return srsWarning;
    }

    public void setSrsWarning(Byte srsWarning) {
        this.srsWarning = srsWarning;
    }

    public Byte getCrashWarning() {
        return crashWarning;
    }

    public void setCrashWarning(Byte crashWarning) {
        this.crashWarning = crashWarning;
    }

    public Byte getAtaWarning() {
        return ataWarning;
    }

    public void setAtaWarning(Byte ataWarning) {
        this.ataWarning = ataWarning;
    }

    public Integer[] getVehicleSpeedLast() {
        return vehicleSpeedLast;
    }

    public void setVehicleSpeedLast(Integer[] vehicleSpeedLast) {
        this.vehicleSpeedLast = vehicleSpeedLast;
    }

    public Short getSafetyBeltCount() {
        return safetyBeltCount;
    }

    public void setSafetyBeltCount(Short safetyBeltCount) {
        this.safetyBeltCount = safetyBeltCount;
    }
}

