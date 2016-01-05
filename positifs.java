import java.util.*;
class positifs {
    
    public static void main(String[] args) {
        
        int[][] array = {{19,-18,12,7,16},{3,7,5,9,1},{20,16,14,20,11},{10,9,8,7,6},{14,12,3,19,5},{1,2,3,0,4}};      //Declare array
        
        checkAllPositive(array);
    }
    
    public static void checkAllPositive(int[][] a) {
        
        boolean neg = false;
        
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                while (neg==false) {
                    if (a[i][j]<0) {
                        System.out.println("The array contains at least one negative integer.");
                        neg = true;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        
        if (neg==false) {
            System.out.println("The array does not contain any negative integers.");
        }

    }
    
}