public class differentInputs {
    public static void printItems(int a, int b){
        for(int i = 0; i < a; i++){
            System.out.println(a);
        }
        for(int j = 0; j < b; j++){
            System.out.println(b);
        }
    }
    public static void main(String[] args){
        printItems(10, 5);                      // O(a + b)
    }
}
