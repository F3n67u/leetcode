// Source: https://leetcode.com/problems/implement-strstr/
// Author: Feng Yu
// Date: 2015-08-29


/*****************************************************************************************
 *
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 *****************************************************************************************/
 
/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
   return haystack.indexOf(needle); 
};
