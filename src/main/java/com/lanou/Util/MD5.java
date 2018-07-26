package com.lanou.Util;

public class MD5 {
    //方丈面试 集锦
    //如何用最快的方法实现5*
    public static void main(String[] args) {
        // 表示八进制 以0开头
        System.out.println(0123);
        // 表示16进制 以0x开头
        System.out.println(0x123);
        // 写成二进制 按位相乘  都为1 则返回1 否则返回0
        //  5 & 3 ==>  0101 & 0011 = 0001
        System.out.println(5 & 3);
        //  5 | 3 ==>  0101 | 0011 = 0111
        System.out.println(5 | 3);
        // 现在有一个8进制的数 转换成16进制
        // 012 => 0xA
        //cafe =>12,10,15,14

        //加密算法
        //abcdefg ==>1234567可逆
        //MD5不可逆

        //自创加密算法 名字笔画 对少个横表示第一位,多少个竖表示第二位
        //人  0011000
        //工2100000
        //土2100000
        //通过 多个明文对应 一个密文
    }
}
