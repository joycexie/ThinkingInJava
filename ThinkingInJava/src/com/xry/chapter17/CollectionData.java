package com.xry.chapter17;

import java.util.ArrayList;

import com.xry.chapter15.Generator;

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> generator, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(generator.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> generator, int quantity) {
        return new CollectionData<T>(generator, quantity);
    }
}
