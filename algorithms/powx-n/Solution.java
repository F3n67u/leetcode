// Source: https://leetcode.com/problems/powx-n/

// Implement pow(x, n).

public class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        
        int absN = (n>0 ? n : -n);
        double result = myPow(x, absN/2);
        if (absN%2 == 0)
            result = result * result;
        else
            result = result * result * x;
        
        if (n > 0)
            return result;
        else
            return (1/result);
    }
}
