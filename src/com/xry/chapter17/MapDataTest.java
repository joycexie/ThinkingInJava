package com.xry.chapter17;

import java.util.Iterator;

import com.xry.chapter15.Generator;

/**
 * 
 * @author xieruyi
 *
 */
public class MapDataTest {
    public static void main(String[] args) {
        MapData<Integer, String> map = MapData.map(new Letters(), 11);
        System.out.println(map);
        map.putAll(MapData.map(new Letters(), 'Z'));
        System.out.println(map);
    }
}

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {

    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Iterator<Integer> iterator() {
        // TODO Auto-generated method stub
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return number < size;
            }

            @Override
            public Integer next() {
                // TODO Auto-generated method stub
                return number++;
            }

            @Override
            public void remove() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException();
            }

        };
    }

    @Override
    public Pair<Integer, String> next() {
        // TODO Auto-generated method stub
        return new Pair<Integer, String>(number++, "" + letter++);
    }

}