#include <stdio.h>
#include<stdlib.h>
#include<process.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *top;

void push()
{
    int val;
    struct Node *temp = (struct Node *)malloc(sizeof(struct Node));

    if (temp == NULL)
    {
        printf("Not able to push\n");
    }

    printf("Enter the data ");
    scanf("%d", &val);

    temp->data = val;
    temp->next = top;
    top = temp;

    printf("Item Pushed\n");
}

void pop()
{
    struct Node* temp;

    if(top == NULL)
    {
        printf("Underflow\n");
    }
    else
    {
        temp = top;
        top = top -> next;
        free(temp);
        printf("Item popped\n");
    }
}

void display()
{
    struct Node* temp = top;
    if(temp == NULL)
    {
        printf("Empty Stack\n");
    }
    else
    {
    while(temp != NULL)
    {
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    }
    printf("\n");
}

int main()
{
    int ch;

    do
    {
        printf("1. Push()\n");
        printf("2. Pop()\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter ypur choice: \n");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            push();
            break;

        case 2:
            pop();
            break;

        case 3:
            display();
            break;

        case 4:
            exit(0);
            break;

        default:
            printf("Wrong choice");
            break;
        }
    } while (ch != 4);
}
