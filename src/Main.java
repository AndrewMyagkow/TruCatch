import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       try {
           Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();
           String[] words = str.split(" ");

           int y;
           int x;
           try {
               x = Integer.parseInt(words[2]);
               y = Integer.parseInt(words[0]);
           } catch (Exception ex) {
               throw new Exception("Error! Not number");
           }


           if ((y == 0) && (words[1].equals("/"))) {
               throw new Exception("Error! Division by zero");

           }

           if ((!words[1].equals("+"))&(!words[1].equals("-"))&(!words[1].equals("*"))&(!words[1].equals("/")))
           {
               throw  new Exception("Operation Error!" );
           }
            double y1 = y;
           double x1 = x;
           if(words[1].equals("+"))
           {
               System.out.println(y1+x1);
           }
           if(words[1].equals("-"))
           {
               System.out.println(y1-x1);
           }
           if(words[1].equals("*"))
           {
               System.out.println(y1*x1);
           }
           if(words[1].equals("/"))
           {
               System.out.println(y1/x1);

           }


       }
       catch (Exception ex)
       {
           System.out.println(ex.getMessage());
       }

       }
}