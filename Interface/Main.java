package Interface;

import java.io.IO;
import java.security.MessageDigest;
import java.util.Comparator;

@FunctionalInterface
interface Display{
    public String show(String str);
}
/**this is {@code Email} class implements the {@code Messenger} interface*/
class Email implements Messenger {
    @Override
    public void send() {
        /**now we can write the logic for sending email (how part)*/
        IO.println("sending email..........");
    }
}

/**this is sms class that implements messenger interface
 * <p> this class can not user frequently because sms rarely send instead of that we can create Anonymous class*/
//class Sms implements Messenger{
//    @Override
//    public void send() {
//        IO.println("sending SMS......");
//    }
//}

@FunctionalInterface
interface Messanger1{
    public String send(String str);
}

public class Main {
    public static void main(String[] args){
        Email email = new Email();
        email.send();

        /**this is an Anonymous class*/
//        Messenger messenger = new Messenger() {
//            @Override
//            public void send() {
//                IO.println("send SMS..... from anonymous");
//            }
//        };
//
//        messenger.send();

        Messenger messenger1 = ()->IO.println("send SMS..... from Lamda");

        messenger1.send();

        Caculator cal = (x,y)-> x+y;
        Caculator  cal1= (a,b)-> a*b;

        Display dis = a -> a;

        System.out.println(cal.add(20,15));
        System.out.println(cal1.add(20,15));
        System.out.println(dis.show("Nisha"));

        Messanger1 mess = (s) -> "message sending: "+s;

        String send = mess.send("hello Nisha how are you?");
        System.out.println(send);

    }
}
