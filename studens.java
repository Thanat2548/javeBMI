import java.io.*;
import java.lang.Integer;
public class studens {
public static void main(String args[]) throws IOException {
char answer;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader buffer = new BufferedReader(isr);
System.out.print("Enter A [Y] or [N] : ");
String input = buffer.readLine();
answer = (char)input.charAt(0);
        if (answer == 'Y' || answer == 'y') {
            System.out.print("You Enter Y\n");
        } else if (answer == 'N' || answer == 'n') {
            System.out.print("You Enter N\n");
        } else {
            System.out.print("Error ! \n");
        }
}
}