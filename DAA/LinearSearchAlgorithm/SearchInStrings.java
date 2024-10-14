package LinearSearchAlgorithm;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Jombo";
        char target = 'J';
        System.out.println(search(name,target));
    }
    static boolean search(String str,char target){
        //check for length of the string
        if(str.length() == 0){
            return false;
        }

        //Iterate through the String
        for(int i = 0;i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        
        return false;
    }
}
