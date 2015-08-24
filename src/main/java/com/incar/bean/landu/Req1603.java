package com.incar.bean.landu;

import com.incar.convert.DataType;
import com.incar.convert.DataEntity;
import com.incar.convert.DataMel;

@DataEntity
public class Req1603{
    /*-----数据包体信息-----*/
    //-----命令信息
    private Integer command;        //命令字
    private String obdCode;         //OBD设备号
    private Long tripId;            //行程编号
    //-----车辆信息
    private String vid;             //车辆识别码
    private String vin;             //发动机识别码
    //-----模块信息
    private String hardwareVersion; //硬件版本号
    private String firmwareVersion; //固件版本号
    private String softwareVersion; //软件版本号
    @DataMel(DataType.U_INT_8)
    private Short diagnosisType;     //诊断类型
    //-----动作信息
    @DataMel(DataType.U_INT_8)
    private Short initCode;          //恢复出厂设置序列号


    @Override
    public String toString() {
        return "command:"+Long.toHexString(this.command).toUpperCase()+
                "\nobdCode:"+this.obdCode+
                "\ntripId:"+Long.toHexString(this.tripId).toUpperCase()+
                "\nvid:"+this.vid+
                "\nvin:"+this.vin+
                "\nhV:"+this.hardwareVersion+
                "\nfV:"+this.firmwareVersion+
                "\nsV:"+this.softwareVersion+
                "\ndiagnosisType:"+Integer.toHexString(this.diagnosisType).toUpperCase() +
                "\ninitCode:" + Integer.toHexString(this.initCode).toUpperCase();
    }



    public String getObdCode() {
        return obdCode;
    }

    public void setObdCode(String obdCode) {
        this.obdCode = obdCode;
    }

    public Integer getCommand() {
        return command;
    }

    public void setCommand(Integer command) {
        this.command = command;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Short getDiagnosisType() {
        return diagnosisType;
    }

    public void setDiagnosisType(Short diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    public Short getInitCode() {
        return initCode;
    }

    public void setInitCode(Short initCode) {
        this.initCode = initCode;
    }
}
