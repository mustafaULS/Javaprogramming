package day09_IfStatement;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 6;
        String placeToGo;

        if (grade == 1) {
            placeToGo = "location -  Apple orchard\n"+"number of groups - 3\n"+"teacher in charge - Ms. Smith";
        } else if (grade==2) {
            placeToGo="location - Zoo\n"+"number of groups - 7\n"+"teacher in charge - Mr. Lee";
        } else if (grade==3) {
            placeToGo="location - Aquarium\n"+"number of groups - 5\n"+"teacher in charge - Ms. Wilson";
        } else if (grade==4) {
            placeToGo = "location - Movie theater\n"+"number of groups - 2\n"+"teacher in charge - Ms. Reyes";
        } else if (grade==5) {
            placeToGo="location - Museum\n"+"number of groups - 5\n"+"teacher in charge - Ms. Lela";
        }else {
            placeToGo = "location - Six Flags\n"+"number of groups - 8\n"+"teacher in charge - Mr. Watt";
        }
        System.out.println(placeToGo);
    }
}
