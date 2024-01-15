package Sanket.Recursion;

import java.util.ArrayList;

public class Ways_diceQn {
    public static void main(String[] args) {
        ArrayList<String> ans= diceList("",5);
        System.out.println(ans);
        System.out.println(diceListcount("",5));
        System.out.println("Size of diceList: "+ans.size() );
    }

    private static void dice(String p, int target) {
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i=1;i<=6 && i<=target;i++)
        {
            dice(p+i,target-i);
        }
    }
    //same approach using Arraylist to return the answer.
    private static ArrayList<String> diceList(String p, int target) {
        ArrayList<String> list= new ArrayList<>();
        if(target==0){
            //System.out.println(p);
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        for (int i=1;i<=6 && i<=target;i++)
        {

           ans.addAll(diceList(p+i,target-i));


        }
        return ans;
    }

    //To return the count:
    private static int diceListcount(String p, int target) {
        //ArrayList<String> list= new ArrayList<>();
        if(target==0){
            //System.out.println(p);

            return 1;
        }
        int count=0;

        for (int i=1;i<=6 && i<=target;i++)
        {

            count=count +diceListcount(p+i,target-i);


        }
        return count;
    }
}
