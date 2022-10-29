#include <bits/stdc++.h>
using namespace std;
//insertion and deletion both are big o(1)

struct Node
{
    int data;
    Node *next;
    Node(int x)
    {
        data = x;
        next = NULL;
    }
};
/*
so we are here only storing the address therefore we are using pointer
and if any number repeats it wont affect because the address would be different 

15--10--12--20
    ^--------^
we started traversing and we store the address of elements
AO15,AO10,AO12,AO20 and when we next do the curr->next of 20 it will points to address of 10 which is already stored.


*/
//O(n)time solution but problem is O(n) space
bool isLoop(Node *head)
{
    unordered_set<Node *> s;
    for (Node *curr = head; curr != NULL; curr = curr->next)
    {
        if(s.find(curr)!=s.end()){
            return true;
        }
        s.insert(curr);
    }
    return false;
}
int main()
{
    Node *head = new Node(15);
    head->next = new Node(10);
    head->next->next = new Node(12);
    head->next->next->next = new Node(20);
    head->next->next->next->next = head->next;
    if (isLoop(head))
        cout << "Loop found";
    else
        cout << "No Loop";
    return 0;
}
