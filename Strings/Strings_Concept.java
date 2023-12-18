package Sanket.Strings;

public class Strings_Concept {
        public static void main(String[] args) {
            String a="Sanket";
            String b="Sanket";
            //Created value "Sanket" is pointed by two object a,b in the string pool. as values pointed by a and b is same hence, they are equal.
            System.out.println(a==b); //Should be true.

            String c= new String("Sanket");
            String d= new String("Sanket");
            //We are explicitley creating two different object using "new" keyword pointing to two different values.
            System.out.println(c==d);//should be false.

            System.out.println(c.equals(d));//Should be true.
            System.out.println(a.equals(b));//Should be true

            /* In .equals(), we do not bother about whether the object are pointing to same value or different we just compare the value
                pointed by the objects.
             */
            System.out.println(d.charAt(0));
        }
    }
