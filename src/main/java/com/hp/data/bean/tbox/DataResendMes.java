package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class DataResendMes extends TBoxUpBean{
    private Short isLocation;
    private Long latitude;
    private Long longitude;
    private Integer speed;
    private Integer heading;
    private Short fuelOil;
    private Integer avgOil;
    private Short oilLife;
    private byte[] driveRange;
    private Integer leftFrontTirePressure;
    private Integer leftRearTirePressure;
    private Integer rightFrontTirePressure;
    private Integer rightRearTirePressure;
    private Short windowInformation;
    private Short vehicleTemperature;
    private Short vehicleOuterTemperature;
    private Short doorInformation;
    private Integer singleBatteryVoltage;
    private Short maximumVoltagePowerBatteryPack;
    private Integer maximumBatteryVoltage;
    private Integer batteryMonomerMinimumVoltage;
    private Short engineCondition;
    private Integer engineSpeed;
    private Integer rapidAcceleration;
    private Integer rapidDeceleration;
    private Integer speeding;
    private Short signalStrength;
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

    public Short getFuelOil() {
        return fuelOil;
    }

    public void setFuelOil(Short fuelOil) {
        this.fuelOil = fuelOil;
    }

    public Integer getAvgOil() {
        return avgOil;
    }

    public void setAvgOil(Integer avgOil) {
        this.avgOil = avgOil;
    }

    public Short getOilLife() {
        return oilLife;
    }

    public void setOilLife(Short oilLife) {
        this.oilLife = oilLife;
    }

    public byte[] getDriveRange() {
        return driveRange;
    }

    public void setDriveRange(byte[] driveRange) {
        this.driveRange = driveRange;
    }

    public Integer getLeftFrontTirePressure() {
        return leftFrontTirePressure;
    }

    public void setLeftFrontTirePressure(Integer leftFrontTirePressure) {
        this.leftFrontTirePressure = leftFrontTirePressure;
    }

    public Integer getLeftRearTirePressure() {
        return leftRearTirePressure;
    }

    public void setLeftRearTirePressure(Integer leftRearTirePressure) {
        this.leftRearTirePressure = leftRearTirePressure;
    }

    public Integer getRightFrontTirePressure() {
        return rightFrontTirePressure;
    }

    public void setRightFrontTirePressure(Integer rightFrontTirePressure) {
        this.rightFrontTirePressure = rightFrontTirePressure;
    }

    public Integer getRightRearTirePressure() {
        return rightRearTirePressure;
    }

    public void setRightRearTirePressure(Integer rightRearTirePressure) {
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

    public Integer getSingleBatteryVoltage() {
        return singleBatteryVoltage;
    }

    public void setSingleBatteryVoltage(Integer singleBatteryVoltage) {
        this.singleBatteryVoltage = singleBatteryVoltage;
    }

    public Short getMaximumVoltagePowerBatteryPack() {
        return maximumVoltagePowerBatteryPack;
    }

    public void setMaximumVoltagePowerBatteryPack(Short maximumVoltagePowerBatteryPack) {
        this.maximumVoltagePowerBatteryPack = maximumVoltagePowerBatteryPack;
    }

    public Integer getMaximumBatteryVoltage() {
        return maximumBatteryVoltage;
    }

    public void setMaximumBatteryVoltage(Integer maximumBatteryVoltage) {
        this.maximumBatteryVoltage = maximumBatteryVoltage;
    }

    public Integer getBatteryMonomerMinimumVoltage() {
        return batteryMonomerMinimumVoltage;
    }

    public void setBatteryMonomerMinimumVoltage(Integer batteryMonomerMinimumVoltage) {
        this.batteryMonomerMinimumVoltage = batteryMonomerMinimumVoltage;
    }

    public Short getEngineCondition() {
        return engineCondition;
    }

    public void setEngineCondition(Short engineCondition) {
        this.engineCondition = engineCondition;
    }

    public Integer getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(Integer engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public Integer getRapidAcceleration() {
        return rapidAcceleration;
    }

    public void setRapidAcceleration(Integer rapidAcceleration) {
        this.rapidAcceleration = rapidAcceleration;
    }

    public Integer getRapidDeceleration() {
        return rapidDeceleration;
    }

    public void setRapidDeceleration(Integer rapidDeceleration) {
        this.rapidDeceleration = rapidDeceleration;
    }

    public Integer getSpeeding() {
        return speeding;
    }

    public void setSpeeding(Integer speeding) {
        this.speeding = speeding;
    }

    public Short getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(Short signalStrength) {
        this.signalStrength = signalStrength;
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
