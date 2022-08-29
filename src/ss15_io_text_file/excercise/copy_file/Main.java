package ss15_io_text_file.excercise.copy_file;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadWriteFile rf = new ReadWriteFile();
        List<String> read = rf.readFile("src\\ss15_io_text_file\\excercise\\Main.txt");
        for (String o : read) {
            rf.writeFile("\"src\\ss15_io_text_file\\excercise\\CopyFile.txt",o);
        }
    }
}
