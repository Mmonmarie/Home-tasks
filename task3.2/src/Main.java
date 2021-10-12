import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<Integer> parseNumbers (String args) throws IncorrectException {
        String[] num = args.split(" ");
        ArrayList<Integer> result_list = new ArrayList<Integer>();
        if (num.length != 20) throw new IncorrectException("Numbers count in sequence doesnt match 20: " + args);
        for(int it = 0; it < num.length; ++it) {
            try {
                result_list.add(Integer.parseInt(num[it]));
            } catch (NumberFormatException ex) {
                throw new IncorrectException("Invalid number in sequence:  " + args);
            }
        }

        return result_list;


    }
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> num3 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> numOther = new ArrayList<>();
        List<Integer> num = new ArrayList<>();


        String line = (new Scanner(System.in)).nextLine();
        ArrayList<Integer> input_res = parseNumbers(line);
        printList(input_res);


        for (int i = 0; i < 20; ++i){
                if (input_res.get(i) % 3 == 0) {
                    num3.add(input_res.get(i));
                }
                if (input_res.get(i) % 2 == 0) {
                    num2.add(input_res.get(i));
                    continue;
                }
                numOther.add(input_res.get(i));
        }

        printList(num3);
        printList(num2);
        printList(numOther);
    }



    public static void printList(ArrayList<Integer> list) {
        for (Integer x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
