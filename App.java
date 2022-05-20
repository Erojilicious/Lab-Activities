public class App {
    /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */


    /**
     * 
     * Create method that returns the greater integer value
     */
    public static int greaterIntValue(int a, int b){
        if(a>b)
            return a;
        else
            return b;
        
    }
    

    /**
     * 
     * Create method that returns the greater double value
     */
    public static double greaterDoubleValue(double a, double b){
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method call that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println(sum3(30,30,40));
        System.out.println(sum2(30, 40));
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + greaterIntValue(45,100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterDoubleValue(3.14,9.8));

    }
}