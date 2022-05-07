package com.leetcode.algo.hash.hashset;

import java.util.Objects;

/**
 * MyHashSet uses linear probing
 */
public class MyHashSet {
    private int powerOf2Cap = 5;

    private Integer[] buffer;
    private int capacity;
    private int size;
    private final double LOADING_FACTOR = 0.75;

    public MyHashSet() {
        capacity = (1 << powerOf2Cap) - 1;
        buffer = new Integer[capacity];
        size = 0;
    }

    public void add(int key) {
        int keyIndex = indexOf(key, hashOf(key));
        if (keyIndex < 0) {
            buffer[-keyIndex] = key;
            resize();
            ++size;
        } else if (buffer[keyIndex] == Integer.MIN_VALUE) {
            buffer[keyIndex] = key;
            ++size;
        }
    }

    private void resize() {
        if (Double.compare((double)(size)/capacity, LOADING_FACTOR) > 0) {
            int newCapacity = (1 << ++powerOf2Cap) - 1;
            Integer[] newBuffer = new Integer[newCapacity];
            for (int i = 0; i < capacity; ++i) {
                if (Objects.nonNull(buffer[i]) && (buffer[i] != Integer.MIN_VALUE)) {
                    int newIndex = hashOf(buffer[i]) % newCapacity;
                    if (newIndex == 0) {
                        newIndex = 1;
                    }
                    while(Objects.nonNull(newBuffer[newIndex])) {
                        ++newIndex;
                        if (newIndex == newCapacity) {
                            newIndex = 1;
                        }
                    }
                    newBuffer[newIndex] = buffer[i];
                }
            }
            buffer = newBuffer;
            capacity = newCapacity;
        }
    }

    public void remove(int key) {
        int indexOfKey = indexOf(key, hashOf(key));
        if (indexOfKey > -1) {
            --size;
            buffer[indexOfKey] = Integer.MIN_VALUE;
        }
    }

    public boolean contains(int key) {
        int index = indexOf(key, hashOf(key));
        if (index > -1) {
            return Objects.nonNull(buffer[index]) && (buffer[index] == key);
        }
        return false;
    }

    private int indexOf(int key, int hash) {
        int index = hash % capacity;
        if (index == 0) {
            index = 1;
        }
        while(Objects.nonNull(buffer[index])) {
            if (buffer[index] == key)
                return index;
            ++index;
            if (index == capacity) {
                index = 1;
            }
        }

        return -index;
    }


    private int hashOf(final int key) {
        return Objects.hash(key);
    }
}
