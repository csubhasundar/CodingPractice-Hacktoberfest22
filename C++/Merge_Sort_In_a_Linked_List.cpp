#include <iostream>

class Node
{
public:
	int data;
	Node *next;
	Node(int data)
	{
		this->data = data;
		this->next = NULL;
	}
};

using namespace std;

Node *takeinput()
{
	int data;
	cin >> data;
	Node *head = NULL, *tail = NULL;
	while (data != -1)
	{
		Node *newnode = new Node(data);
		if (head == NULL)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail->next = newnode;
			tail = newnode;
		}
		cin >> data;
	}
	return head;
}
Node *mergeTwoSortedLinkedLists(Node *head1, Node *head2)
{
    Node *head = NULL;
    Node *node1 = head1;
    Node *node2 = head2;
    Node *mainhead = NULL;
    if (node1 == NULL && node2 == NULL)
    {
        return head;
    }
    if (node1 != NULL && node2 == NULL)
    {
        return head1;
    }
    if (node1 == NULL && node2 != NULL)
    {
        return head2;
    }
    if (node1->data <= node2->data)
    {
        head = node1;
        node1 = node1->next;
        mainhead = head;
    }
    else
    {
        head = node2;
        node2 = node2->next;
        mainhead = head;
    }
    while (node1 != NULL && node2 != NULL)
    {
        if (node1->data <= node2->data)
        {
            head->next = node1;
            head = node1;
            node1 = node1->next;
        }
        else
        {
            head->next = node2;
            head = node2;
            node2 = node2->next;
        }
    }
    if (node1 == NULL && node2 != NULL)
    {
        head->next = node2;
        head = node2;
    }
    if (node2 == NULL && node1 != NULL)
    {
        head->next = node1;
        head = node1;
    }
    return mainhead;
}
Node *midPoint(Node *head)
{
    if (head == NULL)
    {
        return head;
    }
    Node *slow = head;
    Node *fast = head->next;
    while (fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }
    return slow;
}
void print(Node *head)
{
	Node *temp = head;
	while (temp != NULL)
	{
		cout << temp->data << " ";
		temp = temp->next;
	}
	cout << endl;
}
Node* mergeSort(Node*head){
	if(head == NULL || head->next == NULL){
        return head;
    }
	Node* previousToMiddle = midPoint(head);
    Node* mid = previousToMiddle->next;
    previousToMiddle->next = NULL;
    Node* left = mergeSort(head);
    Node* right = mergeSort(mid);
    return mergeTwoSortedLinkedLists(left, right);
}

int main()
{
	int t;
	cin >> t;

	while (t--)
	{
		Node *head = takeinput();
		head = mergeSort(head);
		print(head);
	}

	return 0;
}
