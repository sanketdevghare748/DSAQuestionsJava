package Collections.list;
import java.util.*;
import java.util.Map.Entry;

public class Arraylist {
        public static void main(String[] args) {
            //Arraylist and its function
            ArrayList <Integer> arrlist = new ArrayList <> ();
            arrlist.add(1);
            arrlist.add(2);
            arrlist.add(3);
            arrlist.add(4);
            System.out.println(arrlist);
            arrlist.add(2, Integer.parseInt("5"));
            System.out.println(arrlist);


            Object [] arr = arrlist.toArray();
            System.out.println(arrlist.indexOf(2));

            List<String> list= List.of("Sheela","Munni", "Rani","Pinky","Munni","Pinky");
            System.out.println(list);

            //Hashset
            HashSet <String> hashSet = new HashSet <> (Arrays.asList("Sheela","Munni", "Rani","Pinky","Munni","Pinky"));
           // hashSet.addAll(list);
            System.out.println(hashSet);
            Iterator <String> it= hashSet.iterator();
            while(it.hasNext())
            {
                String currentValue = it.next();
               if(currentValue.equals("Munni")) {

                   System.out.println(currentValue);
               }
            }

            //Stack
            Stack <String> stack= new Stack<>();
            stack.addAll(list);
            stack.push("Ramesh");
            System.out.println(stack.pop());


            //Hashmap
            HashMap <String,String> map=new HashMap <> ();
            map.put("NAME","Munni");
            map.put("AGE","40");
            map.put("SEX","F");
            map.put("PROFESSION","SDET");
            System.out.println(map);
            System.out.println(map.get("SDET"));
            System.out.println(map.containsKey("SEX"));

            //Iterating over hashmap using Keyset:This will return the set of keys
            //EntrySet() --.This will return all the mapping of the hashmap in the form of the set
            //map.Values() -->This will return all the values in the form of set from  the given hashmpa.


            System.out.println("Entryset : " + map.entrySet());
            System.out.println("keyyset : " + map.keySet());
            System.out.println("Valueset : " + map.values());

           Collection<String> onj=  map.values();
           Iterator <String> itr= onj.iterator();
           
            for(Entry<String, String> m: map.entrySet())
            {
                System.out.println("Key : " + m.getKey() + " Value : " + m.getValue());
            }

            //This is the shortcut of the creating the cod can0 I implement the code the writte in jva th ont the same person
            //
            // so have a loo k at that st athe same time we are not much sure about how to do the thingsm



        }
}
