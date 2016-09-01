
package laboratory;

import java.util.Scanner;


public class Laboratory {

    
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       System.out.println("Input strings: ");
       String str = reader.nextLine();
       
       for (int i = 0; i < str.length(); i++)
       {
           switch (str.charAt(i))
           {
               case '+':
                    System.out.println("Token: +   Type: PLUS");
                    break;
               case '-':
                    System.out.println("Token: -   Type: minus");
                    break;
               case '*':
                    System.out.println("Token: *   Type: times");
                    break;
               case '/':
                    System.out.println("Token: /   Type: divide");
                    break;
               case '(':
                    System.out.println("Token: (   Type: LPAR");
                    break;
               case ')':
                    System.out.println("Token: )   Type: RPAR");
                    break;
               case '=':
                    System.out.println("Token: =   Type: Equals");
                    break;
               case ';':
                    System.out.println("Token: ;   Type: End");
                    break;
               case '0':
                    System.out.println("Token: 0   Type: NUM");
                    break;
               case '1':
                    System.out.println("Token: 1   Type: NUM");
                    break;
               case '2':
                    System.out.println("Token: 2   Type: NUM");
                    break;
               case '3':
                    System.out.println("Token: 3   Type: NUM");
                    break;
               case '4':
                    System.out.println("Token: 4   Type: NUM");
                    break;
               case '5':
                    System.out.println("Token: 5   Type: NUM");
                    break;
               case '6':
                    System.out.println("Token: 6   Type: NUM");
                    break;
               case '7':
                    System.out.println("Token: 7   Type: NUM");
                    break;
               case '8':
                    System.out.println("Token: 8   Type: NUM");
                    break;
               case '9':
                    System.out.println("Token: 9   Type: NUM");
                    break;
                
           
           }
       }
           
    }
    
}
