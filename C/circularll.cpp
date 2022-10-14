{
 int data;
 struct node *next;
}node;
void insert(int x);
node *createNode();
node *createNode()
{
 node *temp;
 temp = (node *) malloc(sizeof(node));
 return temp;
}
node *head;
void insert(int x)
{
 node *temp = createNode();
 temp->data = x;
 if(head==NULL)
 {
 head = temp;
 temp->next=temp;
 }
 else
 {
 temp->next=head->next;
 node *ptr = head;
 while(ptr->next->next!=head->next)
 {
 ptr = ptr->next;
 }
 ptr->next->next=temp;
 head = temp;
 }
}
int main()
{
 int a, i, n;
 printf("Enter the number of elements to be inserted in the linked list : ");
 scanf("%d", &n);
 for(i = 1; i<=n; i++)
 {
 printf("Enter the number to be inserted : ");
 scanf("%d", &a);
 insert(a);
 }
}