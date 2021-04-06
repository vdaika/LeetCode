class Solution {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val size1 = nums1.size
        val size2 = nums2.size
        when {
            size1 == 0 -> {
                return if (size2 % 2 == 0) ((nums2[size2 / 2 - 1] + nums2[size2 / 2]) / 2.0f).toDouble()
                else nums2[size2 / 2].toDouble()
            }
            size2 == 0 -> {
                return if (size1 % 2 == 0) ((nums1[size1 / 2 - 1] + nums1[size1 / 2]) / 2.0f).toDouble()
                else nums1[size1 / 2].toDouble()
            }
            else -> {
                val nums = IntArray(size1 + size2)
                val size = size1 + size2
                for (i in 0 until size1) {
                    nums[i] = nums1[i]
                }
                for (i in 0 until size2) {
                    nums[size1 + i] = nums2[i]
                }


                insertionSort(nums)

                return if (size % 2 == 0) ((nums[size / 2 - 1] + nums[size / 2]) / 2.0f).toDouble()
                else nums[size / 2].toDouble()
            }
        }
    }

    private fun insertionSort(arr : IntArray) {
        val size = arr.size
        for (i in 1 until size) {
            if (arr[i] < arr[i - 1]) {
                var j = i
                while (j > 0 && arr[j] < arr[j - 1]) {
                    val tmp = arr[j]
                    arr[j] = arr[j - 1]
                    arr[j - 1] = tmp
                    j--
                }
            }
        }
    }

}