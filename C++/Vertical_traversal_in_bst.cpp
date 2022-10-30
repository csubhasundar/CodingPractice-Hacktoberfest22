#include <bits/stdc++.h>
using namespace std;

/*
1- create an empty map "map"
2- do level order traversal and put nodes into the map
3- Now traverse the map and print contents

*/

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

void vTraversal(Node *root)
{
    map<int, vector<int>> mp;   //hd is key nd vector as value
    queue<pair<Node *, int>> q; //a node and horrizontal distance
    q.push({root, 0});      // simply assigning 0 to the root value
    while (q.empty() == false)  //till the queue isn't empty 
    {
        auto p = q.front(); 
        Node *curr = p.first;        //  pair's first value
        int hd = p.second;           //  pair's second value
        mp[hd].push_back(curr->key); //  mapping the horrizontal distance with the current key 
        q.pop();                     
        if (curr->left != NULL)
        {
            q.push({curr->left, hd - 1});
        }
        if (curr->right != NULL)
        {
            q.push({curr->right, hd + 1});
        }
        for (auto x : mp)
        {
            for (int y : x.second)
                cout << y << " ";
            cout << endl;
        }
    }
}

int main()
{

    Node *root = new Node(10);
    root->left = new Node(20);
    root->right = new Node(30);
    root->left->left = new Node(40);
    root->left->right = new Node(50);

    vTraversal(root);

    return 0;
}

/*
curr = 10   hd = 0
mp = { (0 , {10})}
(20,-1) (30,1)

curr = 20 hd = -1
mp = { (0 , {10})   (-1,{20})}
now enquing left and right children
(30, 1) (40,-2) (50,0)
*/
