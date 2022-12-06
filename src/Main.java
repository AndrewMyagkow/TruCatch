
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


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
                double z = 0;
                if (words[1].equals("+")) {
                    z = y1 + x1;
                    System.out.println(z);
                }
                if (words[1].equals("-")) {
                    z = y1 - x1;
                    System.out.println(z);
                }
                if (words[1].equals("*")) {
                    z = y1 * x1;
                    System.out.println(z);
                }
                if (words[1].equals("/")) {
                    z = y1 / x1;
                    System.out.println(z);

                }
                String answer = Double.toString(z);
                FileWriter writer = new FileWriter("D:\\answer.txt", false);
                writer.write(answer);
                writer.append('\n');
                writer.flush();

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    }




