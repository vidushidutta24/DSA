class Solution {
    static int ncr(int n1,int n2){
        long num=1;
        for(int i=0;i<n2;i++){
            num=(num*(n1-i))/(i+1);
        }
        return (int)num;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<i;j++){
                temp.add(ncr(i-1,j));
            }
            ans.add(temp);
        }
        return ans;
    }
}