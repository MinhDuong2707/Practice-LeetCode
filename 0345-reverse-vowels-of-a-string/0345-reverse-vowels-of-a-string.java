class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            while("ueoai".indexOf(Character.toLowerCase(arr[i]))==-1&&i<j){
                i++;
            }
            while("ueoai".indexOf(Character.toLowerCase(arr[j]))==-1&&j>i){
                j--;
            }
            char key= arr[i];
            arr[i]=arr[j];
            arr[j]=key;
            i++;
            j--;
        }
        s=new String(arr);
        return s;
    }
}