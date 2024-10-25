import java.util.*;

public class NumberRotation {
    void rotate(double number, int term){
        double devisor = Math.pow(10, term);
        // number = 1245856
        // term = 3
        double remainder= 0, temp = number;  
        int loop = 0;
        while (loop == 0) {
            number = (int)(number/devisor); //first section
            remainder = (int)temp%devisor; //last section
            loop++;
        }
        System.out.println("Main Num: "+number+" \nLast num : "+ remainder);
        int count = 0;
        int temp1 = (int)number;
        while (temp1 != 0) {
            temp1 = temp1/10;
            count++;
        }
        System.out.println("count: "+count);
        remainder = remainder*Math.pow(10, count);
        System.out.println("remaisder after pow : "+remainder);
        System.out.println("Final Number after rotaion is : "+ (long)(remainder+number));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number  = sc.nextInt();

        System.out.println("Enter number of terms :  ");
        int terms = sc.nextInt();

        //calling the function
        NumberRotation nt = new NumberRotation();
        nt.rotate(number, terms);
        
    }
}






