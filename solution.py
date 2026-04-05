class Solution:
    def findDisappearedNumbers(self, nums):
        dis = [0] * len(nums)
        for n in nums:
            dis[n - 1] = 1
        
        ret = []
        for i in range(len(dis)):
            if dis[i] == 0:
                ret.append(i + 1)
        
        return ret
