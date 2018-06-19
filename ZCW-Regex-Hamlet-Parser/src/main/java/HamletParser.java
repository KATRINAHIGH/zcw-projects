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
    private String[] patterns;
    private String[] replacements;
    private String fileName;


    public HamletParser(String fileName, String[] patterns, String[] replacements) {
//        if(replacements.length < patterns.length){
//            throw new Exception("there must be at least as many replacements as patterns");
//        }
        this.patterns = patterns;
        this.replacements = replacements;
        this.fileName = fileName;
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(this.fileName).getFile());
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
        String outPut = this.hamletData;
        for(int i = 0; i < patterns.length; i++){
            Pattern p =  Pattern.compile(this.patterns[i]);
            Matcher matcher = p.matcher(outPut);
            outPut = matcher.replaceAll(this.replacements[i]);
        }
        return outPut;
    }

}


