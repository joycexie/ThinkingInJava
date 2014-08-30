package com.xry.chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xry.helper.StringAddress;

/**
 * 两种用对单个对象的引用来填充Collection的方式：Collections.nCopies和Collections.fill 从结果可发现list中每个元素的hashCode均相同，这表明所有引用都被设置为指向相同的对象
 * 
 * @author xieruyi
 */
public class FillingList {
	public static void main(String[] args) {
		StringAddress stringAddress = new StringAddress("Hello");
		List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4, stringAddress));
		System.out.println(list);
		list.addAll(list);
		System.out.println(list);
		stringAddress = new StringAddress("Hello");
		Collections.fill(list, stringAddress);
		System.out.println(list);
	}
}
