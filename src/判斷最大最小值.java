import java.util.Scanner;

public class 判斷最大最小值 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        float num,max=Float.MIN_NORMAL,min=Float.MAX_VALUE;

        for (int i=1;i<=10;i++){
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
