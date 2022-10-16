#include <stdio.h>
#define size 4
int arr[size];
int top = -1;

void push(int element)
    {
        
        if (size - top > 1)
        {
            top++;
            arr[top] = element;
        }
        else
        {
            printf("Stack overflow\n");
        }
        
    }

void pop()
    {
        if (top == -1)
            printf("Stack underflow\n");
        else
        {
            top--;
            printf("Item popped\n");
        }
    }

    void display()
    {
        if(top == -1)
        {
            printf("Stack is Empty\n");
        }
        for (int i = 0; i <= top; i++)
            printf("%d ", arr[i]);
        printf("\n");
    }
    
    int peek()
    {
        if (top >= 0)
            return arr[top];

        else
        {
            printf("Stack is empty\n");
            return -1;
        }
    }

int main()
{
    
    int ch, element;

    do
    {

        printf( "1. Push()\n" );
        printf( "2. Pop()\n" );
        printf( "3. Display\n" );
        printf("4. Peek()\n");
        printf( "5. Exit\n" );
        printf("Enter your Choice: ");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
            printf("Enter the element: ");
            scanf("%d", &element);
            push(element);
            break;

            case 2: pop();
            break;
            case 3: display();
            break;

            case 4: printf("The top element of the stack is %d\n",peek()); 
            break;

            case 5:
            break;

            default:
            printf( "Wrong choice" );
        }
    } while (ch!=5);
    return 0;
}
