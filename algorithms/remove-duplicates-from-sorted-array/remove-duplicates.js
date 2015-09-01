// Source: https://leetcode.com/submissions/detail/38380696/
// Author: Feng Yu
// Data: 2015-09-01

/**********************************************************************************************
 *
 * Given a sorted array, remove the duplicates in place 
 * such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * For example, Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
 * It doesn't matter what you leave beyond the new length.
 * 
 ***********************************************************************************************/

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
  if (!nums.length) return 0;
    
  var idx = 1;
  for (var i = 1, len = nums.length; i < len; i++) {
    if (nums[i] !== nums[i - 1]) {
      nums[idx++] = nums[i];
    }
  }
  nums.splice(idx);
    
  return nums.length;
};
