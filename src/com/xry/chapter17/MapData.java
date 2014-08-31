package com.xry.chapter17;

import java.util.LinkedHashMap;

import com.xry.chapter15.Generator;

public class MapData<K, V> extends LinkedHashMap<K, V> {
    public MapData(Generator<Pair<K, V>> generator, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Pair<K, V> pair = generator.next();
            put(pair.key, pair.value);
        }
    }

    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> generator, int quantity) {
        return new MapData(generator, quantity);
    }

    public MapData(Iterable<K> iterable, V value) {
        for (K key : iterable) {
            put(key, value);
        }
    }

    public static <K, V> MapData<K, V> map(Iterable<K> iterable, V value) {
        return new MapData(iterable, value);
    }

}

class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        this.key = k;
        this.value = v;
    }
}
