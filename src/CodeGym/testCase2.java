package CodeGym;

import java.io.*;

public class testCase2 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        System.out.println(filename);
        reader.close();

        File file = new File(filename);
        byte[] bytesArray = new byte[(int)file.length()];
        InputStream inputStream = new FileInputStream(filename);
        inputStream.read(bytesArray);
        inputStream.close();

        String s = new String(bytesArray);
        System.out.println(s);

    }

}
