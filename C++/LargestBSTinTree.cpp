#include <bits/stdc++.h>
using namespace std;
#define MAX_HEIGHT 100000

struct Node {
    int data;
    Node* left;
    Node* right;
};

Node* newNode(int val) {
    Node* temp = new Node;
    temp->data = val;
    temp->left = NULL;
    temp->right = NULL;

    return temp;
}

Node* buildTree(string str) {
    if (str.length() == 0 || str[0] == 'N') return NULL;
    vector<string> ip;
    istringstream iss(str);
    for (string str; iss >> str;) ip.push_back(str);
    Node* root = newNode(stoi(ip[0]));
    queue<Node*> queue;
    queue.push(root);
    int i = 1;
    while(!queue.empty() && i < ip.size()) {
        Node* currNode = queue.front();
        queue.pop();
        string currVal = ip[i];
        if(currVal != "N") {
            currNode->left = newNode(stoi(currVal));
            queue.push(currNode->left);
        }
        i++;
        if (i >= ip.size()) break;
        currVal = ip[i];
        if (currVal != "N") {
            currNode->right = newNode(stoi(currVal));
            queue.push(currNode->right);
        }
        i++;
    }

    return root;
}

class Solution{
public:
    int ans;
    pair<int,pair<int,int>> solve(Node* root) {
        if(!root)
            return {0,{INT_MAX,INT_MIN}};
        auto l=solve(root->left);
        auto r=solve(root->right);
        if(l.second.second<root->data && r.second.first>root->data && l.first!=-1 && r.first!=-1) {
            int sz=l.first+r.first+1;
            ans=max(ans,sz);
            int k=root->data;
            return {sz,{min(k,l.second.first),max(k,r.second.second)}};
        }
        return {-1,{INT_MAX,INT_MIN}};
    }
    
    int largestBst(Node *root) {
    	ans=0;
    	solve(root);
    	return ans;
    }
};

int main() {
      string s, ch;
      getline(cin, s);

      Node* root = buildTree(s);
      Solution ob;
      cout << ob.largestBst(root) << endl;
    return 0;
}
