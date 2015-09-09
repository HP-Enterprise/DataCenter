package com.hp.data.protocol;


import com.hp.data.core.AbstractConversion;
import com.hp.data.util.DataBuilder;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;

@Component
public class ConversionTBox extends AbstractConversion {
    @Override
    public String getPackageKey(ByteBuffer buffer){
        DataBuilder db=DataBuilder.build(buffer);
        String head=String.valueOf(db.moveTo(0).getUInt16BE());
        String applicationId=String.valueOf(db.moveTo(9).getUInt8());
        String messageId=String.valueOf(db.moveTo(10).getUInt8());
        return head+"_"+applicationId+"_"+messageId;
    }
}
