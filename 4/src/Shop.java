import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Shop {

    public static void main(String[] args) throws IOException {
        if (args.length <0){
            System.out.println("No input data");
        }
        FileReader reader = new FileReader("src/shop.in");
        FileWriter out = new FileWriter("src/shop.out", true);

        Integer shopassistant = reader.read();
        int maxIn = 0;
        int minOut = 0;
        for (int i = 0; i<shopassistant;i++) {
           int currIn = reader.read();
           int currOut = reader.read();
           if(currOut<currIn){
               currOut=currOut+24;
           }
           maxIn = Math.max(maxIn, currIn);
           minOut = Math.min(minOut, currOut);


           }
        int hours = minOut - maxIn;
        out.flush();
    }
}

