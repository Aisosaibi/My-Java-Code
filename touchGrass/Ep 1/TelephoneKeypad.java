/* ask the user enter one letter
if the letter is not valid, print "invalid input"
otherwise
    check which group the letter belongs to
    2 = a,b,c | 3 = d,e,f | 4 = g,h,i | 5 = j,k,l
    6 = m,n,o | 7 = p,q,r,s | 8 = t,u,v | 9 = w,x,y,z
    print the corresponding number */

import java.util.Scanner;

public class TelephoneKeypad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().toLowerCase().charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input");
        } else if (letter >= 'a' && letter <= 'c') {
            System.out.println(2);
        } else if (letter >= 'd' && letter <= 'f') {
            System.out.println(3);
        } else if (letter >= 'g' && letter <= 'i') {
            System.out.println(4);
        } else if (letter >= 'j' && letter <= 'l') {
            System.out.println(5);
        } else if (letter >= 'm' && letter <= 'o') {
            System.out.println(6);
        } else if (letter >= 'p' && letter <= 's') {
            System.out.println(7);
        } else if (letter >= 't' && letter <= 'v') {
            System.out.println(9);
        } else {
            System.out.println(9);
        }
    }
}
