package com.bridgelab.hashmap;

public class MyMapNode<K, T> {
  public  K key;
   public  T value;
    public MyMapNode next;

    public MyMapNode(K key, T value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
