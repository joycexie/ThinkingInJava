package com.xry.chapter16;

import java.lang.reflect.Array;

import com.xry.chapter15.Generator;
import com.xry.chapter17.CollectionData;

public class Generated {
    public static <T> T[] array(T[] args, Generator<T> generator) {
        return new CollectionData<T>(generator, args.length).toArray(args);
    }

    public static <T> T[] array(Class<T> type, Generator<T> generator, int size) {
        T[] args = (T[]) Array.newInstance(type, size);
        return new CollectionData<T>(generator, args.length).toArray(args);
    }
}
