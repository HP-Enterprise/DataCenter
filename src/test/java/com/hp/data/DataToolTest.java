package com.hp.data;

import com.hp.data.util.DataTool;
import org.junit.Test;
import java.nio.ByteBuffer;

/**
 * Created by zxZhang on 2015/12/1.
 */
public class DataToolTest {
    DataTool dataTool = new DataTool();

    @Test
    public void testCheckSum(){
        String strReq = "AA 55 00 50 FF AF BF 05 16 03 49 4E 43 41 52 31 30 30 30 31 38 36 31 39 39 37 00 00 00 00 5D 31 38 30 00 4C 46 56 33 41 32 38 4B 38 46 33 30 33 38 36 35 33 00 56 31 2E 36 31 2E 30 30 00 56 31 2E 30 2E 30 00 56 33 2E 31 36 2E 35 37 00 FF 00 11 17 ";
        ByteBuffer byteBuffer = dataTool.getByteBuffer(strReq);
        byte[] bytes = dataTool.getBytesFromByteBuffer(byteBuffer);
        System.out.println(dataTool.checkSum(bytes));
    }

}
