import com.aristo.pojo.ReelStripData;
import com.aristo.pojo.ReelStripDefinition;
import com.aristo.pojo.Stop;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Test2 {
    private static final String COMMA = ",";
    private static final String NEW_LINE = "\n";

    public static void main(String[] args) {
        String inputFilePath = "C:\\AutomationTesting\\GovermentCovidData\\module\\config";
        File folder = new File(inputFilePath);
        File[] files = folder.listFiles();
        for (File file : files){
            String fileName = file.getName();
            if(fileName.contains("reelstrips")){
                readJsonFileAndConvertToCSV(inputFilePath+"\\"+fileName);
            }
        }


    }

    private static void readJsonFileAndConvertToCSV(String inputFilePath) {
        try {
            byte[] bytes = Files.readAllBytes(Path.of(inputFilePath));
            String fileContent = new String(bytes);
            System.out.println(fileContent);

            Gson gson = new Gson();
            ReelStripData reelStripData = gson.fromJson(fileContent, ReelStripData.class);
            List<ReelStripDefinition> reelStripDefinitions = reelStripData.getReelStripDefinitions();
            StringBuilder sb = new StringBuilder();
            for (ReelStripDefinition reelStripDefinition : reelStripDefinitions){
                String name = reelStripDefinition.getName();
                List<Stop> stops = reelStripDefinition.getStops();
                stops.forEach(s-> {
                    sb.append(name).append(COMMA).append(s.getName()).append(NEW_LINE);
                });
            }

            System.out.println(reelStripData);

            System.out.println("__________________");
            String csvContent = sb.toString();
            System.out.println("csvContent = " + csvContent);


            String inputFileName = new File(inputFilePath).getName().replace(".json", ".csv");
            System.out.println("inputFileName=" + inputFileName);
            String outputCSVDir = "C:\\AutomationTesting\\GovermentCovidData\\module\\output\\csv\\"+inputFileName;
            Files.write(Path.of(outputCSVDir), csvContent.getBytes(StandardCharsets.UTF_8));

            System.out.println(inputFileName + " file has been written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
