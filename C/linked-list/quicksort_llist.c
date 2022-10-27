#include <stdio.h>
#include <stdlib.h>

// Creating structure
struct Node {
	int data;
	struct Node* next;
};

// Add new node at end of linked list
void insert(struct Node** head, int value)
{
	// Create dynamic node
	struct Node* node
		= (struct Node*)malloc(sizeof(struct Node));
	if (node == NULL) {
		// checking memory overflow
		printf("Memory overflow\n");
	}
	else {
		node->data = value;
		node->next = NULL;
		if (*head == NULL) {
			*head = node;
		}
		else {
			struct Node* temp = *head;

			// finding last node
			while (temp->next != NULL) {
				temp = temp->next;
			}

			// adding node at last position
			temp->next = node;
		}
	}
}

// Displaying linked list element
void display(struct Node* head)
{
	if (head == NULL) {
		printf("Empty linked list");
		return;
	}
	struct Node* temp = head;
	printf("\n Linked List :");
	while (temp != NULL) {
		printf(" %d", temp->data);
		temp = temp->next;
	}
}

// Finding last node of linked list
struct Node* last_node(struct Node* head)
{
	struct Node* temp = head;
	while (temp != NULL && temp->next != NULL) {
		temp = temp->next;
	}
	return temp;
}

// We are Setting the given last node position to its proper
// position
struct Node* parition(struct Node* first, struct Node* last)
{
	// Get first node of given linked list
	struct Node* pivot = first;
	struct Node* front = first;
	int temp = 0;
	while (front != NULL && front != last) {
		if (front->data < last->data) {
			pivot = first;

			// Swapping node values
			temp = first->data;
			first->data = front->data;
			front->data = temp;

			// Visiting the next node
			first = first->next;
		}

		// Visiting the next node
		front = front->next;
	}

	// Change last node value to current node
	temp = first->data;
	first->data = last->data;
	last->data = temp;
	return pivot;
}

// Performing quick sort in the given linked list
void quick_sort(struct Node* first, struct Node* last)
{
	if (first == last) {
		return;
	}
	struct Node* pivot = parition(first, last);

	if (pivot != NULL && pivot->next != NULL) {
		quick_sort(pivot->next, last);
	}

	if (pivot != NULL && first != pivot) {
		quick_sort(first, pivot);
	}
}

// Driver's code
int main()
{
	struct Node* head = NULL;

	// Create linked list
	insert(&head, 41);
	insert(&head, 5);
	insert(&head, 7);
	insert(&head, 22);
	insert(&head, 28);
	insert(&head, 63);
	insert(&head, 4);
	insert(&head, 8);
	insert(&head, 2);
	insert(&head, 11);
	printf("\n Before Sort ");
	display(head);

	// Function call
	quick_sort(head, last_node(head));
	printf("\n After Sort ");
	display(head);
	return 0;
}
