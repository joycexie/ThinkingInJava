package com.xry.chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import com.xry.chapter15.Generator;

/**
 * 使用内置的排序方法（Array.sort或Colletions.sort）就可以对基本类型和对象类型的数组或容器
 * 进行排序，但是对于对象，必须要保证对象实现了Comparable接口或者有关联的Comparator
 * 类内部实现了Comparable接口则可以直接进行sort(array)，否则可以实现自定义Comparator来进行sort(array,comparator)
 * 使用内置的二分查找是同理，不再赘述
 * 
 * @author xieruyi
 *
 */
public class ArraySorting {
    public static void main(String[] args) {
        CompType[] array = Generated.array(new CompType[12], CompType.generator());
        System.out.println("before sorting");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("after sorting by i");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("after reverse sorting");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new CompTypeComparator());
        System.out.println("after new comparator sorting by j");
        System.out.println(Arrays.toString(array));
        int[] ints = { 1, 3, 2, 4 };
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        Integer[] integers = { 1, 2, 4, 3 };
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
        int index = Arrays.binarySearch(array, new CompType(2, 3));
        System.out.println(index);
        System.out.println(Arrays.binarySearch(array, new CompType(13, 3)));
        System.out.println(Arrays.binarySearch(array, new CompType(12, 10), new CompTypeComparator()));
    }
}

class CompTypeComparator implements Comparator<CompType> {

    @Override
    public int compare(CompType o1, CompType o2) {
        // TODO Auto-generated method stub
        return o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1);
    }

}

class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count = 1;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public String toString() {
        String result = "(i=" + i + ",j=" + j + "])";
        if (count++ % 3 == 0)
            result += "\n";
        return result;
    }

    @Override
    public int compareTo(CompType compType) {
        return i < compType.i ? -1 : (i == compType.i ? 0 : 1);
    }

    private static Random r = new Random(47);

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            public CompType next() {
                // return new CompType(r.nextInt(100), r.nextInt(100));
                return new CompType(count++, count);
            }
        };
    }
}