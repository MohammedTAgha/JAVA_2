package Ass1;

public class Q_6 {
    public static void main(String[] args) {
        int [] test ={1  ,2 ,3,3} ;
        System.out.println( isRepeted(test , 1));
    }
    public static boolean isRepeted(int array[], int x){
        for(int i = 0; i < array.length;i++){
            for (int j = 0; j < array.length;j++){
                if (j == i){continue;}
                if (array[i]==array[j]){
                    System.out.println(array[i]+" is repetrd");
                    return true;
                }
            }

        }
        return false;
    }
}
