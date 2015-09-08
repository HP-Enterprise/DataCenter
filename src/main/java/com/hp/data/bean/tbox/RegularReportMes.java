package com.hp.data.bean.tbox;

import com.hp.data.convert.DataEntity;

@DataEntity(key = "8995")
public class RegularReportMes extends TBoxUpBean{
    private Short regularData;

    public Short getRegularData() {
        return regularData;
    }

    public void setRegularData(Short regularData) {
        this.regularData = regularData;
    }
}
