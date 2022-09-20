package fileIO.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextRead {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d://abc.txt");
        BufferedReader br = new BufferedReader(fr);
        int i = br.read();

        while(i != -1){
            System.out.println((char) i);
            i = br.read();
        }
    }
}
