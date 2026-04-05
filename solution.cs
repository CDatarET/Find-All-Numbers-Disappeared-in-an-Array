public class Solution {
    public IList<int> FindDisappearedNumbers(int[] nums) {
        int[] dis = new int[nums.Length];
        for(int i = 0; i < nums.Length; i++) dis[nums[i] - 1] = 1;
        
        List<int> list = new List<int>();
        for(int i = 0; i < dis.Length; i++){
            if(dis[i] == 0) list.Add(i + 1);
        }

        return(list);
    }
}
