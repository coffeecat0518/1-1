import java.util.Scanner;

public class one {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int i,max,min,num;
        max=-2147483648;
        min=2147483647;

        for (i=1;i<=10;i++){
            num=scn.nextInt();
            if (num>max){
                max=num;
            }
             if (num<min){
               min=num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
