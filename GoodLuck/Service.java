package GoodLuck;

import java.io.IO;
import java.util.List;

public class Service {
    public void main() {
        String name = "Nisha Mishra";
        //             01234567891011
        int N = name.length(); // N= 12

        String resultStr = ""; // ""

        for (int i = N - 1; i >= 0; i--) {
           resultStr = resultStr + name.charAt(i);
            //           arhi
        }

        IO.println(resultStr);

    }
}
