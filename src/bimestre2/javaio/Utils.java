package bimestre2.javaio;

public class Utils {
    
    private static final String PATH = "src/bimestre2/javaio/";

    public static String getFilePath(String pkg, String fileName) {
        return PATH + pkg + "/" + fileName;
    }
}
