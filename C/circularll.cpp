{
 int data;
 struct node *next;
}node;
void insert(int x);
node *createNode();
node *createNode()
{
 node *curr;
 curr = (node *) malloc(sizeof(node));
 return curr;
}
node *head;
void insert(int x)
{
 node *curr = createNode();
 curr->data = x;
 if(head==NULL)
 {
 head = curr;
 curr->next=curr;
 }
 else
 {
 curr->next=head->next;
 node *ptr = head;
 while(ptr->next->next!=head->next)
 {
 ptr = ptr->next;
 }
 ptr->next->next=curr;
 head = curr;
 }
}
int main()
{
 int a, i, n;
 printf("enter the number of elements you want to insert in the linklist: ");
 scanf("%d", &n);
 for(i = 1; i<=n; i++)
 {
 printf("Enter the number to be inserted : ");
 scanf("%d", &a);
 insert(a);
 }
}
