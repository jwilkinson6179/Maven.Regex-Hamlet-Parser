import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public String changeHamletToLeon(String str)
    {
        Pattern thePattern = Pattern.compile("Hamlet");
        Matcher patternReplaced = thePattern.matcher(str);
        str = patternReplaced.replaceAll("Leon");
        thePattern = Pattern.compile("HAMLET");
        patternReplaced = thePattern.matcher(str);
        str = patternReplaced.replaceAll("LEON");

        return str;
    }

    public String changeHoratioToTariq(String str)
    {
        Pattern thePattern = Pattern.compile("Horatio");
        Matcher patternReplaced = thePattern.matcher(str);
        str = patternReplaced.replaceAll("Tariq");
        thePattern = Pattern.compile("HORATIO");
        patternReplaced = thePattern.matcher(str);
        str = patternReplaced.replaceAll("TARIQ");

        return str;
    }
}