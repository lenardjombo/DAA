public class BadAlgorithm{
public static void main(String[] args) {
    System.out.println(calculate_sum());
}
public static long calculate_sum(){
    long  sum = 0;
    for(int i = 1; i < 1000000000;i++){
        sum+=i;
    }
    return sum;
}
}

/*Bad Algorithm
 * 1.start
 * 2.Initialize variable sum to 0
 * 3.Enter the loop that iterates from 1 to 10^9
 * 4.Repeat steps 4 & 5
 * 5.Return the value of the item
 * 6.stop
 */