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
N sums(N res, N a, N b){
    if(a==NULL || b==NULL){
        return NULL;
    }
    N one_ptr, two_ptr;
    N sum, prev;
    while(one_ptr!=NULL || two_ptr!=NULL){
        int s=sum->val+one_ptr->val+two_ptr->val;
        sum->val=s%10;
        res=sum;
        if(s/10>=0){
            N carry;
            carry->val+=1;
            carry->next=NULL;
            sum->next=carry;
        }
        one_ptr=one_ptr->next;
        two_ptr=two_ptr->next;
        sum->next=NULL;
    }
    if(one_ptr==NULL){
        while(two_ptr!=NULL){
            res->val+=two_ptr->val;
            two_ptr=two_ptr->next;
        }
    }
    else if(two_ptr==NULL){
        while(one_ptr!=NULL){
            res->val+=one_ptr->val;
            one_ptr=one_ptr->next;
        }
    }
    return res;
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
    res=sums(res, one, two);
    rev(res);
    res=dis(res);
    // dis(one);
    // for(int i=0; i<n; i++){
    //     two=add(two, scanf("%d", &n));
    // }


    return 0;
}