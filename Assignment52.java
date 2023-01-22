package assignment52;
import java.util.Scanner;

public class Assignment52 {
    
    public static int digitPicker(String number, int total, int charCount){
        if(charCount<number.length()){
            total+=Integer.parseInt(number.substring(charCount,charCount+1));
            charCount++;
            return digitPicker(number,total,charCount);
        }
        else return(total);
    }

    public static void main(String[] args) {
        Scanner noahSeer=new Scanner(System.in);
        System.out.println("Enter a number");
        String number=noahSeer.next(); int total=0,charCount=0,total2;
        total2=digitPicker(number,total,charCount);
        System.out.println("The total of all the digits is "+total2);
    }   
}