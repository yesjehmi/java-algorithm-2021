import java.util.Scanner;

public class FindString {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input1 = "";

        do {
            input1 = in.nextLine();

        } while (input1.length() > 100);

        String input2 = in.nextLine().toLowerCase();
        char compareChar = input2.charAt(0);

        int count = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (input1.toLowerCase().charAt(i) == compareChar) {
                count++;
            }
        }

        System.out.println(count);
    }
}
