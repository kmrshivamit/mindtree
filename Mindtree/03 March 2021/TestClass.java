
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int arr[]=new int[n];
        int sum[]=new int[n-1];
        for(int p=0;p<arr.length;p++)
        arr[p]=s.nextInt();
int count=0;
        int i=0;
        int j=0;

        while(i!=arr.length)
        {  count=0;
            while(j!=arr.length)
            {
                if(j==i)
                {i++;
                continue;
                }
                count+=arr[j];

j++;
            }
            sum[i]=count;
            i++;
        }

        Arrays.sort(sum);
        System.out.println(sum[sum.length-1]);
        System.out.println(sum[0]);


    }
}
