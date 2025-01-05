package classs;
//1. Create a class named '**Student**' with String variable '**name**' and integer variable 'rollNumber'
// 1. Assign the value of rollNumber as '2' and that of name as "John" by creating an object of the class Student.
//2. Assign and print the roll number, name of two students having
// names "Sam" and "John" respectively by creating two objects of class 'Student'.
public class Student {
    int rollNumber;
    String name;
    public  void display(int rollNumber, String name){

        this.rollNumber = rollNumber;
        this.name = name;
    }
    public  void print(){
        System.out.println("Name of student : "+name);
        System.out.println("Roll Number : "+rollNumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display(2,"john");
        s1.print();
        Student s2 = new Student();
        s2.display(2,"sam");
        s2.print();
    }


}
