class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] dis = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            dis[nums[i] - 1] = 1;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < dis.length; i++){
            if(dis[i] == 0){
                list.add(i + 1);
            }
        }

        return(list);
    }
}
