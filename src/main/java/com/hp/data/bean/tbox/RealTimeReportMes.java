package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class RealTimeReportMes extends TBoxUpBean{
    private Short isLocation;
    private Long latitude;
    private Long longitude;
    private Integer speed;
    private Integer heading;
    private Short fuelOil;
    private Integer avgOilA;
    private Integer avgOilB;
    private Integer serviceIntervall;
    private Short leftFrontTirePressure;
    private Short leftRearTirePressure;
    private Short rightFrontTirePressure;
    private Short rightRearTirePressure;
    private Short windowInformation;
    private Short vehicleTemperature;
    private Short vehicleOuterTemperature;
    private Short doorInformation;
    private byte[] kilometerMileage;
    private Byte bonnetAndTrunk;
    private Byte statWindow;
    private Byte averageSpeedA;
    private Byte averageSpeedB;
    private Byte sesam_clamp_stat;
    private Byte bcm_light;
    private Byte tcu_ecu_stat;
    private Byte bcm_stat_central_Lock;
    private Byte acm_crash_status;
    private Integer drivingRange;


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

    public Short getFuelOil() {
        return fuelOil;
    }

    public void setFuelOil(Short fuelOil) {
        this.fuelOil = fuelOil;
    }

    public byte[] getKilometerMileage() {
        return kilometerMileage;
    }

    public void setKilometerMileage(byte[] kilometerMileage) {
        this.kilometerMileage = kilometerMileage;
    }

    public Integer getAvgOilA() {
        return avgOilA;
    }

    public void setAvgOilA(Integer avgOilA) {
        this.avgOilA = avgOilA;
    }

    public Integer getAvgOilB() {
        return avgOilB;
    }

    public void setAvgOilB(Integer avgOilB) {
        this.avgOilB = avgOilB;
    }

    public Integer getServiceIntervall() {
        return serviceIntervall;
    }

    public void setServiceIntervall(Integer serviceIntervall) {
        this.serviceIntervall = serviceIntervall;
    }

    public Short getLeftFrontTirePressure() {
        return leftFrontTirePressure;
    }

    public void setLeftFrontTirePressure(Short leftFrontTirePressure) {
        this.leftFrontTirePressure = leftFrontTirePressure;
    }

    public Short getLeftRearTirePressure() {
        return leftRearTirePressure;
    }

    public void setLeftRearTirePressure(Short leftRearTirePressure) {
        this.leftRearTirePressure = leftRearTirePressure;
    }

    public Short getRightFrontTirePressure() {
        return rightFrontTirePressure;
    }

    public void setRightFrontTirePressure(Short rightFrontTirePressure) {
        this.rightFrontTirePressure = rightFrontTirePressure;
    }

    public Short getRightRearTirePressure() {
        return rightRearTirePressure;
    }

    public void setRightRearTirePressure(Short rightRearTirePressure) {
        this.rightRearTirePressure = rightRearTirePressure;
    }

    public Short getWindowInformation() {
        return windowInformation;
    }

    public void setWindowInformation(Short windowInformation) {
        this.windowInformation = windowInformation;
    }

    public Short getVehicleTemperature() {
        return vehicleTemperature;
    }

    public void setVehicleTemperature(Short vehicleTemperature) {
        this.vehicleTemperature = vehicleTemperature;
    }

    public Short getVehicleOuterTemperature() {
        return vehicleOuterTemperature;
    }

    public void setVehicleOuterTemperature(Short vehicleOuterTemperature) {
        this.vehicleOuterTemperature = vehicleOuterTemperature;
    }

    public Short getDoorInformation() {
        return doorInformation;
    }

    public void setDoorInformation(Short doorInformation) {
        this.doorInformation = doorInformation;
    }

    public Byte getBonnetAndTrunk() {
        return bonnetAndTrunk;
    }

    public void setBonnetAndTrunk(Byte bonnetAndTrunk) {
        this.bonnetAndTrunk = bonnetAndTrunk;
    }

    public Byte getStatWindow() {
        return statWindow;
    }

    public void setStatWindow(Byte statWindow) {
        this.statWindow = statWindow;
    }

    public Byte getAverageSpeedA() {
        return averageSpeedA;
    }

    public void setAverageSpeedA(Byte averageSpeedA) {
        this.averageSpeedA = averageSpeedA;
    }

    public Byte getAverageSpeedB() {
        return averageSpeedB;
    }

    public void setAverageSpeedB(Byte averageSpeedB) {
        this.averageSpeedB = averageSpeedB;
    }

    public Byte getSesam_clamp_stat() {
        return sesam_clamp_stat;
    }

    public void setSesam_clamp_stat(Byte sesam_clamp_stat) {
        this.sesam_clamp_stat = sesam_clamp_stat;
    }

    public Byte getBcm_light() {
        return bcm_light;
    }

    public void setBcm_light(Byte bcm_light) {
        this.bcm_light = bcm_light;
    }

    public Byte getTcu_ecu_stat() {
        return tcu_ecu_stat;
    }

    public void setTcu_ecu_stat(Byte tcu_ecu_stat) {
        this.tcu_ecu_stat = tcu_ecu_stat;
    }

    public Byte getBcm_stat_central_Lock() {
        return bcm_stat_central_Lock;
    }

    public void setBcm_stat_central_Lock(Byte bcm_stat_central_Lock) {
        this.bcm_stat_central_Lock = bcm_stat_central_Lock;
    }

    public Byte getAcm_crash_status() {
        return acm_crash_status;
    }

    public void setAcm_crash_status(Byte acm_crash_status) {
        this.acm_crash_status = acm_crash_status;
    }

    public Integer getDrivingRange() {
        return drivingRange;
    }

    public void setDrivingRange(Integer drivingRange) {
        this.drivingRange = drivingRange;
    }
}
