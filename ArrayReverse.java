import java.util.Scanner;
public class ArrayReverse
{
    public static void main(String[] args)
    {
        int i,j;
    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        for(i=0;i<arr.length;i++)
        {
            System.out.print("Enter value : ");
            arr[i]=sc.nextInt();
        }
        
        int s=0;
        int e=n-1;
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            
        s++;
        e--;
        }
        for(j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }

}
