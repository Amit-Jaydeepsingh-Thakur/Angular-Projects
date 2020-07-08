Link-https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/bob-and-profit-fd9f0ee3/description/
import java.util.*;
import java.lang.*;

class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        long i=0,t=0,sum=0,max=0,k=0;
        int j=0,n=0,cnt=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextLong();
        for(i=0;i<t;i++)
        {
            max=0;
            sum=0;
            //cnt=0;
            n=sc.nextInt();
            long arr[];
            arr=new long[n];

            long p[];
            p=new long[n];

            for(j=0;j<n;j++)
            {
                arr[j]=sc.nextLong();
            }
            Arrays.sort(arr);
            for(j=0;j<n;j++)
            {
                if(j==0)
                {
                    p[j]=arr[j]*(-1);
                }
                else
                {
                    p[j]=arr[j]*(-1)+p[j-1];
                }
                
            }
            for(j=0;j<n;j++)
            {
                cnt=n-j;
                if(j==0)
                {
                    sum=(arr[j]*cnt);    
                }
                else
                {
                    sum=(arr[j]*cnt)+p[j-1];
                }
                
                if(sum>max)
                {
                    max=sum;
                }
            }
            System.out.println(max);
        }
    }
}
