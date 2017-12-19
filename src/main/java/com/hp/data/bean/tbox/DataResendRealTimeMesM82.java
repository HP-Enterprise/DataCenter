package com.hp.data.bean.tbox;

import io.netty.buffer.ByteBuf;

public class DataResendRealTimeMesM82 extends TBoxUpBean{
    private Long eventID;
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
    private Integer windowInformation;
    private Short vehicleTemperature;
    private Short vehicleOuterTemperature;
    private Short doorInformation;
    private byte[] kilometerMileage;
    private Byte bonnetAndTrunk;
    private Byte statWindow;
    private Integer averageSpeedA;
    private Integer averageSpeedB;
    private Byte sesam_clamp_stat;
    private Byte bcm_light;
    private Byte tcu_ecu_stat;
    private Byte bcm_stat_central_Lock;
    private Byte acm_crash_status;
    private Integer drivingRange;
    private Integer voltage;
    private Byte mt_gear_position;
    private Short engineState;
    private Byte doorLockState;
    private Byte blowState;
    private Byte acState;

    /**
     * 解码
     * @param bb
     * @return
     */
    public DataResendRealTimeMesM82 decode(ByteBuf bb){
        DataResendRealTimeMesM82 entity = new DataResendRealTimeMesM82();
        entity.setHead(bb.readUnsignedShort());
        entity.setLength(bb.readUnsignedShort());
        entity.setTestFlag(bb.readUnsignedByte());
        entity.setSendingTime(bb.readUnsignedInt());
        entity.setApplicationID(bb.readUnsignedByte());
        entity.setMessageID(bb.readUnsignedByte());
        byte[] imei = getBytesFromByteBuf(bb.readBytes(15));
        entity.setImei(new String(imei));
        entity.setProtocolVersionNumber(bb.readUnsignedByte());
        entity.setVehicleID(bb.readUnsignedByte());
        entity.setVehicleModel(bb.readUnsignedByte());
        entity.setTripID(bb.readUnsignedShort());
        entity.setReserved(bb.readUnsignedShort());
        entity.setEventID(bb.readUnsignedInt());
        entity.setIsLocation(bb.readUnsignedByte());
        entity.setLatitude(bb.readUnsignedInt());
        entity.setLongitude(bb.readUnsignedInt());
        entity.setSpeed(bb.readUnsignedShort());
        entity.setHeading(bb.readUnsignedShort());
        entity.setFuelOil(bb.readUnsignedByte());
        entity.setAvgOilA(bb.readUnsignedShort());
        entity.setAvgOilB(bb.readUnsignedShort());
        entity.setServiceIntervall(bb.readUnsignedShort());
        entity.setLeftFrontTirePressure(bb.readUnsignedByte());
        entity.setLeftRearTirePressure(bb.readUnsignedByte());
        entity.setRightFrontTirePressure(bb.readUnsignedByte());
        entity.setRightRearTirePressure(bb.readUnsignedByte());
        entity.setWindowInformation(bb.readUnsignedShort());
        entity.setVehicleTemperature(bb.readUnsignedByte());
        entity.setVehicleOuterTemperature(bb.readUnsignedByte());
        entity.setDoorInformation(bb.readUnsignedByte());
        byte[] bytes = new byte[3];
        Short byte1 = bb.readUnsignedByte();
        bytes[0] = byte1.byteValue();
        Short byte2 = bb.readUnsignedByte();
        bytes[1] = byte2.byteValue();
        Short byte3 = bb.readUnsignedByte();
        bytes[2] = byte3.byteValue();
        entity.setKilometerMileage(bytes);
        Short bonnetAndTrunk = bb.readUnsignedByte();
        entity.setBonnetAndTrunk(bonnetAndTrunk.byteValue());
        Short statWindow = bb.readUnsignedByte();
        entity.setStatWindow(statWindow.byteValue());
        entity.setAverageSpeedA(bb.readUnsignedShort());
        entity.setAverageSpeedB(bb.readUnsignedShort());
        entity.setSesam_clamp_stat(((Short)bb.readUnsignedByte()).byteValue());
        entity.setBcm_light(((Short)bb.readUnsignedByte()).byteValue());
        entity.setTcu_ecu_stat(((Short)bb.readUnsignedByte()).byteValue());
        entity.setBcm_stat_central_Lock(((Short)bb.readUnsignedByte()).byteValue());
        entity.setAcm_crash_status(((Short)bb.readUnsignedByte()).byteValue());
        entity.setDrivingRange(bb.readUnsignedShort());
        entity.setVoltage(bb.readUnsignedShort());
        entity.setMt_gear_position(((Short)bb.readUnsignedByte()).byteValue());
        entity.setEngineState(bb.readUnsignedByte());
        entity.setDoorLockState(((Short)bb.readUnsignedByte()).byteValue());
        entity.setBlowState(((Short)bb.readUnsignedByte()).byteValue());
        entity.setAcState(((Short)bb.readUnsignedByte()).byteValue());
        entity.setCheckSum(((Short)bb.readUnsignedByte()).byteValue());

        return entity;
    }

    private byte[] getBytesFromByteBuf(ByteBuf buf){
        //基于netty
        byte[] result = new byte[buf.readableBytes()];
        buf.readBytes(result, 0, buf.readableBytes());
        buf.readerIndex(0);
        return result;
    }


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

    public Integer getWindowInformation() {
        return windowInformation;
    }

    public void setWindowInformation(Integer windowInformation) {
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

    public Integer getAverageSpeedA() {
        return averageSpeedA;
    }

    public void setAverageSpeedA(Integer averageSpeedA) {
        this.averageSpeedA = averageSpeedA;
    }

    public Integer getAverageSpeedB() {
        return averageSpeedB;
    }

    public void setAverageSpeedB(Integer averageSpeedB) {
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

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Byte getMt_gear_position() {
        return mt_gear_position;
    }

    public void setMt_gear_position(Byte mt_gear_position) {
        this.mt_gear_position = mt_gear_position;
    }

    public Short getEngineState() {
        return engineState;
    }

    public void setEngineState(Short engineState) {
        this.engineState = engineState;
    }

    public Byte getDoorLockState() {
        return doorLockState;
    }

    public void setDoorLockState(Byte doorLockState) {
        this.doorLockState = doorLockState;
    }

    public Byte getBlowState() {
        return blowState;
    }

    public void setBlowState(Byte blowState) {
        this.blowState = blowState;
    }

    public Byte getAcState() {
        return acState;
    }

    public void setAcState(Byte acState) {
        this.acState = acState;
    }
}
