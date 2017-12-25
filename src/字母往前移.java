import java.util.Scanner;

public class 字母往前移 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine(),newStr="";
        char ch;
        int key=scn.nextInt(),strLeng=str.length();

        for (int i=0;i<strLeng;i++){
            ch=(char)((int)str.charAt(i)-key);
            //-是往前移，+是往後移。
            newStr=newStr+Character.toString(ch);
        }
        System.out.println(newStr);
    }
}
