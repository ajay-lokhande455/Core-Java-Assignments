package NestedClass;
//Write a Java program to create an outer class called Library with an instance variable libraryName. Create
// an inner class Book with a method getLibraryName() that returns the name of the library. Instantiate the
// Book class and call the getLibraryName() method
public class Library {
    private String name;
    public Library(String name){
        this.name = name;
    }

    public class Book{

        public String getLibrary(){
            return name;
        }
    }
    public static void main(String[] args) {
        Library library = new Library("Central Library");
        Library.Book book = library.new Book();
        System.out.println("Library name is: "+book.getLibrary());
    }
}
