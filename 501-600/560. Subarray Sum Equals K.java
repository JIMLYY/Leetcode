// 1
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int start = 0; start<nums.length; start++){
            for(int end=start + 1; end<=nums.length; end++){
                int total = 0;
                for(int i = start; i < end; i++ )
                    total += nums[i];
                if(total == k)
                    count++;
            }
        }
        return count;
    }
}

// 2
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int [] sum = new int [nums.length + 1];
        sum[0] = 0;
        for(int i = 1; i <= nums.length; i++)
            sum[i] = sum[i-1] + nums[i-1];
        for(int start = 0; start < nums.length; start++){
            for(int end = start+1; end <=nums.length;end++){
                if(sum[end]-sum[start] == k)
                    count ++;
            }
        }
        return count;
    }
}


// 3
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for(int start = 0; start<nums.length;start++){
            sum = 0;
            for(int end = start; end<nums.length;end++){
                sum += nums[end];
            if(sum == k)
                count ++;
            }
        }
        return count;
    }
}


//4
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i < nums.length; i++){
            sum += nums[i];
            if (map.containsKey(sum-k))
                count += map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}

/*
Topic: Hash table
Method 1: First, I tried simplest brute force solution, which is to check the sum
of every possible subarray of the given nums array. The time complexity is O(n**3).
This brute force solution exceeded Time limit.
TC: O(n**3) SC: O(1)

Method 2: Using Cummulative sum: this method is litte faster then brute force.
Bascially, what we optimize is using a array to store the cumulative sum of nums
array upto the element corresponding to the (i-1)th index. Then, iterate the every
possible subarray.
TC: O(n**2) SC: O(n)


Methdd 3: The idea is same as before with a slight modification. We can  find
the sum on the go while considering different end points.
TC: O(n**2) SC: O(1)

Method 4: Hash table
Here, we used a hash table to store the cumulative sum upto all the indices
possible along with the number of times the same sum occurs. We also determine
umber of times the sum−k has occured alread, then add to the count.
Eventually, return the count
TC: O(n) SC: O(n)

reference: leetcode solution
*/
