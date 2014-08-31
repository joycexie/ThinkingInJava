package com.xry.chapter16;

import java.util.Arrays;

/**
 * �����뷺�� ����ClassParameter����Ϊ�������࣬MethodParameter����Ϊ������������
 * ʹ�ò�������������ʹ�ò�������ķ������ڣ��㲻��Ϊ��ҪӦ�õ�ÿ�ֲ�ͬ���Ͷ�ʹ��һ������ȥʵ��������࣬
 * ���ҿɽ��÷�������Ϊ��̬�ġ���˲���������������ѡ��
 * 
 * @author xieruyi
 */
public class ParameterizedArrayType {

    public static void main(String[] args) {
        Integer[] ints = { 1, 2, 3, 4 };
        Double[] doubles = { 1.0, 2.0 };
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = MethodParameter.f(doubles);
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(doubles2));
    }
}

class ClassParameter<T> {
    public T[] f(T[] args) {
        return args;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] args) {
        return args;
    }
}