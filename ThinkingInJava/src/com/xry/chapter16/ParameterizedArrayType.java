package com.xry.chapter16;

import java.util.Arrays;

/**
 * 数组与泛型 这里ClassParameter被称为参数化类，MethodParameter被称为参数化方法，
 * 使用参数化方法而不使用参数化类的方便在于：你不必为需要应用的每种不同类型都使用一个参数去实例化这个类，
 * 并且可将该方法定义为静态的。因此参数化方法总是首选。
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