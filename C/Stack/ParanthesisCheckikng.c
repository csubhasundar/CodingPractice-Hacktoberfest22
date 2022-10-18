#include <stdio.h>
#include <stdlib.h>

//Declaration of Stack
struct stack
{
	int size;
	int top;
	char *arr;
};

//Check if the stack is empty or not
int isEmpty(struct stack *ptr)
{
	if(ptr->top == -1)
		return 1;
	else
		return 0;
}

//Check if the stack is full or not
int isFull(struct stack *ptr)
{
	if(ptr->top == ptr->size -1)
		return 1;
	else
		return 0;
}

//Pushing element into the stack
void push(struct stack *ptr, char val)
{
	if(isFull(ptr))
	{
		printf("Stack overflow!can't push any element\n");
	}
	else
	{
		ptr->top ++;
		ptr->arr[ptr->top] == val;
	}
}

//Popping element from the stack
char pop(struct stack *ptr)
{
	if(isEmpty(ptr))
	{
		printf("Stack underflow!Can't pop any element from the stack\n");
	}
	else
	{
		char exp = ptr->arr[ptr->top];
		ptr->top --;
		return exp;
	}
}

//Check if paranthesis is match or not
int paranthesisMatch(char *exp)
{
	// Dynamic allocation of memory for stack 
	struct stack *s = (struct stack *) malloc(sizeof(struct stack));
	s->top = -1;
	s->size = 100;
	s->arr = (char *)malloc(s->size * (sizeof(char)));

	for(int i = 0; exp[i]!='\0'; i++)
	{
		if(exp[i] == '(')
		{
			push(s, '(');
		}
		else if(exp[i] == ')')
		{
			if(isEmpty(s)){
				return 0;
			}
			pop(s);
		}
	}

	if(isEmpty(s))
		return 1;
	else
		return 0;
}

int main()
{
	//char *exp = "((98*(9+1))+(34/(4-3)))";

	char *exp = "(54*(44+54)/(6-8)";

	if(paranthesisMatch(exp))
	{
		printf("The paranthesis is matching\n");
	}
	else
	{
		printf("The paranthesis is not matching\n");
	}

	return 0;
}

/*###################################

Output:
[when exp = "((98*(9+1))+(34/(4-3)))"";]

The paranthesis is matching

[when exp = "(54*(44+54)/(6-8)";]

The paranthesis is not matching

####################################*/