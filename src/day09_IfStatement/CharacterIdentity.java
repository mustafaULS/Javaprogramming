package day09_IfStatement;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = 'a';
        String result="";

        if (ch >= '0' && ch <= '9') {
            result = "digit";
        } else if ((ch >= 'A' && ch <= 'Z') ||(ch >= 'a' && ch <= 'z') ){
            result = "Alphabetic";
        }else{
            result = "special character";
        }
        System.out.println(result);
    }
}
