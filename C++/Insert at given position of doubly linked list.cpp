void addNode(Node *head, int pos, int data)
{
   Node* newnode = new Node(data);
   Node* temp = head;
   int i = 0;
   while( i < pos)
   {
       temp = temp -> next;
       i++;
       
   }
   
   newnode -> next = temp -> next;
   newnode -> prev = temp;
   
   if(temp -> next != NULL)
   {
       temp -> next -> prev = newnode;
   }
   temp -> next = newnode;
   
}
