package com.incar.bean.landu;

import com.incar.convert.DataEntity;
import com.incar.convert.DataType;
import com.incar.convert.DataMel;
@DataEntity
public class ReqHead{
    /*-----数据包头信息-----*/
    private Integer head;           //数据包标识
    private Integer length;         //数据包长度
    private Integer inverseLength;  //数据包校验长度(长度取反)
    @DataMel(DataType.U_INT_8)
    private Short    packageId;      //数据包ID
    @DataMel(DataType.U_INT_8)
    private Short    packageVersion; //数据包协议版本


    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getInverseLength() {
        return inverseLength;
    }

    public void setInverseLength(Integer inverseLength) {
        this.inverseLength = inverseLength;
    }

    public Short getPackageId() {
        return packageId;
    }

    public void setPackageId(Short packageId) {
        this.packageId = packageId;
    }

    public Short getPackageVersion() {
        return packageVersion;
    }

    public void setPackageVersion(Short packageVersion) {
        this.packageVersion = packageVersion;
    }


    @Override
    public String toString() {
        return "head:"+Integer.toHexString(this.getHead()).toUpperCase()+
                "\nlength:"+Integer.toHexString(this.getLength()).toUpperCase()+
                "\ninverseLength:"+Integer.toHexString(this.getInverseLength()).toUpperCase()+
                "\npackageId:"+Integer.toHexString(this.getPackageId()).toUpperCase()+
                "\npackageVersion:"+Integer.toHexString(this.getPackageVersion()).toUpperCase();
    }
}
