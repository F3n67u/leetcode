// Source: https://leetcode.com/problems/remove-element/
// Author: Feng Yu
// Date: 2015-08-29

/*************************************************************************************************
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 *************************************************************************************************/
 
/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    var i = nums.length;
    while (i--) {
        if (nums[i] === val)  nums.splice(i, 1);
    }
    
    return nums.length;
};
 
 
