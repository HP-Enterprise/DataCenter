package com.hp.data.core;

import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;

@Component("packageDistinguish")
public class PackageDistinguishHPImpl implements PackageDistinguish{
    public String getPackageKey(ByteBuffer buffer){
        DataBuilder db=DataBuilder.build(buffer);
        return String.valueOf(db.moveTo(8).getUInt16BE());
    }
}
