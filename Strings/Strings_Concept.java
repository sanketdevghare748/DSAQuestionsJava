package Sanket.Strings;

public class Strings_Concept {
        public static void main(String[] args) {
            int x = -10;
            System.out.println(reverse(x));
        }

//            String a = "Sanket";
//            String b = "Sanket";
//            //Created value "Sanket" is pointed by two object a,b in the string pool. as values pointed by a and b is same hence, they are equal.
//            System.out.println(a == b); //Should be true.
//
//            String c = new String("Sanket");
//            String d = new String("Sanket");
//            //We are explicitley creating two different object using "new" keyword pointing to two different values.
//            System.out.println(c == d);//should be false.
//
//            System.out.println(c.equals(d));//Should be true.
//            System.out.println(a.equals(b));//Should be true
//
//            /* In .equals(), we do not bother about whether the object are pointing to same value or different we just compare the value
//                pointed by the objects.
//             */
//            System.out.println(d.charAt(0));
//       }
            static  int reverse(int x) {
                int rem=0;
                int rev=0;
                if(x>=0)
                {
                    while(x!=0)
                    {
                        rem=x%10;
                        rev=rev*10+rem;
                        x=x/10;
                    }
                    return rev;
                }
                else
                {
                    x= x*(-1);
                    while(x>0)
                    {
                        rem=x%10;
                        rev=rev*10+rem;
                        x=x/10;
                    }
                    return rev*(-1);
                }
        }
    }

