import java.util.*;
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
      while(num!=0){
        if( num % 2 == 0){
            num=num/2;
           
        }
        else if( num %2!=0){
            num=num-1;
           
        }
         count++;
      }
      return count;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
int result=new Solution().numberOfSteps(num);
System.out.println(result);
    }
}