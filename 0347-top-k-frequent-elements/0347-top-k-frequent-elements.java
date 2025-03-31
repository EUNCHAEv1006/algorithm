class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> B = new ArrayList<>(hashMap.entrySet());

        B.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = B.get(i).getKey();
        }
        
        return result;
    }
}