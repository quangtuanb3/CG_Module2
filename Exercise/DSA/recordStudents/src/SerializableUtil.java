import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializableUtil {
    // deserialize to Object from given file
    public static List<Object> deserialize(String fileName) throws IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Object> objs = new ArrayList<>();
        try {
            while (true) {
                Object obj = ois.readObject();
                objs.add(obj);
            }
        } catch (Exception e) {

        }
        ois.close();
        return objs;
    }

    // serialize the given object and save it to file
    public static void serialize(List<Object> obj, String fileName)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Object student : obj) {
            oos.writeObject(student);
        }
        fos.close();
    }



}
