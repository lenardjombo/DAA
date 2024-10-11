public class GoodAlgorithm {
    public static void main(String[] args) {
        System.out.println(calculate_sum());
    }
    public static long calculate_sum(){
        long  n = 1000000000;
        long sum = (n*(n+1))/2;
        return sum;
    }
}
/*Good Algorithm
 * 1.start
 * 2.Initialize n to 10^9
 * 3.Calculate the sun using the formualaw
 *      sum = n(n+1)/2
 * 4.Output the value of sum
 * 5.stop
 */