package org.example.adhoc;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        HashMap<>

           /*
               1 -> Chirantar
               2 -> Tanuj
               3 -> Shivam
               4 -> Gautam
               5 -> Hardick
            */

//        List<Student> list = new ArrayList<>();
//
//
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "Chirantar");
//        map.put(2, "Tanuj");
//        map.put(3, "Shivam");
//        map.put(4, "Gautam");
//        map.put(5, "Hardick");
//
//        System.out.println(map.get(3));
//
//        System.out.println(map.get(1));
//
//        System.out.println(map);
//
////        for(HashMap.Entry<Integer, String> entry : map.entrySet()){
////            System.out.println(entry.getKey() + " : " + entry.getValue());
////        }
//
//        map.put(3, "Golubaba");
//        map.put(6, "Shivam");
//        for(HashMap.Entry<Integer, String> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        Set<Integer> set = new HashSet<>();
//
//        Set<Integer> keySet = map.keySet();
//        for(int key : keySet){
//            System.out.println(key + " : " + map.get(key));
//        }



//        character -> count
//            h ->


               /*
               put/get
                h is not there // h -> 1
                h is present // h get + 1, put
                */

//        String str = "hello how are you";
//
//        HashMap<Character, Integer> charMap = new HashMap<>();
//        System.out.println(charMap);
//        System.out.println(charMap.get('h'));
//        for (int i =0; i < str.length(); i++){
//            char c = str.charAt(i);
//            if (charMap.containsKey(c) == false){
//                charMap.put(c, 1);
//            }else {
//                int cCount = charMap.get(c);
//                charMap.put(c, cCount + 1);
//            }
//        }

//        System.out.println(charMap);

//        System.out.println(0%10);
        Map<String, String> map = new HashMap<>();
        map.put(null, null);

        System.out.println(map);

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 2});
        List<int[]> arr = new ArrayList<>();
        arr.add(new int[]{1, 2});
        arr.add(new int[]{2, 4});
        Collections.sort(arr, (x,y)->{return x[1] -y[1];});

    }
}
