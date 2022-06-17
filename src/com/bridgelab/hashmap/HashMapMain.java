package com.bridgelab.hashmap;

public class HashMapMain {
    public static void main(String[] args) {
        String sentence = "to be or not to be";
        IHashMap<String,Integer> hashMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word: words) {
            Integer value = hashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            hashMap.put(word, value);
        }
        int frequency = hashMap.get("to");
        System.out.println(frequency);
        System.out.println(hashMap);
    }
}
