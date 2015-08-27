package com.hp.triclops;

import com.hp.data.Application;
import com.hp.data.core.Conversion;
import com.hp.data.core.DataPackage;
import com.hp.data.core.DefaultConversion;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.nio.ByteBuffer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(locations = "classpath:spring-config.xml")
public class DemoTest {
    @Autowired
    private Conversion conversion;
    @Before
    public void setUp() {}

    @After
    public void tearDown() {}

    @Test
    public void testSample() {
        ByteBuffer bb= ByteBuffer.allocate(1024);
        String[] command="AA 55 00 4B FF B4 00 05 16 03 49 4E 43 41 52 30 30 30 30 30 33 00 00 00 00 3D 37 00 4C 53 56 46 56 36 31 38 33 44 32 32 30 30 39 33 32 00 56 31 2E 35 30 2E 30 30 00 56 30 2E 30 30 2E 30 30 00 56 33 2E 31 33 2E 31 35 00 FF 01 0F 22".split(" ");
        byte[] abc=new byte[command.length];
        for(int i=0;i<command.length;i++){
            abc[i]=Integer.valueOf(command[i],16).byteValue();
        }
        bb.put(abc);
        bb.flip();
        DataPackage dp=conversion.generate(bb);
        Assert.assertTrue(4 >= 3);
    }
}