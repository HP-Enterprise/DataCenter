package com.hp.data.convert;


public class PackageElement {
    private String name;
    private DataType dataType;

    public PackageElement(String eleName, String eleType) {
        this.name=eleName;
        this.dataType=DataType.valueOf(eleType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }
}
