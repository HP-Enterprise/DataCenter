package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

/**
 * Created by luj on 2015/10/22.
 */
@DataEntity(key = "8995")
public class RemoteControlPreconditionResp extends TBoxUpBean{
    private Long eventID;
    private Long time;
    private Short ambientAirTemperature;
    private Short fuelLevel;
    private Short tempIntern;
    private Byte sesam_clamp_stat;
    private Byte stat_remote_start;
    private Byte gearLevelPositon;
    private Integer vehicleSpeed;
    private Byte acm_crash_status;
    private byte[] bcm_Stat_Door_Flap;
    private Byte bcm_Stat_Central_Lock;
    private Byte bcm_Stat_window;
    private Byte epb_status;
    private Byte stateOfCharge;
    private Byte sesam_hw_status;
    private Byte tcu_ecu_stat;
    private Byte bcm_Stat_window2;
    private Byte sesam_clamp_stat2;
    private Byte bcm_Stat_Central_Lock2;

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Short getAmbientAirTemperature() {
        return ambientAirTemperature;
    }

    public void setAmbientAirTemperature(Short ambientAirTemperature) {
        this.ambientAirTemperature = ambientAirTemperature;
    }

    public Short getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(Short fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Short getTempIntern() {
        return tempIntern;
    }

    public void setTempIntern(Short tempIntern) {
        this.tempIntern = tempIntern;
    }

    public Byte getSesam_clamp_stat() {
        return sesam_clamp_stat;
    }

    public void setSesam_clamp_stat(Byte sesam_clamp_stat) {
        this.sesam_clamp_stat = sesam_clamp_stat;
    }

    public Byte getStat_remote_start() {
        return stat_remote_start;
    }

    public void setStat_remote_start(Byte stat_remote_start) {
        this.stat_remote_start = stat_remote_start;
    }

    public Byte getGearLevelPositon() {
        return gearLevelPositon;
    }

    public void setGearLevelPositon(Byte gearLevelPositon) {
        this.gearLevelPositon = gearLevelPositon;
    }

    public Integer getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(Integer vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    public Byte getAcm_crash_status() {
        return acm_crash_status;
    }

    public void setAcm_crash_status(Byte acm_crash_status) {
        this.acm_crash_status = acm_crash_status;
    }

    public byte[] getBcm_Stat_Door_Flap() {
        return bcm_Stat_Door_Flap;
    }

    public void setBcm_Stat_Door_Flap(byte[] bcm_Stat_Door_Flap) {
        this.bcm_Stat_Door_Flap = bcm_Stat_Door_Flap;
    }

    public Byte getBcm_Stat_Central_Lock() {
        return bcm_Stat_Central_Lock;
    }

    public void setBcm_Stat_Central_Lock(Byte bcm_Stat_Central_Lock) {
        this.bcm_Stat_Central_Lock = bcm_Stat_Central_Lock;
    }

    public Byte getBcm_Stat_window() {
        return bcm_Stat_window;
    }

    public void setBcm_Stat_window(Byte bcm_Stat_window) {
        this.bcm_Stat_window = bcm_Stat_window;
    }

    public Byte getEpb_status() {
        return epb_status;
    }

    public void setEpb_status(Byte epb_status) {
        this.epb_status = epb_status;
    }

    public Byte getStateOfCharge() {
        return stateOfCharge;
    }

    public void setStateOfCharge(Byte stateOfCharge) {
        this.stateOfCharge = stateOfCharge;
    }

    public Byte getSesam_hw_status() {
        return sesam_hw_status;
    }

    public void setSesam_hw_status(Byte sesam_hw_status) {
        this.sesam_hw_status = sesam_hw_status;
    }

    public Byte getTcu_ecu_stat() {
        return tcu_ecu_stat;
    }

    public void setTcu_ecu_stat(Byte tcu_ecu_stat) {
        this.tcu_ecu_stat = tcu_ecu_stat;
    }

    public Byte getBcm_Stat_window2() {
        return bcm_Stat_window2;
    }

    public void setBcm_Stat_window2(Byte bcm_Stat_window2) {
        this.bcm_Stat_window2 = bcm_Stat_window2;
    }

    public Byte getSesam_clamp_stat2() {
        return sesam_clamp_stat2;
    }

    public void setSesam_clamp_stat2(Byte sesam_clamp_stat2) {
        this.sesam_clamp_stat2 = sesam_clamp_stat2;
    }

    public Byte getBcm_Stat_Central_Lock2() {
        return bcm_Stat_Central_Lock2;
    }

    public void setBcm_Stat_Central_Lock2(Byte bcm_Stat_Central_Lock2) {
        this.bcm_Stat_Central_Lock2 = bcm_Stat_Central_Lock2;
    }
}
