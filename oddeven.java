import java.util.*;
public class oddeven{
    public static void main(String[] args) {
        System.out.println("Odd Even");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements needed in the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+i+ "th element ");
            A[i]=sc.nextInt();
        }
        int odd[]=new int[n];
        int even[]=new int[n];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                even[e++]=A[i];
            }
            else{
                odd[o++]=A[i];
            }
        }
        System.out.println("These are the even numbers");
        for(int i=0;i<n;i++){
            System.out.println(even[i]);
        }
        System.out.println("These are the odd numbers");
        for(int i=0;i<n;i++){
            System.out.println(odd[i]);
        }
        sc.close();


    }
}