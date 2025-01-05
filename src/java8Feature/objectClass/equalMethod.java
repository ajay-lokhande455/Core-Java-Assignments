package java8Feature.objectClass;

public class equalMethod {
        public static void main(String[] args) {
            class Student{
                int id;
                String name;
                Student(int id, String name){
                    this.id = id;
                    this.name = name;
                }
            }

            Student student1 = new Student(101,"Ajay");
            Student student2 = new Student(101,"Ajay");
            Student student3 = student1;

            System.out.println(student1.equals(student2));
            System.out.println(student2.equals(student3));
            System.out.println(student1.equals(student3));
    }
}
