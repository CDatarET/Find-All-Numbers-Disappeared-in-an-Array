class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> dis(nums.size(), 0);
        for(int i = 0; i < nums.size(); i++) {
            dis[nums[i] - 1] = 1;
        }
        vector<int> result;
        for(int i = 0; i < dis.size(); i++) {
            if(dis[i] == 0) {
                result.push_back(i + 1);
            }
        }
        return result;
    }
};
