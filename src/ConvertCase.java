import java.util.Scanner;

public class ConvertCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = "";

        do {
            input = in.nextLine();

        } while (input.length() > 100);

        int inputSize = input.length();

        StringBuffer result = new StringBuffer();

        for (int i=0; i<inputSize; i++) {

            char cursor = input.charAt(i);

            if (Character.isLowerCase(cursor)) {
                result.append(String.valueOf(cursor).toUpperCase());
            } else {
                result.append(String.valueOf(cursor).toLowerCase());
            }
        }

        System.out.println(result.toString());
    }
}
