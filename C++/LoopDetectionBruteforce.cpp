#include <bits/stdc++.h>
using namespace std;

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

void detectandremove(node *head)
{
    node *slow = head, *fast = head;
    while (fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
        if (slow == fast)
        {
            break;
        }
        if (slow != fast)
        {
            return;
        }
        slow = head;
        while (slow->next != fast->next)
        {
            slow = slow->next;
            fast = fast->next;
        }
        fast->next = NULL;
    }
}

int main()
{
    node *head = new node(15);
    head->next = new node(10);
    head->next->next = new node(555);
    head->next->next->next = new node(55);
    head->next->next->next->next = head->next;
    detectandremove(head);
    
    return 0;
}
