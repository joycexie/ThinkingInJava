package com.xry.chapter16;

import java.util.Arrays;

import com.xry.helper.StringAddress;

/**
 * System.arraycopy对基本类型和对象类型都有效，但是在对象类型中，是浅拷贝
 * 
 * @author xieruyi
 *
 */
public class CopyingArrays {

    public static void main(String[] args) {
        int[] ints = { 1, 2, 3, 4 };
        int[] ints2 = new int[5];
        System.arraycopy(ints, 0, ints2, 0, 4);
        System.out.println(Arrays.toString(ints2));

        StringAddress[] addresses = new StringAddress[4];
        StringAddress address = new StringAddress("Hi");
        Arrays.fill(addresses, address);
        StringAddress[] addresses2 = new StringAddress[6];
        System.arraycopy(addresses, 0, addresses2, 0, 4);
        System.out.println(Arrays.toString(addresses2));
        address.setS("world");
        System.out.println(Arrays.toString(addresses2));
    }
}
