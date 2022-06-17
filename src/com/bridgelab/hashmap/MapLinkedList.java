package com.bridgelab.hashmap;

public class MapLinkedList<K, T> {
    MyMapNode head;

    public int add(K key, T value) {
        int count = 0;
        MyMapNode newNode = new MyMapNode(key, value);
        if (head == null) {
            head = newNode;
            count++;
            return count;
        }
        MyMapNode temp = head;
        while (!temp.key.equals(key) && temp.next != null) {
            temp = temp.next;
        }
        if (temp.key.equals(key)) {
            temp.value = value;
            return count;
        } else {
            temp.next = newNode;
            count++;
        }
        return count;
    }

    public T search(K key) {
        MyMapNode temp = head;
        while(temp != null) {
            if (temp.key.equals(key)) {
                return (T) temp.value;
            } else {
                temp = temp.next;
            }
        }
        return null;
    }

    public boolean remove(K key) {
        if (head.key.equals(key)) {
            head = head.next;
            return true;
        }
        MyMapNode prevNode = head;
        MyMapNode requiredNode = null;
        while (prevNode.next != null && !prevNode.next.key.equals(key)) {
            prevNode = prevNode.next;
        }
        requiredNode = prevNode.next;
        prevNode.next = requiredNode.next;
        return true;
    }


    @Override
    public String toString() {
        return "MapLinkedList{" +
                "head=" + head +
                '}';
    }
}
