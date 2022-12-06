
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class Main {
    public static void main(String[] args) {

            try {
                File file = new File("D:\\hel.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                String str = null;
                while ((line = br.readLine()) != null) {
                    str = line;
                }
                int y;
                int x;
                assert str != null;
                String[] words = str.split(" ");
                try {
                    x = Integer.parseInt(words[2]);
                    y = Integer.parseInt(words[0]);
                } catch (Exception ex) {
                    throw new Exception("Error! Not number");
                }
                if ((!words[1].equals("+")) & (!words[1].equals("-")) & (!words[1].equals("*")) & (!words[1].equals("/"))) {
                    throw new Exception("Operation Error!");
                }

                if ((x == 0) && (words[1].equals("/"))) {
                    throw new Exception("Error! Division by zero");

                }


                double y1 = y;
                double x1 = x;
                if (words[1].equals("+")) {
                    System.out.println(y1 + x1);
                }
                if (words[1].equals("-")) {
                    System.out.println(y1 - x1);
                }
                if (words[1].equals("*")) {
                    System.out.println(y1 * x1);
                }
                if (words[1].equals("/")) {
                    System.out.println(y1 / x1);

                }


            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    }




