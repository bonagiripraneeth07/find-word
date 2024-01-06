import java.util.Scanner;

public class findword {
    void find() {
        String temp = " ";
        String finalword = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence  to display the second-to-last word of the sentence ");
        String word = scan.nextLine();
        for (int i = word.length() - 1; i <= word.length(); i--) {

            char c = word.charAt(i);
            int pos = i;

            if (c == ' ') {

                for (int j = i - 1; j < i; j--) {

                    temp = temp + String.valueOf(word.charAt(j));

                    char c2 = word.charAt(j);
                    if (c2 == ' ') {

                        System.out.println();
                        break;
                    }
                    if (j == 0) {
                        break;
                    }
                }
                break;
            }

            if (i == 1) {
                break;
            }
        }
        for (int k = temp.length() - 1; k >= 0; k--) {

            finalword = finalword + String.valueOf(temp.charAt(k));

        }
        System.out.println(finalword);
        System.out.println("Press 1 to Retry");
        Scanner scaner = new Scanner(System.in);
        int sc_Option = scaner.nextInt();
        if (sc_Option == 1) {
            find();
        }
    }

    public static void main(String[] args) {
        findword f = new findword();
        f.find();
    }
}
