#include<iostream>
using namespace std;
#define size 5
int front = -1;
int rear = -1;
int queue[size];


bool isEmpty()
{
    if(front == -1 && rear == -1)
        return true;
    else
        return false;
}

bool isFull()
{
    if(rear == size - 1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

void push()
{
    int n;
    cout << "Enter element: ";
    cin >> n;

    if(isFull())
    {
        cout << "Overflow" << endl;
    }

    else
    {
        if(front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            queue[rear] = n;
        }
        else
        {
            rear++;
            queue[rear] = n;
        }
    }
}

void display()
{
    for(int i = front; i <= rear; i++)
    {
        cout << queue[i] << " ";
    }
    cout << endl;
}

void pop()
{
    if(isEmpty())
    {
        cout << "Underflow" <<endl;
    }
    else
    {
        front++;
        if(front == rear + 1)
        {
            front = -1;
            rear = -1;
            cout << "Queue is empty " << endl;
        }
    }
}

int main()
{
    int ch;
    do
    {
        cout << "1. Push()" << endl;
        cout << "2. Pop()" << endl;
        cout << "3. Display" << endl;
        cout << "4. Exit" << endl;
        cout << "Enter your Choice: ";
        cin >> ch;
        switch(ch)
        {
            case 1: push();
            break;

            case 2: pop();
            break;

            case 3: display();
            break;

            case 4:
            break;

            default: cout << "Wrong Choice" << endl;
            break;
        }

    }while(ch != 4);
    return 0;
}