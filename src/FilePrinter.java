import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by WizZo on 20.09.2017.
 */
public class FilePrinter {
    public void write(String outputPath, ArrayList<Object> list){
        try(OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outputPath))){
            for(Object s : list){
                writer.write(s.toString());
                writer.write("\n");
            }

        } catch (IOException e) {
            System.out.println("Ошибка. Проверьте корректность ввода данных");
            throw new RuntimeException();
        }
    }
}
