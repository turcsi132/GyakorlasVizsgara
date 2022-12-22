import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public static void main(String[] args) {
        String input = "./input.txt";
        String output = "./output.txt";
        try {
            copy(input, output, 2);
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void copy(String input, String output, int index) throws MyException{

        Path inputPath = Paths.get(input);
        Path outputPath = Paths.get(output);

        try {

            List<String> lines = new ArrayList<>(Files.readAllLines(inputPath));

            for (String line : lines) {
                System.out.println(line);
            }
            if (lines.size() > index){
            lines.remove(index - 1);
            }

        } catch (IOException e) {
            throw new MyException("Szarul adtad meg a fájlnevet");
        }
    }

}
