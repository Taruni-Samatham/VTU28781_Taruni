import java.util.*;
public class input {
    public static void main(String[] args) {
        System.out.println("enter the age");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a>18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible for vote");
        }
    }
    
}
