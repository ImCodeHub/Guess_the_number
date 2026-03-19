package Interface;
/** {@code FunctionalInterface} is interface which has only one abstract method
 * <p> means functional interface will have only one job to do (single task contract)
 * <p> Interface always has abstract method which means method without body, in other words
 * <p><I> interface include the {@code "what"} part, and {@code "how"} part can be implemented by other classes</I> */
@FunctionalInterface
public interface Messenger {
    public void send();
}



