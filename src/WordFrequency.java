import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordFrequency {
    public static void main(String[] args) {

        String input = "./input.txt";
        String output = "./output.txt";
        int frequency = 1;

        outputWordsWithFrequency(input, frequency, output);
    }

    public static void outputWordsWithFrequency(String input, int freqency, String output) {

        Path inputPath = Paths.get(input);
        Path outputPath = Paths.get(output);

        try {
            List<String> lines = Files.readAllLines(inputPath);
            HashMap<String, Integer> hashMap = new HashMap<>();
            String[] stringtomb = new String[lines.size()];

//             /( )\
//            (.) (.)
//            ||).(||
//             / Y \
//            / / \ \

            for (int i = 0; i < lines.size(); i++) {
//                System.out.println(lines.get(i));
                linesToHashMap(lines.get(i), hashMap);
            }

            List<String> keys = new ArrayList<>();
            String elejenUres = "";

            for (String key : hashMap.keySet()) {
                if (freqency == hashMap.get(key)) {
                    elejenUres += key + ", ";
                }
            }
            elejenUres = elejenUres.substring(0, elejenUres.length()-2);
            keys.add(elejenUres);

            Files.write(outputPath, keys);

        } catch (IOException e) {
            System.err.println("Rossz a fájlneved, ugye?");
        }
    }

    public static HashMap<String, Integer> linesToHashMap(String line, HashMap<String, Integer> hashMap) {
        String[] words = line.split(" ");
        for (String word : words) {
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                hashMap.replace(word, hashMap.get(word) + 1);
            }
        }

        return hashMap;
    }
}
// Tádááá metódus! Stringtömbből Listát csinál.
//            System.out.println(hashMap);
//            for (int i = 0; i < stringtomb.length; i++) {
//                lines.add(stringtomb[i]);
//            }


//            System.out.println(lines);
//            String[] words = lines.toString().split(" ");

//            System.out.println(Arrays.asList(words));
//            String allWords = "";

//            for (String word : words) {
//                allWords += word + " ";
//            }
//            allWords = allWords.replaceAll(",", "");
//            allWords = allWords.replace("]", "");
//            allWords = allWords.replace("[", "");

//
////            frequentWords = frequentWords.substring(frequentWords.length()).replace(",", "");
//            System.out.println(hashMap);
//
//
////            System.out.println(allWords);
//            for (String line : lines) {
//                for (int i = 0; i < line.length(); i++) {
////                    System.out.println(line);
//                }
//            }
//
////            String[] words = new String[];
//
//            for (String line : lines) {
//                words = line.split(" ");
//            }

