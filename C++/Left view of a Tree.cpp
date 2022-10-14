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
void leftview(Node *node)
{
    if(node==NULL)
    {
        return;
    }
    queue<Node*>q ;
    q.push(node);
    while(!q.empty()){
        int n=q.size();
        for(int i=0;i<n;i++)
        {
            Node *temp=q.front();
            q.pop();
            if(i==0)
            {
                cout<<temp->data<<" ";
                
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
    }
}
int main(){
	
	Node *root=new Node(20);
	root->left=new Node(70);
	root->right=new Node(90);
	root->left->left=new Node(40);
	root->left->left->left=new Node(80);
	root->right->right=new Node(60);
	leftview(root);
}
