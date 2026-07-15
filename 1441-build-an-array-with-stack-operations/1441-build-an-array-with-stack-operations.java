class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> arr = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int i=0;
        int k=0;
        while(n>0){
            stack.push(n);
            n--;
        }
        while(i<target.length){
            if(target[i]==stack.peek()){
                arr.add("Push");
                stack.pop();
                i++;
            }else{
                arr.add("Push");
                arr.add("Pop");
                stack.pop();
            }
        }
        return arr;
    }
}