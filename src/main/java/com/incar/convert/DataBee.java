package com.incar.convert;


import com.incar.DataType;

import java.lang.reflect.Field;

public class DataBee {
    private Field field;
    private DataType dataType;
    private Integer order;
    private Object value;
    public DataBee(Field field, DataType dataType) {
        this.field = field;
        this.dataType = dataType;
    }
    public DataBee(Field field, DataType dataType, Integer order) {
        this.field = field;
        this.dataType = dataType;
        this.order = order;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
