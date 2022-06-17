package com.bridgelab.hashmap;

public class HashMapMain {
    public static void main(String[] args) {
        IHashMap<String,Integer> hashMap = new HashMap<>();
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split(" ");
        for(String word: words) {
            Integer value = hashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            hashMap.put(word, value);
        }
        System.out.println(hashMap);
    }
}
