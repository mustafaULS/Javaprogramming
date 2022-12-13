package day03_EscapeSequences;
/*
escapes sequence :1 every single escape sequences start with back slash \
                  2 every single escape sequences has to given in double quote ""

\n:(back slash n)   is for starting a new line
\t:(horizontal tab) start with paragraph space
\\:( double backslash) is for print single backslash. how many you want x2
\":(double quote) is using for write "" double quote
 */
public class EscapesSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("--------------------------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("--------------------------------------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("--------------------------------------------------------");

        System.out.println("/ \\"); // in order to print one backward slash we need to give two backward slashes

        System.out.println("--------------------------------------------------------");

        System.out.println("My favorite TV show is \"Game Of Throne\""); // in order to print double quote, we need to use \"



    }


}
