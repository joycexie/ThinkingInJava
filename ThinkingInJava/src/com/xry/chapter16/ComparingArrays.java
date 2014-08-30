package com.xry.chapter16;

import java.util.Arrays;

import com.xry.helper.StringAddress;

/**
 * Arrays.equals�����ڻ������ͺͶ������ڶ���ʱ�������Ӧ�����equals����
 * 
 * @author xieruyi
 *
 */
public class ComparingArrays {

    public static void main(String[] args) {
        int[] ints = { 1, 2, 3, 4 };
        Integer[] integers = { 1, 2, 3, 4 };
        // System.out.println(Arrays.equals(ints, integers)); // �����ڱ����������Ͳ�ͬ
        int[] ints2 = { 1, 2, 3, 4 };
        System.out.println(Arrays.equals(ints, ints2)); // true
        StringAddress[] addresses = new StringAddress[2];
        Arrays.fill(addresses, new StringAddress("Hi"));
        StringAddress[] addresses2 = { new StringAddress("Hi"), new StringAddress("Hi") };
        System.out.println(Arrays.equals(addresses, addresses2)); // false
    }
}
