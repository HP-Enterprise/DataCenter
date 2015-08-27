package com.hp.data.core;


import com.hp.data.convert.DataType;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component("conversion")
public class DefaultConversion implements Conversion{
    private Map<String,List<DataType>> unitMap;
    private PackageDistinguish packageDistinguish;

    @Override
    public DataPackage generate(ByteBuffer buffer) {
        String key=this.packageDistinguish.getPackageKey(buffer);
        System.out.println(key);
        List<DataType> list=this.unitMap.get(key);
        System.out.println(list.size());
        return null;
    }

    @Override
    public ByteBuffer generate(DataPackage pkg) {
        return null;
    }


    public Map<String, List<DataType>> getUnitMap() {
        return unitMap;
    }

    public void setUnitMap(Map<String, List<DataType>> unitMap) {
        this.unitMap = unitMap;
    }

    public PackageDistinguish getPackageDistinguish() {
        return packageDistinguish;
    }

    public void setPackageDistinguish(PackageDistinguish packageDistinguish) {
        this.packageDistinguish = packageDistinguish;
    }
}
