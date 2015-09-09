package com.hp.data.protocol;


import com.hp.data.core.AbstractConversion;
import com.hp.data.util.DataBuilder;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;
@Component
public class ConversionOBD extends AbstractConversion {
    @Override
    public String getPackageKey(ByteBuffer buffer){
        DataBuilder db=DataBuilder.build(buffer);
        String head=String.valueOf(db.moveTo(0).getUInt16BE());
        String command=String.valueOf(db.moveTo(8).getUInt16BE());
        return head+"_"+command;
    }
}
