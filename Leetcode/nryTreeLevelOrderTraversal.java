// ! Problem Statement:- https://leetcode.com/problems/n-ary-tree-level-order-traversal/submissions/833834831/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int numNodes=q.size();
            for(int i=0;i<numNodes;i++){
                Node n=q.poll();
                if(n!=null){
                    q.addAll(n.children);
                    level.add(n.val);                
                }                
            }
            res.add(level);            
        }
        return res;
        
    }
}