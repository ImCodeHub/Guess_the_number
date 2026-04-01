package Optional;

import java.util.Optional;

public class OptionalMain {
    public static Optional<String> getName(int id){
        return Optional.ofNullable(null);
    }
    public static void main(String[] args) {
        Optional<String> name = getName(1);

        String s = name.orElseThrow(() -> new RuntimeException("user not found"));

        System.out.println(s);
    }

}
