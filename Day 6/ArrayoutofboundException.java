import java.util.Scanner;


public class ArrayoutofboundException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int n = scan.nextInt();
            int arr[]=new int[n];
            for(int i =0 ;i<n;i++){
                arr[i]=scan.nextInt();
            }
            System.out.println("Output below:");
            for(int i=0;i<=n;i++){
                System.out.print(arr[i]+" ");
            }
        }
            catch(ArithmeticException e){
                System.out.println("Arithmetuc exception");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index out of Bound exception"+e.getMessage());
            }
            finally{
                System.out.println("Program Done!");
            }
            scan.close();
        }
    }

