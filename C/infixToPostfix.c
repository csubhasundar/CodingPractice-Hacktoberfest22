#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct stack
{
	int size;
	int top;
	char *arr;
};

int isEmpty(struct stack *ptr)
{
	
	if(ptr->top == -1)
	{
		//printf("The Stack is empty\n");
		return 1; //True - which means stack is empty
	}
	else
	{
		//printf("The Stack is not empty\n");
		return 0; //False - which means stack is not empty
	}
}

int isFull(struct stack *ptr)
{
	if(ptr->top == ptr->size-1)
	{
		//printf("The Stack is full\n");
		return 1; //True - Stack is full
	}
	else
	{
		//printf("The Stack is not full\n");
		return 0; //False - Stack is not full
	}
}

void push(struct stack *ptr, char val)
{
	if(isFull(ptr))
	{
		printf("Stack Overflow! Cannot push %c to the stack \n", val);
	}
	else
	{
		ptr->top++;
		ptr->arr[ptr->top] = val;
	}
}

char pop(struct stack *ptr)
{
	if(isEmpty(ptr))
	{
		printf("Stack Underflow! Cannot pop from the stack \n");
		return -1; 
	}
	else
	{
		char val = ptr->arr[ptr->top];
		ptr->top--;
		return val;
	}
}

int stackTop(struct stack *ptr)
{
	return ptr->arr[ptr->top];
}

int isOperator(char ch)
{
	if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
	{
		return 1;
	}
	else
	{
		return 0;
	}
}


int precedence(char ch)
{
	if(ch=='*' || ch=='/')
	{
		return 3;
	}
	else if(ch=='+' || ch=='-')
	{
		return 2;
	}
	else
	{
		return 0;
	}
}


char * infixToPostfix(char * infix)
{
	struct stack * sp;
	sp = (struct stack *)malloc(sizeof(struct stack));
	sp->size = 100;
	sp->top = -1;
	sp->arr = (char *)malloc(sp->size * sizeof(char));
	char * postfix = (char *)malloc((strlen(infix)+1) * sizeof(char));
	int i=0; //for infix traversal tracking
	int j=0; // for tracking addition of elements in postfix
	while(infix[i]!='\0')
	{
		if(!isOperator(infix[i]))
		{
			postfix[j] = infix[i];
			j++;
			i++;
		}
		else
		{
			if(precedence(infix[i]) > precedence(stackTop(sp)))
			{
				push(sp, infix[i]);
				i++;
			}
			else
			{
				postfix[j] = pop(sp);
				j++;
			}
		}
	}
	while(!isEmpty(sp))
	{
		postfix[j] = pop(sp);
		j++;
	}
	postfix[j] = '\0'; //it is necessary for the postfix to have a null (\0) at its end so that we can use it as a string
	
	return postfix;
}

int main()
{

	char *infix = "x-y/z-k*d";
	// a-b+t/q
	// a-b
	printf("Postfix is %s \n", infixToPostfix(infix));
	
	
	return 0;
}
