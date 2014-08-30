package com.xry.chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xry.helper.StringAddress;

/**
 * �����öԵ�����������������Collection�ķ�ʽ��Collections.nCopies��Collections.fill �ӽ���ɷ���list��ÿ��Ԫ�ص�hashCode����ͬ��������������ö�������Ϊָ����ͬ�Ķ���
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
