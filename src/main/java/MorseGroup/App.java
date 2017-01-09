package MorseGroup;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Morse code - input text:" );
        Scanner input = new Scanner(System.in);
        new Code(input);
        new Decode();
        new ToFile;
    }

}
