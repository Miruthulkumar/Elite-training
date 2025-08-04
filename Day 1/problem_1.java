import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = scan.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = scan.nextInt();

        int inner_length = length-4;
        int inner_breadth = breadth-4;

        int outer_area = length*breadth;
        int inner_area = inner_length*inner_breadth;

        int final_area= outer_area - inner_area;
        System.out.println("Area of pavement is : "+ final_area);

        scan.close();
    }
}
