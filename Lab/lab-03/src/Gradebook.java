public class Gradebook {
    public static void main(String[] args) {
        double grades[] = {10.0 , 30.0 , 70.0};

        for (int counter = 0; counter <= grades.length; counter++) {
            System.out.printf("grade[%d] is:- %.2f", counter, grades[counter]);
        }
    }
}
