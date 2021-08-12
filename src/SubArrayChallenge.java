import java.util.Arrays;
import java.util.Scanner;



public class SubArrayChallenge {
    static int pow(int n, int value){
        int result=1;
        for(int i=0; i<value;i++){
            result*=n;
        }
        return result;
    }
    static int sum(int[] arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    }
    static boolean isRange(int[] arr){
        for(int i: arr){
            if((i<=(-10000))&&(i>=10000)){
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        
        int[] arr= new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        if((isRange(arr))&&(n>=1)&&(n<=100)){
             int count=0;
             
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i<=j){
                    int[] subArray= Arrays.copyOfRange(arr, i, j+1);
                if(sum(subArray)<0){
                    count++;
                }
                }
                
                
            }
        }
        System.out.println(count);
        }
}        
}
