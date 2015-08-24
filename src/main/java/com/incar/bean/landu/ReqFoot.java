package com.incar.bean.landu;

import com.incar.convert.DataEntity;

@DataEntity
public class ReqFoot {
    /*-----数据包尾信息-----*/
    private Integer checkNumber;    //数据包校验和

    public Integer getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(Integer checkNumber) {
        this.checkNumber = checkNumber;
    }


    @Override
    public String toString() {
        return "checkNumber:" + Integer.toHexString(this.checkNumber).toUpperCase();
    }
}
