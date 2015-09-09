package com.hp.data.core;


public class PackageElement {
    private String name;
    private DataType dataType;
    private int size;


    public PackageElement(String eleName, String eleType,int size) {
        this.name=eleName;
        this.dataType=DataType.valueOf(eleType);
        this.size=size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
