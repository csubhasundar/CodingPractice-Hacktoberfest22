#include<iostream>
using namespace std;

class Node
{
    public:
    int data;
    Node* next;

    // ~Node();

};

Node* top;

void push()
{
    int data;

    Node* temp = new Node();

    if(temp == NULL)
    {
        cout << "Not able to push" <<endl;
    }


    cout << "Enter data: ";
    cin >> data;

    temp -> data = data;
    temp -> next = top;
    top = temp;

}

void pop()
{
    Node* temp;

    if(top == NULL)
    {
        cout << "Underflow" << endl;
    }

    else
    {
        temp = top;
        top = top -> next;
        delete temp;
        cout << "Item Popped" << endl;
    }
}

void display()
{
    Node* temp = top;

    if(temp == NULL)
    {
        cout << "Nothing to display" <<endl;
    }
    else
    {
        while(temp != NULL)
        {
            cout << temp -> data << " ";
            temp = temp -> next;
        }
    }
    cout << endl;
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
        cout << "Enter your Choice: " ;
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

            default: cout << "Wrong choice" << endl;
            break;
        }
    } while (ch != 4);
    
    return 0;
}