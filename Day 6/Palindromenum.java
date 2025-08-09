import java.util.*;
public class Palindromenum{
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int original = n;
    int reversed = 0;
    int temp = Math.abs(n);

    while(temp>0){
        int digit = temp%10;
        reversed = reversed*10+digit;
        temp/=10;
    }

    if(original == reversed){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a palindrome");
    }
    scan.close();
}

}