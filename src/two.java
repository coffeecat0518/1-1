import java.util.Scanner;

public class two {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine(),newStr="";
        char ch;
        int key=scn.nextInt(),strLeng=str.length();

        for (int i=0;i<strLeng;i++){
            ch=(char)((int)str.charAt(i)-key);
            newStr=newStr+Character.toString(ch);
        }
        System.out.println(newStr);
    }
}
