package com.xry.chapter16;

import java.util.Arrays;

import com.xry.helper.StringAddress;

/**
 * 使用Arrays中的各种方法
 * 
 * @author xieruyi
 */
public class ArraysPrint {

	public static void main(String[] args) {
		// Arrays.toString用于一维数组的打印,对基本类型和对象数组都有作用
		int[] ints = new int[] { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(ints));
		StringAddress stringAddress = new StringAddress("Hello");
		System.out.println(Arrays.toString(new StringAddress[] { stringAddress }));
		// Arrays.deepToString用于多维数组的打印,对基本类型和对象数组都有作用
		StringAddress[][] addresses = Arrays.copyOf(new StringAddress[][] { { stringAddress }, { stringAddress } }, 4);
		System.out.println(Arrays.deepToString(addresses));
		System.out.println(Arrays.toString(addresses));
	}
}
