import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WizZo on 19.09.2017.
 */
public class FileReader {
    public ArrayList<String> reading(String inputPath) {
        ArrayList<String> list = new ArrayList<>();
        try (InputStreamReader reader = new InputStreamReader(new BufferedInputStream(new FileInputStream(inputPath)))){
            StringBuilder buffer = new StringBuilder();
            while (true){
                int value = reader.read();
                if(value == -1){

                    break;
                }
                char c = (char)value;
                if(c != ' ' ){
                    buffer.append(c);
                } else {
                    addWord(buffer, list);
                }
            }
            addWord(buffer, list);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден. Укажите корректное имя файла");
            throw  new RuntimeException();
        } catch (IOException e) {
            System.out.println("Ошибка. Проверьте корректность указанных параметров");
            throw  new RuntimeException();

        }
        return list;
    }


    public void addWord(StringBuilder buffer, List<String> list){
        if(buffer.length() == 0){
            return;
        }
        String word = buffer.toString();
        list.add(word);
        buffer.setLength(0);
    }
}
