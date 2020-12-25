import java.util.*;
public class ascending {
    public static void main(String[] args) {
        System.out.println("Ascending.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements required:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(A[i]>A[j]){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.println("The elements in ascending order are:");
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
        sc.close();
    }
    
}
