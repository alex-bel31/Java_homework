package Java_homework.homework_2;
import java.io.*;
import java.util.ArrayList;

public class app {
    public static void main(String[] args) throws Exception{
        ArrayList<String> arrayList = fileReading();
        String a = arrayList.get(1);
        String b = arrayList.get(3);
        int powValue = Integer.parseInt(a);
        int value = Integer.parseInt(b); 
        int result = exponentiation(value, powValue);
        String strResult = String.valueOf(result);
        writeToFile(strResult);    
    } 

    public static ArrayList<String> fileReading() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;
        ArrayList<String> array = new ArrayList<String>();
        while ((line = reader.readLine()) != null) { 
            for (String value : line.split(" ")) {
                array.add(value);
            }
        }
        reader.close();
        return array;
    }

    public static void writeToFile(String strResult) throws IOException{
        FileWriter fw = new FileWriter("output.txt");
        fw.write(strResult);
        fw.close();
    }

    public static int exponentiation(int value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * exponentiation(value, powValue - 1);
        }
     }
}



