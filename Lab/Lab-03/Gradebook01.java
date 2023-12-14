class Gradebook01 {
    public static void main(String[] args){
        

        double[] grades = new double[args.length];
        
        for(int grade = 0; grade < grades.length; grade++) {
            System.out.printf("grades[%d]:- %f\n", grade, args[grade]);
        }
    }
}