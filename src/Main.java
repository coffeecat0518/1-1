import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int h=scn.nextInt();
        int a=scn.nextInt();
        float sw=0.0f;

        if (a==1){
            sw=Math.round((h-80)*0.7f)*10/10f;
        }else {
            sw=Math.round((h-70)*0.6f)*10/10f;
        }
        System.out.println(sw);
    }
}
