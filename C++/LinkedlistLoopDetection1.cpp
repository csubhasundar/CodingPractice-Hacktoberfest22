#include <bits/stdc++.h>
using namespace std;
//modification of linked list by pointer/refernce
//O(n)
/*dummy node temp
change next of every node to dummy node

*/
struct node
{
    int data;
    node *next;
    node(int x)
    {
        data = x;
        next = NULL;
    }
};
bool isLoop(node *head)
{
    node *temp = new node(0);
    node *curr = head;
    while (curr != NULL)
    {
        if (curr->next == NULL)
        {
            return false;
        }
        if (curr->next == temp)
        {
            return true;
        }
        node *curr_next = curr->next;
        curr->next = temp;
        curr = curr_next;
    }
    return false;
}
int main()
{
    node *head = new node(15);
    head->next = new node(10);
    head->next->next = new node(12);
    head->next->next->next = new node(20);
    head->next->next->next->next = head->next;
    if (isLoop(head))
        cout << "Loop found"<<endl;
    else
        cout << "No Loop"<<endl;
    return 0;
}
