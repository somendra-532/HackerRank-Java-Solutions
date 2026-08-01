import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = 1;

        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(line + " " + s);
            line++;
        }

        sc.close();
    }
}
