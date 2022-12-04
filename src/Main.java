import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       try {
           Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();
           String[] words = str.split(" ");

           int y = 0;
           int x = 0;
           try {
               x = Integer.parseInt(words[0]);
               y = Integer.parseInt(words[2]);
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
           if(words[1].equals("+"))
           {
               System.out.println(y+x);
           }
           if(words[1].equals("-"))
           {
               System.out.println(y-x);
           }
           if(words[1].equals("*"))
           {
               System.out.println(y*x);
           }
           if(words[1].equals("/"))
           {
               System.out.println(y/x);
           }


       }
       catch (Exception ex)
       {
           System.out.println(ex.getMessage());
       }

       }
}