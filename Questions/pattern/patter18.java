import java.util.*;
public class patter18 {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1, nspaces = 0,  nstars = n;
        while(row <= n){
            //spaces 
            for(int i=1; i<= nspaces; i++){
                System.out.print("  ");
            }            
            for(int i=1; i <= nstars; i++){
                if(row > 1 && row <= n/2){
                    if(i == 1 || i == nstars){
                        //print spaces not stars
                        System.out.println("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    System.out.print("* ");
                }
                
            }
            row++;
            System.out.println();
            if(row <= n/2 + 1){
                nspaces = nspaces + 1;
                nstars = nstars -2;
            }else{
                nspaces = nspaces - 1;
                nstars = nstars + 2;   
            }
        }
        scn.close();
    }
}
