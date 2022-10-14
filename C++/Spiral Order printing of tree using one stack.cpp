#include<bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
    Node(int val)
    {
        data=val;
        left=right=NULL;
        
    }
    
};
void spiralview(Node *node)
{
    if(node==NULL){
        return;
    }
    queue<Node*>q;
    stack<Node*>s;
    q.push(node);
    int left_to_right=true;
    while(!q.empty())
    {
        int n=q.size();
        for(int i=0;i<n;i++)
        {
            Node *temp=q.front();
            q.pop();
            if(left_to_right){
                cout<<temp->data<<" ";
            }
            else{
                s.push(temp);
            }
            if(temp->left!=NULL)
            {
                q.push(temp->left);
            }
            if(temp->right!=NULL)
            {
                q.push(temp->right);
            }
        }
        if(left_to_right==false){
            while(!s.empty())
            {
                Node *v=s.top();
                s.pop();
                cout<<v->data<<" ";
            }
            
        }
        left_to_right=!left_to_right;
    }
}
int main()
{
    
	Node *root=new Node(20);
	root->left=new Node(70);
	root->right=new Node(90);
	root->left->left=new Node(40);
	root->left->left->left=new Node(80);
	root->right->right=new Node(60);
	spiralview(root);
	return 0;

}
