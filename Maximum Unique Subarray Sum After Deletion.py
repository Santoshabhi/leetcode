class Solution:
    def maxSum(self, nums: List[int]) -> int:
        nums=list(set(nums))
        s=[]
        k=[]
        for i in nums:
            if i<0:
                s.append(i)
            else:
                k.append(i)
        if(len(k)!=0):
            return sum(k)
        else:
            s=sorted(s)
            return s[-1]
