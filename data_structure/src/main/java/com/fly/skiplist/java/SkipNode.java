package com.fly.skiplist.java;

public class SkipNode<E extends Comparable<? super E>> {
    public final E value;
    public final SkipNode<E>[] forward; // array of pinter

    @SuppressWarnings("unchecked")
    public SkipNode(int level, E value) {
        forward = new SkipNode[level + 1];
        this.value = value;
    }
}
