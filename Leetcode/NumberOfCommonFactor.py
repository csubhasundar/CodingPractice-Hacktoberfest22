#python solution
class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        n = []
        for i in range(1, min(a,b)+1):
            if a%i==b%i==0:
                n.append(i)
                
        return len(n)
        
