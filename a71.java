import java.util.*;
class Pattern13{
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j<=3-i+1){
                    System.out.print("   " );
                }
                else{
                    System.out.print(" * ");
                }               
            }
            System.out.println();
        }
    }

}

