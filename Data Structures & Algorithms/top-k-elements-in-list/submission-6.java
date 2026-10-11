

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        map.forEach((key, value) -> {
            if (buckets[value] == null)
                buckets[value] = new ArrayList<>();

            buckets[value].add(key);
        });

        List<Integer> result = new ArrayList<>();

        for (int i = buckets.length - 1; i > 0 && result.size() < k; i--) {
            if (buckets[i] != null)
                result.addAll(buckets[i]);
        }

        return result.stream()
                     .limit(k)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}