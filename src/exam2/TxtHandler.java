package exam2;

import java.io.*;

public class TxtHandler {
    private final File file;

    public TxtHandler(File file) {
        this.file = file;
    }

    public void writeToFile(int index) {
        try (PrintWriter printWriter = new PrintWriter(file)){
            printWriter.println(index);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
    }

    public String readFromFile() {
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("t.txt"));
            while ((line = bufferedReader.readLine()) != null) return line;

        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }
        return null;
    }
}