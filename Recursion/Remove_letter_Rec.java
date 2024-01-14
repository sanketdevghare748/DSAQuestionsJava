package Sanket.Recursion;
/*Q:Remove a letter for ex.'a ' from the given String.*/
public class Remove_letter_Rec {
    public static void main(String[] args) {
        String up="abdefaah is my Sanket";
        skip("",up);
    }

    private static void skip(String p, String up) {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
            //as my give string is already empty hence return it directly without any processing.
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            skip(p,up.substring(1));
        }
        else
        {
            skip(p+ch,up.substring(1));
        }
    }
}
