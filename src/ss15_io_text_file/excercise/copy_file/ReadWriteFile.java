package ss15_io_text_file.excercise.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {


    public List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        int count = 0;
        try {
            File file = new File(path);
            if (!file.exists())  {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String Line;
            while ((Line = br.readLine())!= null){
                if (Line.trim().isEmpty()){
                    continue;
                }
                count += Line.length();
                stringList.add(Line);
            }

            br.close();
        } catch (IOException ex) {
            System.out.println("File Not Found!!!");
        }
        System.out.println("So dong cua ban la: " + count);
        return stringList;
    }

    public void writeFile(String path, String str) {
        try {
            FileWriter wr = new FileWriter(path, true);
            BufferedWriter br = new BufferedWriter( wr);
            br.write(str);
            br.newLine();
            br.close();
        }catch (IOException ex){
            System.out.println("Khong the ghi File!!!");
        }
    }
}
