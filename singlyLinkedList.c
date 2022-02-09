#include<stdio.h>
#include<stdlib.h>

struct node{
	int info;
	struct node *link;
};

typedef struct node* NODE;

NODE insert_front(int item, NODE first){
	NODE newnode;
	newnode = (NODE)malloc(sizeof(struct node));
	if(newnode == NULL){
		printf("Out of memory\n");
		exit(1);
	}
	newnode->info = item;
	newnode->link = first;
	return newnode;
}

NODE insert_rear(int item, NODE first){
	NODE newnode;
	NODE last;
	newnode = (NODE)malloc(sizeof(struct node));
	if(newnode == NULL){
		printf("Out of Memory\n");
		exit(1);
	}
	
	newnode->info = item;
	newnode->link = NULL;
	
	if(first==NULL){
		return newnode;
	}

	last = first;
	while(last->link!=NULL){
		last=last->link;
	}
	last->link = newnode;
	return first;
}

NODE delete_front(NODE first){
	if(first == NULL){
		printf("\nList is Empty");
		return first;
	}
	NODE temp;
	temp = first;
	first = first->link;
	printf("\nNode deleted is : %d\n",temp->info);
	free(temp);
	return first;	
}

NODE delete_rear(NODE first){
	NODE pred,last;
	if(first==NULL){
		printf("\nList is Empty.");
		return first;
	}	
	
	if(first->link==NULL){
		printf("\nDeleted node is %d\n",first->info);
		free(first);
		return first;
	}
	pred = NULL;
	last = first;

	while(last->link!=NULL){
		pred =last;
		last=last->link;
	}
	
	printf("\nThe item deleted is %d\n",last->info);
	free(last);
	pred->link=NULL;
	return first;
}
int display(NODE first){
	NODE temp;
	if(first== NULL){
		printf("\nList is Empty");
		return 0;
	}	
	printf("\nThe contents of the Linked List: \n");
	temp = first;
	while(temp!=NULL){
		printf("%d\t", temp->info);
		temp=temp->link;
	}
}

int main(){
	NODE first = NULL;
	int input,item;
	for(;;){
		printf("\n1 To Insert_front");
		printf("\n2 To Insert_rear");
		printf("\n3 To Delete_front");
		printf("\n4 To Delete_rear");
		printf("\n5 To Display");
		printf("\n6 To Exit");
		printf("\nEnter the Choice : ");
		scanf("%d",&input);
		switch(input){
			case 1:{
				printf("\nEnter the item to be inserted at front : ");
				scanf("%d",&item);
				first = insert_front(item, first);
				display(first);
			}
				break;
			case 2:{
				printf("\nEnter the item to be inserted at rear : ");
				scanf("%d",&item);
				first=insert_rear(item,first);
				display(first);
			}	
				break;
			case 3:{
				first = delete_front(first);
				display(first);
			}
				break;
			case 4:{
				first = delete_rear(first);
				display(first);
			}
			case 5:{
				display(first);
			}
				break;
			case 6:{
				exit(1);
			}
			default:	printf("\nInvalid Choice.");
				continue;
		}
	}	
}