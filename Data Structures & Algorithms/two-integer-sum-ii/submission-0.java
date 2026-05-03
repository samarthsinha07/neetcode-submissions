class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int i=0;
       int j=numbers.length-1;
       while(i<j){
        int sum=numbers[i]+numbers[j];
        if(sum>target){//if ye sum >target
        j=j-1;//then uss j ko avoid karke peeche jao 
       }else if(sum<target){//if sum<target
        i=i+1;//then also uss start wale numbers ko avoid karo because wo pair me aake bhi target jitna nahi ho payega 
       }else{
        return new int[]{// after all condition when nothing left then just return the 1 indexed numbers 
            i+1,j+1
        };
       }
       }
       return new int[]{
        -1,1 };
}
}
