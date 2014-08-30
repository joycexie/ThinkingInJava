package com.xry.chapter16;

import java.util.Arrays;

import com.xry.helper.StringAddress;

/**
 * ʹ��Arrays�еĸ��ַ���
 * 
 * @author xieruyi
 */
public class ArraysPrint {

	public static void main(String[] args) {
		// Arrays.toString����һά����Ĵ�ӡ,�Ի������ͺͶ������鶼������
		int[] ints = new int[] { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(ints));
		StringAddress stringAddress = new StringAddress("Hello");
		System.out.println(Arrays.toString(new StringAddress[] { stringAddress }));
		// Arrays.deepToString���ڶ�ά����Ĵ�ӡ,�Ի������ͺͶ������鶼������
		StringAddress[][] addresses = Arrays.copyOf(new StringAddress[][] { { stringAddress }, { stringAddress } }, 4);
		System.out.println(Arrays.deepToString(addresses));
		System.out.println(Arrays.toString(addresses));
	}
}
