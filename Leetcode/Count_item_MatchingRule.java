package Leetcode;


import java.util.List;

/*
You are given an array items, where each items[i] = [typei, colori, namei]
describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
 */
public class Count_item_MatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int des=0;
            if (ruleKey.equalsIgnoreCase("type")) des=0;
            else if (ruleKey.equalsIgnoreCase("color")) des=1;
            else if (ruleKey.equalsIgnoreCase("name")) des=2;
            int count=0;
            for (int i=0;i<items.size();i++){
                if (items.get(i).get(des).equalsIgnoreCase(ruleValue))
                    count++;
            }
            return count;
    }
    public static void main(String[] args) {

    }
}
