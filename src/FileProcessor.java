import java.io.*;
import java.util.*;

public class FileProcessor {
    public static void updateArrayList(ArrayList<Car>cars) throws FileNotFoundException {
        Scanner readCars = new Scanner(new File("Files/Cars"));
        ArrayList<String> listTemp = new ArrayList<>();
        while (readCars.hasNext()){
            listTemp.add(String.valueOf(readCars.hasNextLine()));
        }
    }
}
