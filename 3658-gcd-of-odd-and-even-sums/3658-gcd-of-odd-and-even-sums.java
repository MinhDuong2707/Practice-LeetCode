class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        int odd=1;
        int even=2;
        int result=0;
        int i=0;
        if(n!=0){
            while(i<n){
                sumOdd+=odd;
                odd+=2;
                sumEven+=even;
                even+=2;
                i++;
            }
            int a= sumOdd;
            while(a>0){
                if(sumEven%a==0&&sumOdd%a==0){
                    result=a;
                    break;
                }
                a--;
            }
        }
        return result;
    }
}