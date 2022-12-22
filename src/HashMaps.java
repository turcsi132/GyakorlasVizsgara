import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<String, Integer> hasis = new HashMap<>();

        String key1 = "nulla", key2 = "egy", key3 = "ketto";
        int value1 = 0, value2 = 1, value3 = 2;

        hasis.put(key1, value1);
        hasis.put(key2, value2);
        hasis.put(key3, value3);

        for (String key : hasis.keySet()) {
            System.out.print(key + " ");
            System.out.println(hasis.get(key));
        }
        for (int value : hasis.values()) {
            System.out.print(value + " ");
        }
//        System.out.println();

        int index = 2;
        for (String key : hasis.keySet()) {
            if (hasis.get(key) == index){
                System.out.println(key);
            }
        }


    }
// be: index, hashmap, ki: key (index value alapján);

    public static String beki(int index, HashMap<String, Integer> hashMap){
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) == index){
                return key;
            }
        }
        return " ";
    }
}
