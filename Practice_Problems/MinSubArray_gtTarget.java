import java.util.*;
public class MinSubArray_gtTarget{
    public static void main(String[] args){
int n=5;
int a[]={1,2,3,4,5};
int target=11;
int curSum=0;
int left=0;
int minlen=Integer.MAX_VALUE;
for(int right=0;right<n;right++){
    curSum+=a[right];
    while(left<n && curSum>=target){
minlen=Math.min(minlen,right-left+1);
curSum=curSum-a[left];
left++;
    }

}
System.out.print("The minimum length subarray with sum >= target is " + minlen);
}
}