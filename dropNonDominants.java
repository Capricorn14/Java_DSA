public class dropNonDominants{
    public static void printItems(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(i + " " + j);        //runs n * n times
            }
        }
        for(int k = 0; k < n; k++){
            System.out.println(k);                      //runs n times
        }
    }
    public static void main(String[] args){
        printItems(10);                             // in all runs n^2 + n times which is equal to n^2 times. That means we drop non dominant terms 
    }
}