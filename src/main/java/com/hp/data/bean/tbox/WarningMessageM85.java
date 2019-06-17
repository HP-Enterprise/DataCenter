package com.hp.data.bean.tbox;

import com.hp.data.core.DataEntity;

@DataEntity(key = "8995")
public class WarningMessageM85 extends WarningMessage{

    private Byte towWarning;

    public Byte getTowWarning() {
        return towWarning;
    }

    public void setTowWarning(Byte towWarning) {
        this.towWarning = towWarning;
    }
}
