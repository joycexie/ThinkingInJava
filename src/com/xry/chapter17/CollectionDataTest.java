package com.xry.chapter17;

import java.util.LinkedHashSet;
import java.util.Set;

import com.xry.chapter15.Generator;

/**
 * LinkedHashSet±£≥÷≤Â»ÎÀ≥–Ú
 * 
 * @author xieruyi
 *
 */
public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 3));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(), 3));
        System.out.println(set);
    }
}

class Government implements Generator<String> {

    String[] foundation = "i love you".split(" ");
    int index;

    @Override
    public String next() {
        // TODO Auto-generated method stub
        if (foundation.length > index)
            return foundation[index++];
        return "";
    }

}
