class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result: IntArray? = null
        val lastIndex = nums.size - 1

        (0..lastIndex - 1).forEach { firstIndex ->
            (firstIndex + 1..lastIndex).forEach { secondIndex ->
                if (nums[firstIndex] + nums[secondIndex] == target) {
                    result = intArrayOf(firstIndex, secondIndex)
                }
            }
        }

        return result!!
    }
}
