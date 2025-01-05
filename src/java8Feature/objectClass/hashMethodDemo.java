package java8Feature.objectClass;

public class hashMethodDemo {
    int rollNO;
    public hashMethodDemo(int rollNO){
        this.rollNO= rollNO;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        Object object = new hashMethodDemo(10);
        Object object1 = new hashMethodDemo(34);
        System.out.println( object.hashCode());
        System.out.println(object1.hashCode());

        System.out.println(object.getClass());
        System.out.println(object.toString());
        System.out.println(object.equals(object1));

    }

}
