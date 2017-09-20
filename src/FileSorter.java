import java.util.ArrayList;

/**
 * Created by WizZo on 19.09.2017.
 */
public class FileSorter {
    public ArrayList<Object> sortingStringAscending(ArrayList<String> list){
       String[] mas = new String[list.size()];
       for(int i = 0; i < list.size(); i++){
           mas[i] = list.get(i);
       }
       for(int i = 1; i < mas.length;i++){
          String temp = mas[i];
          int j = i - 1;

          while(j >= 0 && mas[j].compareToIgnoreCase(temp) > 0){
              mas[j+1] = mas[j];
              j--;
          }
          mas[j+1] = temp;
       }
        ArrayList<Object> al = new ArrayList<>();
        for(int i = 0; i < mas.length; i++ ){
            al.add(mas[i]);
        }
        return al;
    }


    public ArrayList<Object> sortingStringDecrease(ArrayList<String> list){
        String[] mas = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            mas[i] = list.get(i);
        }
        for(int i = 1; i < mas.length;i++){
            String temp = mas[i];
            int j = i - 1;

            while(j >= 0 && mas[j].compareToIgnoreCase(temp) < 0){
                mas[j+1] = mas[j];
                j--;
            }
            mas[j+1] = temp;
        }
        ArrayList<Object> al = new ArrayList<>();
        for(int i = 0; i < mas.length; i++ ){
            al.add(mas[i]);
        }
        return al;
    }
    public ArrayList<Object> sortingIntAscending(ArrayList<String> list){
        int[] mas = new int[list.size()];
        try {
            for (int i = 0; i < list.size(); i++) {
                mas[i] = Integer.parseInt(list.get(i));
            }
        }catch (NumberFormatException e){
            System.out.println("В файле не числовые значения");
        }
        for(int i = 1; i < mas.length; i++){
            for(int j = i; j > 0 && mas[j-1] > mas[j]; j--){
                int temp = mas[j-1];
                mas[j-1] = mas[j];
                mas[j] = temp;
            }
        }
        ArrayList<Object> al = new ArrayList<>();
        for(int i = 0; i < mas.length; i++ ){
            al.add(mas[i]);
        }
        return al;
        }


    public ArrayList<Object> sortingIntDecrease(ArrayList<String> list){
        int[] mas = new int[list.size()];
        try {
            for (int i = 0; i < mas.length; i++) {
                mas[i] = Integer.parseInt(list.get(i));
            }
        }catch (NumberFormatException e) {
            System.out.println("В файле не числовые значения");
        }
        for(int i = 1; i < mas.length; i++){
            int key = mas[i];
            int j = i - 1;
                    while(j>=0 && mas[j] < key){
                    mas[j+1] = mas[j];
                    j--;
                    mas[j+1] = key;
                    }
        }
        ArrayList<Object> al = new ArrayList<>();
        for(int i = 0; i < mas.length; i++ ){
            al.add(mas[i]);
        }
        return al;
    }
}
