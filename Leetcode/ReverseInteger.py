# This is for reversing an integer medium rated leet code solution answer well written and easily understood


class Solution:
    def reverse(self, x: int) -> int:
        if x < 0:
            mul = -1
        else:
            mul = 1
        temp = abs(x)
        sum_tot = 0
        while temp > 0:
            ld = temp%10
            sum_tot = sum_tot*10 +  ld
            temp = int(temp/10)
        if mul*sum_tot < -1*pow(2,31) or mul*sum_tot > pow(2,31)-1:
            return 0
        return mul*sum_tot
        
        