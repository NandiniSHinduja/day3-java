import java.util.*;
public class largestsmallest{
    public static void main(String[] args) {
        System.out.println("Largest and Smallest");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements required:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int A[]=new int[n];      
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int largest=A[0];
        int smallest=A[0];
        for(int i=0;i<n;i++){
            if(largest<A[i]){
                largest=A[i];
            }
            if(smallest>A[i]){
                smallest=A[i];
            }
        }
        System.out.println("The largest element in the array is " +largest);
        System.out.println("The smallest element in the array is " +smallest);
        sc.close();

    }
}
