//addition yet to complete
#include<stdio.h>
#include<stdlib.h>

struct node{
    int val;
    struct node *next;
};
typedef struct node* N;

N get()
{
    N x;
    x=(N)malloc(sizeof(struct node));
    if (x==NULL)
    {
        printf("Out of memory");
        exit(0);
    }
    return x;
}

N insr(N f, int b){
    N x=get();
    x->val=b; 
    x->next=NULL;
    if(f==NULL){
        return x;
    }
    N temp=f;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=x;
    return f;
}
N insr1(N f, int b){
    N x=get();
    x->val=b; 
    x->next=NULL;
    if(f==NULL){
        return x;
    }
    N temp=f;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    printf("\n");
    temp->next=x;
    return x;
}
N rev(struct node* f)
{
    N prev = NULL;
    N current = f;
    N next = NULL;
    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    f = prev;
    return (f);
}
N sums(N a, N b){
    if(a==NULL || b==NULL){
        return NULL;
    }
    N head=get();
    int s=a->val + b->val;
    head->val=s%10; head->next=NULL;
    a=a->next; b=b->next;
    N go=insr1(head, s/10);
    while(a!=NULL){
        s=go->val + a->val + b->val;
        go->val= s%10; go->next=NULL;
        go=insr1(head, s/10);
        a=a->next; b=b->next;
    }
    return head;
}
N dis(N f){
    if(f==NULL){
        return f;
    }
    N temp=f;
    while(temp!=NULL){
        printf("%d ", temp->val);
        temp=temp->next;
    }
    printf("\n");
    return f;
}

int main(){
    int n;
    N one=NULL;
    N two=NULL;
    N res=NULL;
    scanf("%d", &n);
    int a[n];
    for(int i=0; i<n; i++){
        scanf("%d", &a[i]);
    }
    for(int i=0; i<n; i++){
        one=insr(one, a[i]);
    }
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        scanf("%d", &a[i]);
    }
    for(int i=0; i<n; i++){
        two=insr(two, a[i]);
    }
    one=rev(one);
    two=rev(two);
    one=dis(one);
    two=dis(two);
    res=sums(one, two);
    res=rev(res);
    res=dis(res);
    return 0;
}