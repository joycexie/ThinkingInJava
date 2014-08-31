package com.xry.chapter17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Unsupported {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("c");
        Collections.unmodifiableCollection(c);
        c.add("e");
        System.out.println(c);
        Collection<String> c2 = new ArrayList<String>();
        System.out.println(c.retainAll(c2));
        System.out.println(c);
    }
}
