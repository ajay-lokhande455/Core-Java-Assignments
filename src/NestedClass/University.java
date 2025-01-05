package NestedClass;
//Write a Java program to create an outer class called University with a static nested class Department.
// The Department class should have a method "displayInfo()" that prints the department name and the number of
// faculty members. Instantiate the Department class from the main method and call the "displayInfo()" method.
public class University {
    static class Department{
        private String name;
        private int facultyCount;

        public Department(String name,int facultyCount){
            this.name = name;
            this.facultyCount = facultyCount;
        }

        public void displayInfo(){
            System.out.println("Department Name: " + name);
            System.out.println("Number of Faculty Members: " + facultyCount);
        }
    }

    public static void main(String[] args) {
        University.Department department = new University.Department("BCA",33);
        department.displayInfo();
    }
}
