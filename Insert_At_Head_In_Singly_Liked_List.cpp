#include<iostream>
using namespace std;
class Node
{
    public:
    int data;
    Node *next;
};

void inserthead(Node** head, int data){

    Node* new_node = new Node();
    new_node->data = data;
    new_node->next = *head;
    *head = new_node;
    
    cout << "Inserted Item: " << new_node->data << endl;
}

void display(Node* node){
    
    cout <<" ";
    while(node!=NULL){
        cout << node->data << " "; 
        node = node->next;
    }
    cout << endl;
}

int main(){

    Node* head = NULL;

    inserthead(&head,4);
    inserthead(&head,3);
    inserthead(&head,2);
    display(head); 
    
    return 0;  
}
