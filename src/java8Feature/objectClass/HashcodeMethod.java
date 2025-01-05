package java8Feature.objectClass;

public class HashcodeMethod {

    int id;

    public  HashcodeMethod(int id){
        this.id = id;
    }

    public static void main(String[] args) {
        HashcodeMethod hashcodeMethod;
        hashcodeMethod = new HashcodeMethod(23);
        System.out.println(hashcodeMethod.hashCode());



        
    }
}
