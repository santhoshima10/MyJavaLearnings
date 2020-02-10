package headFirst;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChildTest {

    public static void main(String[] args){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Test.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            Child child = new Child(20,30);
            outputStream.writeObject(child);
            outputStream.close();


            FileInputStream fileInputStream = new FileInputStream("Test.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Child obj = (Child)inputStream.readObject();

            System.out.println(obj.x+" "+obj.y+" "+obj.z);


        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
}
