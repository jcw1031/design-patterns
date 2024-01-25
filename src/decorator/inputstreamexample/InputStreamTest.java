package decorator.inputstreamexample;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

    public static void main(String[] args) {
        int c;

        try (InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(System.in));) {
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
