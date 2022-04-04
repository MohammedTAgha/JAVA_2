package Ass1;

public class Q_5 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j ++){
                if(i==0 || i == rows-1){
                    System.out.print('*');
                }else{
                    if(j==0 || j == rows-1) {
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
