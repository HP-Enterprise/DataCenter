package com.hp.data.core;

import java.nio.ByteBuffer;

public interface Conversion {
    public DataPackage generate(ByteBuffer buffer);
    public ByteBuffer generate(DataPackage pkg);
}
