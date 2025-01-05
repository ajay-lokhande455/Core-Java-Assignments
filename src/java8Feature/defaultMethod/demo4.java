package java8Feature.defaultMethod;

public class demo4 {
    public static void main(String[] args) {
        interface DefaultEx{
            public void message();
            default void display(){
                System.out.println("hello from default method");
            }
        }
        class SendMessage implements DefaultEx{
            @Override
            public void message() {
                System.out.println("Hey,.. I'm Ajay");
            }

            @Override
            public void display() {
                DefaultEx.super.display();
                System.out.println("what is your name");
            }
        }
        SendMessage sendMessage = new SendMessage();
        sendMessage.message();
        sendMessage.display();
    }
}
