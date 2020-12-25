import java.util.*;
public class oddevenpos {
    public static void main(String[] args) {
        System.out.println("Odd Even Position");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements required: ");
        int n=sc.nextInt();
        int A[]=new int[n];
        int odd[]=new int[n];
        int even[]=new int[n];
        int e=0;
        int o=0;
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            System.out.println("Enter the " +i+ "th element:");
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[e++]=A[i];
            }
            else{
                odd[o++]=A[i];
            }
        }
        System.out.println("The elements with odd position are:");
        for(int i=0;i<n;i++){
            System.out.println(odd[i]);
        }
        System.out.println("The elements with even position are:");
        for(int i=0;i<n;i++){
            System.out.println(even[i]);
        }
        sc.close();


    }
    
}
