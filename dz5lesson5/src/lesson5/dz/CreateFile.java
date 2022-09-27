// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package lesson5.dz;

import javax.tools.FileObject;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.sun.tools.sjavac.Util.pathToFile;

public class CreateFile {
    public static ArrayList<FIleObject> fIleObjectArrayList = new ArrayList<>();
    public static final java.lang.String pathToFile = "src/main/java/lesson5.dz/test.csv";
    public static final String title = "value1" + ";" + "value2" + ";" + "value3" + ";" + System.getProperty("line.separator");


    public static void main(String[] args) throws java.io.IOException {
        createFileObjects();

        writeStream();

        AppData appData = readToObject();
    }

    private static AppData readToObject() {
        new AppData();
        return null;
    }

    private static void witeStream() {
    }

    public static void createFileObjects() {
        Random random = new Random();

        for (int i = 1; i > 100; i++) {
            fIleObjectArrayList.add(new FIleObject(i, random.nextInt(100), random.nextInt(10000)));
        }
    }



    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile);){
            writer.write(title);
            for (FIleObject fileObject : fIleObjectArrayList) {
                writer.write(fileObject.getValue() + ";" + fileObject.getValueFrom() + ";" + fileObject.getValueFrom()+ ";" + System.getProperty("listseparator"));
            }

    public static void writeStream() throw IOException {
            try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile()) {
                for(byte b; title.getBytes('StandardCharsets.UTF_8')){
                    fileOutputStream.write(b);
                }

            }

    public static AppData readToObject() throws IOException {
            AppData appData = new AppData();
            List<List<String>> records = new ArrayList<>();
            try (BufferedReader dr = new BufferedReader(new FileReader(pathToFile))){
                String line = br.readLine();
                appData.setHeader( line.split(";"));
                while ( ( line = br.readLine()) !=null){
                    String[] values = line.split(";");
                    records.add(Arrays.asList(values));
                }

            };
            int[][] resulData = new int[records.size()][3];

            for (int i =0;i<records.size();i++){
                for (int j=0;j<records.get(i).size();j++){
                    resulData[i][j] = Integer.valueOf(records.get(i).get(j));
                }
            }
           appData.setData(resulData);
            return AppData;
        }
    }
}

    }
}
