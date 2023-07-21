import java.util.*;


public class Phone {

    private Map<String, String> map = new HashMap<>();


    void add(String phone_number, String name){
        map.put(phone_number, name);
    }


     void print(Phone phone){
        List<Map.Entry<String, String>> list = new ArrayList<>(phone.entrySet());

        Collection.sort(list, new Comparator<Map.Entry<String, String>>(){
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        HashSet<String> uniqueValues = new HashSet<>();
        for (Map.Entry<String, Integer> entry : list) {
            String value = entry.getKey();
            if (!uniqueValues.contains(value)) {
                System.out.println(value);
                uniqueValues.add(value);
            }
        }



    }


    


    
}
