/*Having crossed the three-headed faun, Harry, Dumbledore, and Snape went through a secret trap door in search of the Sorcerer's tomb. On the way, they passed through a room and found that the room has only one door opposite to them, and the door through which they entered shut once they entered the room. The door was very large with a four-digit number imprinted on it. When Harry and Dumbledore tried to open it by casting out spells, it didn't open. Having tried various spells, both got fed up and left the task to Snape. Snape curiously observing the room found that a statement was written on the top of the room. It was written as follows "I will be always four" “I can only be opened when you add my first and last digit and enter it” and “If you find a sign, you should not consider it” help Snape break the code and open the door so that they can save the Sorcerer's tomb.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   int d;
        Scanner s=new Scanner(System.in);
        d=s.nextInt();
        if(d<0){
            d=d*(-1);
        int f,l;
        f=d%10;
        l=d/1000;
        System.out.println(f+l);
        }else{
            int f,l;
        f=d%10;
        l=d/1000;
        System.out.println(f+l); 
        }
    }
}
