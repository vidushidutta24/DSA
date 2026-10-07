class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int num:nums){
            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1); 
        }
        for(int num:map.keySet()){
            if(map.get(num)>nums.length/3) list.add(num);
        }
        return list;
    }
}