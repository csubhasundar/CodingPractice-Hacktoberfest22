#include <iostream>
#include <cstdlib>
using namespace std;
#define s_size 20
#define q_size 20

class stack
{
    int top;
    int *a;
public:
    stack();
    int push(int);
    int pop();
    void display();
    int is_empty();
    int is_full();
};

class queue
{

    int front;
    int rear;
    int *b;

public:
  
    queue();
    int enqueue(int);
    int dequeue();
    void display_queue();
    int isfull();
    int isempty();
};
 stack :: stack()
{
    top = -1;
    a = new int[s_size];
}


int stack ::is_empty()
{
    if (top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int stack ::is_full()
{
    if (top == s_size - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int stack ::push(int d)
{
    if (is_full())
    {
        cout << "Stack Overflow..!!" << endl;
        return 0;
    }
    else
    {
        top++;
        a[top] = d;
    }
}

int stack ::pop()
{
    int d;
    if (is_empty())
    {
        cout << "Stack is Empty,cannot pop the elements." << endl;
        return 0;
    }
    else
    {

        d = a[top];
        top--;
        return d;
    }
}

void stack ::display()
{
    if (is_empty() == 1)
    {
        cout << "Stack is Empty..!!" << endl;
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            cout << a[i] << endl;
        }
    }
    cout << endl;
}

queue ::queue()
{
    front = -1;
    rear = -1;
    b = new int[q_size];
}
int queue ::isempty()
{
    if ((front == -1 && rear == -1) || front > rear)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int queue::isfull()
{
    if (rear == q_size - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int queue ::enqueue(int data)
{
    if (isempty() == 1)
    {
        
        front = 0;
        rear++;
        b[rear] = data;
        return data;
    }
    else if (rear !=  - 1)
    {
        ++rear;
        b[rear] = data;
        return data;
    }
    else 
    {
        cout << "Queue is full" << endl;
        return 0;
    }
}


int queue ::dequeue()
{
    if (isempty() == 1)
    {
        cout << "Queue is Empty ,Nothing to Dequeue" << endl;
        return 0;
    }
    else if (front == rear)
    {
        int p = b[front];
        front = -1;
        rear = -1;
        return p;
    }
    else

    {
        int p = b[front];
        front++;
        return p;
    }
}

void queue ::display_queue()

{
    if (isempty() == 1)
    {
        cout << "Queue is empty,nothing to display" << endl;
    }
    else
    {
        for (int i = front; i <= rear; i++)
        {
            cout << b[i] << " ";
        }
    }
    cout << endl;
}

int main()
{
    int choice, data, data_store;
    char ch;
    stack s;
    queue t;

    cout << endl;
    cout << "1.Display Stack \n2.Push\n3.pop\n\n4.Display Queue\n5.enqueue\n6.dequeue\n7.exit\n"
         << endl;
    cout << endl;
    while (1)
    {

        cout << "Enter Your Choice : ";
        cin >> choice;

        cout << endl;
        switch (choice)
        {
        case 1:
            s.display();
            break;
        case 2:
            cout << "Enter the data you want to add :" << endl;
            cin >> data;
            s.push(data);
            break;
        case 3:
            data_store = s.pop();
            cout << data_store << " "<< "is Successfully removed " << endl;
            break;
        case 4:
            t.display_queue();
            break;
        case 5:
            cout << "Enter the data you want to add :" << endl;
            cin >> data;
            data_store =t.enqueue(data);
            break;
        case 6:
            data_store = t.dequeue();
                cout << data_store << " " << "is Successfully removed " << endl;
                break;
        case 7:
            exit(0);
        default:
            cout << "Enter a valid Choice !!!!!!" << endl;
            break;
        }
    }
}
