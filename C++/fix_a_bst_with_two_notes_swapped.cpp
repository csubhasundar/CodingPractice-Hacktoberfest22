//fix a bst with two notes swapped

/*
input
                    20
                60      80
              4    10  8    100
output
                    20
                8       80
              4    10   20   100  





*/

#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int key;
    struct Node *left;
    struct Node *right;
    Node(int k)
    {
        key = k;
        left = right = NULL;
    }
};
void inorder(Node *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        cout << root->key << " ";
        inorder(root->right);
    }
}

Node *prevv = NULL, *first = NULL, *second = NULL;
void fixBST(Node *root)
{
    if (root == NULL)
    {
        return;
    }
    fixBST(root->left);
    if (prevv != NULL && root->key < prevv->key)
    {
        if (first == NULL)
        {
            first = prevv;
        }
        second = root;
    }
    prevv = root;
    fixBST(root->right);
}
int main()
{

    Node *root = new Node(18);
    root->left = new Node(60);
    root->right = new Node(70);
    root->left->left = new Node(4);
    root->right->left = new Node(8);
    root->right->right = new Node(80);

    inorder(root);
    cout << endl;
    fixBST(root);
    int temp = first->key;
    first->key = second->key;
    second->key = temp;
    inorder(root);

    return 0;
}
