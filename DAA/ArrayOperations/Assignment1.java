package ArrayOperations;
public class Assignment1 {
    public static void main(String[] args) {
       calculateAge();
    }
    static void calculateAge(){
    String [] names = {"John","james","VIctoria"};
    int[] YearOfBirth = {2003,2002,2005};
    //traversal
    for(int i = 0;i<YearOfBirth.length;i++){
        int currentAge = 2024-YearOfBirth[i];
        System.out.println(names[i]+" is "+currentAge+" years old");
    }
    }
}
