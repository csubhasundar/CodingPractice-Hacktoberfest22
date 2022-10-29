#include <bits/stdc++.h>
using namespace std;
//hard level
//it is nothing but farthest node from the given leaf

//the farthest node must be reachable through one of the ancestor 
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

int res = 0;
int burnTime(Node *root, int leaf, int &dist)
{
    if (root == NULL)
    {
        return 0;
    }
    if (root->key == leaf)
    {
        dist = 0;
        return 1;
    }
    int ldist = -1, rdist = -1;
    int lh = burnTime(root->left, leaf, ldist);
    int rh = burnTime(root->right, leaf, rdist);
    if (ldist != -1)
    {
        dist = ldist + 1;
        res = max(res, dist + rh);
    }
    else if (rdist != -1)
    {
        dist = rdist + 1;
        res = max(res, dist + lh);
    }
    return max(lh,rh)+1;
}

int main()
{

    Node *root = new Node(10);
    root->left = new Node(20);
    root->right = new Node(30);
    root->left->left = new Node(40);
    root->left->right = new Node(50);
    root->left->left->left = new Node(60);
    root->left->left->left->left = new Node(70);
    int dist = -1;
    int leaf = 50;
    burnTime(root, leaf, dist);
    cout << res;
}
/*
                    10
                  /    \
                20      30
               /   \
            40      50
           /
        60
       /
    70
*/
