package Oops_Concept;
//Constructor and usage of this Keyword.
public class Student {
    String name;
    int StudentId=123;
    double Marks;

    public void showDetails()
    {
        System.out.println("Name "+ name+" Sudent ID "+StudentId+ " Marks "+ Marks);

    }
//Constructor
Student(String name,double Marks)
{
    this.name=name;
    this.Marks=Marks;
}
//Constructor overloading
Student(String name,double Marks, int studentId)
{
    this.name=name;
    this.Marks=Marks;
    this.StudentId=studentId;
}
Student()
{
    this("Rmaa",34,45);
    System.out.println("This is default constructor caalin other contstructor using this()..");


}
}