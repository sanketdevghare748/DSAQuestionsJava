package Oops_Concept;

//import static jdk.internal.org.jline.utils.Colors.s;

public class Son_abstract extends Parent {
    @Override
    void career()
    {
        System.out.println("This is a boy and want to be doctor");
    }
    void partner()
    {
        System.out.println("This is a boy and want to marry a girl.");
    }
    void getAge(int age)
    {
        System.out.println("This is a boy age"+age);
    }


}

