package Cards;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cards {


    public static void main(String[] args) throws IOException {
        Path pathIn= Paths.get("src/Cards/cards.in");
        String[] cards = Files.readAllLines(pathIn).get(0).split(" ");
        boolean[] hasCard = new boolean[9];
        FileWriter out = new FileWriter("src/Cards/cards.out", true);

        for(String s:cards){
            int i = Integer.parseInt(s);
            hasCard[i-2] = true;
        }
        for (int i = 0;i<hasCard.length;i++){
            if (!hasCard[i]){
                out.append((i+2)+" ");
            }
        }
        out.flush();
    }
}
