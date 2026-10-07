class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones=0,zeroes=0;
        for(int i:students){
            if(i==1) ones++;
            else zeroes++;
        }
        for(int i:sandwiches){
           if(i==1){
            if(ones==0) break;
            else ones--;
           }
           if(i==0){
            if(zeroes==0) break;
            else zeroes--;
           }
        }
        return ones+zeroes;
    }
}