struct Node
{
	int data;
	Node* next;
	
	Node(int x){
	    data = x;
	    next = NULL;
	}
	
};
 

class Solution{
  public:
    //Function to merge K sorted linked list.
    Node * mergeKLists(Node *arr[], int K)
    {
           if(K==0)
           return NULL;
           vector<pair<int , Node*>> a;
           for(int i=0;i<K;i++)
           {
               Node* n=arr[i];
               while(n!=NULL)
               {
                   a.push_back({n->data,n});
                   n=n->next;
               }
           }
           if(a.size()==0)
           return NULL;
           
           sort(a.begin(),a.end());
           for(int i=0;i<a.size()-1;i++)
           {
               a[i].second->next=a[i+1].second;
           }
           a[a.size()-1].second->next=NULL;
           return a[0].second;
    }
};
