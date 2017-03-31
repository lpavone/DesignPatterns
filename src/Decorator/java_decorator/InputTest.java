package Decorator.java_decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by leonardo on 07/03/17.
 */
public class InputTest {

    public static void main(String[] args) throws IOException{
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("/home/leonardo/test.txt")
                            )
                    );
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
