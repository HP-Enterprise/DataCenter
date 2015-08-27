package com.hp.data.core;

import java.nio.ByteBuffer;

public interface PackageDistinguish {
    public String getPackageKey(ByteBuffer buffer);
}
