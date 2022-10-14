#include<bits/stdc++.h>
using namespace std;

struct avnode{
int data;
struct avnode * lc;
struct avnode * rc;
};

typedef struct avnode * avptr;

int max(int a, int b)
{
    return (a > b)? a : b;
}
int height(avptr t)
{
    if (t==NULL)
        return 0;
    return max(height(t->lc),height(t->rc))+1;
}

avptr leftrotate(avptr k)
{
    avptr t1=k->rc;
    avptr t2=t1->lc;

    k->rc=t2;
    t1->lc=k;

    return t1;
}

avptr rightrotate(avptr k)
{
    avptr t1=k->lc;
    avptr t2=t1->rc;

    k->lc=t2;
    t1->rc=k;

    return t1;
}

avptr rl(avptr k3,avptr k1,avptr k2)
{
    k3->rc=k2->lc;
    k1->lc=k2->rc;
    k2->lc=k3;
    k2->rc=k1;
    return k2;
}
avptr lr(avptr k3,avptr k1,avptr k2)
{
    k3->lc=k2->rc;
    k1->rc=k2->lc;
    k2->rc=k3;
    k2->lc=k1;
    return k2;
}
void insert(avptr &t,avptr &p,avptr &j,int k,int * r)
{
    if(t==NULL)
    {
        t=new(avnode);
        t->data=k;
        t->lc=NULL;
        t->rc=NULL;
    }
    else if(k<t->data)
    {
        insert(t->lc,p,j,k,r);
    }
    else
    {
        insert(t->rc,p,j,k,r);
    }
   // cout<<t->data<<" h ";
    //if(p!=NULL){cout<<p->data<<" g ";}
    //if(j!=NULL){cout<<j->data<<" k ";}
    //cout<<endl;
    if(t->lc!=NULL || t->rc!=NULL)
    {
        int h1=0,h2=0;
        if(t->lc){h1=height(t->lc);}
        if(t->rc){h2=height(t->rc);}
       // cout<<h1<<" "<<h2;
        if(abs(h1-h2)>1)
        {
            if( (k<p->data && k>t->data))
            {
                t=rl(t,p,j);
            }
            else if((k>p->data && k<t->data))
            {
                t=lr(t,p,j);
            }
            else
            {
                if(t->rc==p){t=leftrotate(t);}
                if(t->lc==p){t=rightrotate(t);}
            }
        }
    }
j=p;
p=t;

//*r+=height(t->rc);
//cout<<t->data<<endl;
}
void lvlorder2(avptr T)
{
    if (T==NULL)
        return;
    queue<avptr> q;
    q.push(T);
    int s=0;
    int j=1;
    while (!q.empty())
    {
        s=0;
        while(j--)
        {
        avptr t=q.front();
        q.pop();
        cout<<t->data<<" ";
        if (t->lc!= NULL)
            {q.push(t->lc);s++;}
        if (t->rc!= NULL)
           {q.push(t->rc);s++;}
        }
        j=s;
        cout<<endl;
    }
}
void inorder(avptr t)
{
    if(t!=NULL)
    {
        inorder(t->lc);
        cout<<t->data<<" ";
        inorder(t->rc);
    }
}
int rotate(avptr &T,int k)
{
    if(k<T->data)
        return rotate(T->lc,k);
    else if(k>T->data)
        return rotate(T->rc,k);
    else
    {
        cout<<T->data<<" "<<height(T->lc)<<endl;
       return height(T->rc);
    }
}
int main()
{
    avptr t=NULL,p=NULL,j=NULL;
    int n;
    cin>>n;
    int res=0;
    while(n!=-1)
    {
        p=NULL;
        j=NULL;
        insert(t,p,j,n,&res);
       // lvlorder2(t);
       res+=rotate(t,n);
        cin>>n;
    }
   // lvlorder2(t);
    //inorder(t);
    cout<<res<<endl;
}


