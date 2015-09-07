package com.hp.data.convert;


public enum DataType {
    BYTE,       //单字节，对应类型Byte,Boolean
    INT_8,      //单字节整数，对应类型Short,Integer,Long
    INT_16,     //双字节整数，对应类型Short,Integer,Long
    INT_32,     //四字节整数，对应类型Integer,Long
    U_INT_8,    //无符号单字节整数，对应类型Short,Integer,Long
    U_INT_16,   //无符号双字节整数，对应类型Integer,Long
    U_INT_32,   //无符号四字节整数，对应类型Long
    STRING      //字符串型，对应类型String。如果未设置size则按变长字符串处理
}
