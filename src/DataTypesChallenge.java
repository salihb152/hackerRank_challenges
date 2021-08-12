import java.util.Scanner;

public class DataTypesChallenge {
    public static void main(String[] args) {
        int intMin= Integer.MIN_VALUE;
        int intMax= Integer.MAX_VALUE;
        byte byteMin= Byte.MIN_VALUE;
        byte byteMax= Byte.MAX_VALUE;
        short shortMax= Short.MAX_VALUE;
        short shortMin= Short.MIN_VALUE;
        long longMax= Long.MAX_VALUE;
        long longMin= Long.MIN_VALUE;

        
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter test number");
        int testCase= scanner.nextInt();

      
        for(int i =0; i<testCase; i++){
            try
            {
            System.out.println("Enter a number");
           long  a= scanner.nextLong();
            if(a<=byteMax&&a>=byteMin){
                System.out.println(a+ " can be fitted in:\n* byte\n* short\n* int\n* long");
            }else if(a<=shortMax&&a>=shortMin){
                System.out.println(a+ " can be fitted in:\n* short\n* int\n* long");

            } else if(a<=intMax&&a>=intMin){
                System.out.println(a+ " can be fitted in:\n* int\n* long");
            } else if(a<=longMax&&a>=longMin){
                    System.out.println(a+ " can be fitted in:\n* long");
            }
            } catch(Exception e)
            {
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }
        }
        scanner.close();

    }
}
