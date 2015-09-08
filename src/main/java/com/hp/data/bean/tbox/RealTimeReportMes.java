package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class RealTimeReportMes extends TBoxUpBean{
    private Short isLocation;
    private Long latitude;
    private Long longitude;
    private Long speed;
    private Long heading;
    private Short fuelOil;
    private Long avgOil;
    private Short oilLife;
    private Short driveRange;
    private Long leftFrontTirePressure;
    private Long leftRearTirePressure;
    private Long rightFrontTirePressure;
    private Long rightRearTirePressure;
    private Short windowInformation;
    private Short vehicleTemperature;
    private Short vehicleOuterTemperature;
    private Short doorInformation;
    private Long singleBatteryVoltage;
    private Short maximumVoltagePowerBatteryPack;
    private Long maximumBatteryVoltage;
    private Long batteryMonomerMinimumVoltage;
    private Short engineCondition;
    private Long engineSpeed;
    private Long rapidAcceleration;
    private Long rapidDeceleration;
    private Long speeding;
    private Short signalStrength;

    public short getIsLocation() {
        return isLocation;
    }

    public void setIsLocation(short isLocation) {
        this.isLocation = isLocation;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getHeading() {
        return heading;
    }

    public void setHeading(long heading) {
        this.heading = heading;
    }

    public short getFuelOil() {
        return fuelOil;
    }

    public void setFuelOil(short fuelOil) {
        this.fuelOil = fuelOil;
    }

    public long getAvgOil() {
        return avgOil;
    }

    public void setAvgOil(long avgOil) {
        this.avgOil = avgOil;
    }

    public short getOilLife() {
        return oilLife;
    }

    public void setOilLife(short oilLife) {
        this.oilLife = oilLife;
    }

    public short getDriveRange() {
        return driveRange;
    }

    public void setDriveRange(short driveRange) {
        this.driveRange = driveRange;
    }

    public long getLeftFrontTirePressure() {
        return leftFrontTirePressure;
    }

    public void setLeftFrontTirePressure(long leftFrontTirePressure) {
        this.leftFrontTirePressure = leftFrontTirePressure;
    }

    public long getLeftRearTirePressure() {
        return leftRearTirePressure;
    }

    public void setLeftRearTirePressure(long leftRearTirePressure) {
        this.leftRearTirePressure = leftRearTirePressure;
    }

    public long getRightFrontTirePressure() {
        return rightFrontTirePressure;
    }

    public void setRightFrontTirePressure(long rightFrontTirePressure) {
        this.rightFrontTirePressure = rightFrontTirePressure;
    }

    public long getRightRearTirePressure() {
        return rightRearTirePressure;
    }

    public void setRightRearTirePressure(long rightRearTirePressure) {
        this.rightRearTirePressure = rightRearTirePressure;
    }

    public short getWindowInformation() {
        return windowInformation;
    }

    public void setWindowInformation(short windowInformation) {
        this.windowInformation = windowInformation;
    }

    public short getVehicleTemperature() {
        return vehicleTemperature;
    }

    public void setVehicleTemperature(short vehicleTemperature) {
        this.vehicleTemperature = vehicleTemperature;
    }

    public short getVehicleOuterTemperature() {
        return vehicleOuterTemperature;
    }

    public void setVehicleOuterTemperature(short vehicleOuterTemperature) {
        this.vehicleOuterTemperature = vehicleOuterTemperature;
    }

    public short getDoorInformation() {
        return doorInformation;
    }

    public void setDoorInformation(short doorInformation) {
        this.doorInformation = doorInformation;
    }

    public long getSingleBatteryVoltage() {
        return singleBatteryVoltage;
    }

    public void setSingleBatteryVoltage(long singleBatteryVoltage) {
        this.singleBatteryVoltage = singleBatteryVoltage;
    }

    public short getMaximumVoltagePowerBatteryPack() {
        return maximumVoltagePowerBatteryPack;
    }

    public void setMaximumVoltagePowerBatteryPack(short maximumVoltagePowerBatteryPack) {
        this.maximumVoltagePowerBatteryPack = maximumVoltagePowerBatteryPack;
    }

    public long getMaximumBatteryVoltage() {
        return maximumBatteryVoltage;
    }

    public void setMaximumBatteryVoltage(long maximumBatteryVoltage) {
        this.maximumBatteryVoltage = maximumBatteryVoltage;
    }

    public long getBatteryMonomerMinimumVoltage() {
        return batteryMonomerMinimumVoltage;
    }

    public void setBatteryMonomerMinimumVoltage(long batteryMonomerMinimumVoltage) {
        this.batteryMonomerMinimumVoltage = batteryMonomerMinimumVoltage;
    }

    public short getEngineCondition() {
        return engineCondition;
    }

    public void setEngineCondition(short engineCondition) {
        this.engineCondition = engineCondition;
    }

    public long getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(long engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public long getRapidAcceleration() {
        return rapidAcceleration;
    }

    public void setRapidAcceleration(long rapidAcceleration) {
        this.rapidAcceleration = rapidAcceleration;
    }

    public long getRapidDeceleration() {
        return rapidDeceleration;
    }

    public void setRapidDeceleration(long rapidDeceleration) {
        this.rapidDeceleration = rapidDeceleration;
    }

    public long getSpeeding() {
        return speeding;
    }

    public void setSpeeding(long speeding) {
        this.speeding = speeding;
    }

    public short getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(short signalStrength) {
        this.signalStrength = signalStrength;
    }
}
