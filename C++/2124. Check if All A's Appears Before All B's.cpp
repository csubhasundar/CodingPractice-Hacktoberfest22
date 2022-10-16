class Solution {
public:
     bool checkString(string s) {
         int count1 = 0;
         
         for(int i = 0; i<s.length();i++)
         {
             if(s[i] == 'a')
                 count1++;
         }
         
         if(count1 == 0 || count1 == s.length())
             return true;
         int j = 0;
         int count2 = 0;
         while(s[j] != 'b')
         {
             count2++;
             j++;
         }
         
         if(count2 == count1)
             return true;
         return false;
     }
};
