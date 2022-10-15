#include<stdio.h>
#include<stdlib.h>

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

int parenthesisMatch(char *exp)// it tells whether the parenthesis is balanced or not, it does not tells about the validity of the expression
{
	int i;
	//Creating and initialising the stack
	struct stack *sp;
	sp->size=100;
	sp->top = -1;
	sp->arr= (char *)malloc(sp->size * sizeof(char));
	for(i=0;exp[i]!='\0';i++)
	{
		if(exp[i] == '(')
		{
			push(sp, '(');
		}
		else if(exp[i] == ')')
		{
			if(isEmpty(sp))
			{
				return 0;
			}
			pop(sp);
		}
	}
	if(isEmpty(sp))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

int main()
{
//	struct stack s;
//	s.size = 80;
//	s.top = -1;
//	s.arr = (int *)malloc(s.size * sizeof(int));
//
//	struct stack *s;
//	s = (struct stack *)malloc(sizeof(struct stack));
//	s->size = 80;
//	s->top = -1;
//	s->arr= (char *)malloc(s->size * sizeof(char));
//	
//	//Pushing an element manually
//	s->arr[0] = 4;
//	s->top++;
//	
//	//Check if stack is empty
//	if(isEmpty(s))
//	{
//		printf("The Stack is Empty\n");
//	}
//	else
//	{
//		printf("The Stack is Not Empty\n");
//	}
	
	char *exp = "((8+1)*(9))";
	if(parenthesisMatch(exp))
	{
		printf("The parenthesis is matching \n");
	}
	else
	{
		printf("The parenthesis is not matching \n");
	}
	
	return 0;
}
