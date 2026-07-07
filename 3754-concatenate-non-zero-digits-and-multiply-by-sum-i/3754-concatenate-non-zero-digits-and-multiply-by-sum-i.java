class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        long sum=0;
        String nums = "";
        int i=0;
        while(i<arr.length){
            if(arr[i]!='0'){
                nums+=String.valueOf(arr[i]);
                sum+=Long.parseLong(String.valueOf(arr[i]));
            }else if(n==0){
                nums="0";
                sum=0;
            }
            i++;
        }
        return sum*=Long.parseLong(nums);
    }
}