import java.util.ArrayList;

/**
 * Created by WizZo on 19.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        String inputPath = args[0];
        String ouputPath = args[1];
        String typeAndDirection = args[2];


        FileReader fileReader = new FileReader();
        ArrayList<String> inputList = fileReader.reading(inputPath);

        FileSorter fileSorter = new FileSorter();
//        FilePrinter filePrinter = new FilePrinter();
        //ArrayList<Object> list = fileSorter.sortingIntAscending(inputList);

            System.out.println(inputList.size());
        }

//        switch (typeAndDirection){
//            case "-i-a":
//                list = fileSorter.sortingIntAscending(inputList);
//                break;
//            case "-i-d":
//                list = fileSorter.sortingStringDecrease(inputList);
//                break;
//            case "-s-a":
//                list = fileSorter.sortingStringAscending(inputList);
//                break;
//            case "-s-d":
//                list = fileSorter.sortingStringDecrease(inputList);
//                break;
//                default:
//                    System.out.println("Неверно указана команда выбора сортировки");
//        }

//        filePrinter.write(ouputPath, list);


    }

