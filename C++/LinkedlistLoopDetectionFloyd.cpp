/*
we begin with two pointers namely slow and fast both are at head
move slow by one and fast by two
then if there is any loop in linked list then fast and slow both will meet 
if there arent then fast will reach null or the next of fast is null

*/
#include <bits/stdc++.h> 
using namespace std; 

struct Node{
    int data;
    Node* next;
    Node(int x){
        data=x;
        next=NULL;
    }
};

bool isLoop(Node*head){
    Node*slow = head,*fast = head;
    while(fast!=NULL && fast->next!=NULL){
        slow = slow->next;
        fast = fast->next->next;
        if(slow==fast){
            return true;
        }
    }
    return false;
}

