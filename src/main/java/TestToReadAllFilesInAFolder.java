import java.io.File;

public class TestToReadAllFilesInAFolder {
    public static void main(String[] args) {
        String inputFilePath = "C:\\AutomationTesting\\GovermentCovidData\\module\\config";
        File folder = new File(inputFilePath);
        File[] files = folder.listFiles();
        for (File file : files){
            String fileName = file.getName();
            if(fileName.contains("reelstrips")){
                System.out.println(inputFilePath+"\\"+fileName);
            }
        }
    }
}
